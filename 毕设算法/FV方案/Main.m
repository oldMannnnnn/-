clear
clc


%基础参数
d=30;
t=2048;
q=t*1280;



%多项式模
D=genPolynomial(d);

siyao=zeros(1,100);
gongyao=zeros(1,100);
jiami=zeros(1,100);
qiuhe=zeros(1,100);
jiemi=zeros(1,100);

for i=1:100

%随机生成私钥s
tempTime=cputime;
s=genPrivateKey(d);
siyao(i)=cputime-tempTime;
% s=[0 -1 -1  1  0  1  1 -1 -1 -1  1  0 -1  1 -1 -1  1  0 -1 -1];
% disp(['随机生成的私钥为：  ',num2str(s)])

%生成公钥
tempTime=cputime;
pk=genPublicKey(q,d,s,D);
gongyao(i)=cputime-tempTime;
% disp(['公钥pk0为：   ',num2str(pk(1,:))])
% disp(['公钥pk1为：   ',num2str(pk(2,:))])


%------------------------消息m------------------------
m=[0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1];
% m1=myMessage(d);
% m2=myMessage(d);
%m3=myMessage(d);
% disp('消息m为：')
%-----------------------------------------------------


%加密过程------------------------------------------
%Dec(pk,q,t)

% disp('加密后的多项式为：')
tempTime=cputime;
ct1=Enc(pk,q,t,d,D,m);
jiami(i)=cputime-tempTime;
% ct2=Enc(pk,q,t,d,D,m2);
%ct3=Enc(pk,q,t,d,D,m3);

%加法运算
tempTime=cputime;
ct = myMod(ct1+ct1,q);
qiuhe(i)=cputime-tempTime;
%ct = [myMod(BFV_multi(ct1(1,:),ct2(1,:),D,q),q);myMod(BFV_multi(ct1(2,:),ct2(2,:),D,q),q)]

%解密过程
tempTime=cputime;
m1=Dnc(ct,q,t,D,s);
jiemi(i)=cputime-tempTime;
%m2=Dnc(ct2,q,t,D,s)
%m3=Dnc(ct3,q,t,D,s)

%加法解密
%m=Dnc(ct1,q,t,D,s);

%乘法解密
%m=Dnc_multi(ct,q,t,D,s)


end
1

