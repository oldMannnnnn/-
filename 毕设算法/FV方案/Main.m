clear
clc


%��������
d=30;
t=2048;
q=t*1280;



%����ʽģ
D=genPolynomial(d);

siyao=zeros(1,100);
gongyao=zeros(1,100);
jiami=zeros(1,100);
qiuhe=zeros(1,100);
jiemi=zeros(1,100);

for i=1:100

%�������˽Կs
tempTime=cputime;
s=genPrivateKey(d);
siyao(i)=cputime-tempTime;
% s=[0 -1 -1  1  0  1  1 -1 -1 -1  1  0 -1  1 -1 -1  1  0 -1 -1];
% disp(['������ɵ�˽ԿΪ��  ',num2str(s)])

%���ɹ�Կ
tempTime=cputime;
pk=genPublicKey(q,d,s,D);
gongyao(i)=cputime-tempTime;
% disp(['��Կpk0Ϊ��   ',num2str(pk(1,:))])
% disp(['��Կpk1Ϊ��   ',num2str(pk(2,:))])


%------------------------��Ϣm------------------------
m=[0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1];
% m1=myMessage(d);
% m2=myMessage(d);
%m3=myMessage(d);
% disp('��ϢmΪ��')
%-----------------------------------------------------


%���ܹ���------------------------------------------
%Dec(pk,q,t)

% disp('���ܺ�Ķ���ʽΪ��')
tempTime=cputime;
ct1=Enc(pk,q,t,d,D,m);
jiami(i)=cputime-tempTime;
% ct2=Enc(pk,q,t,d,D,m2);
%ct3=Enc(pk,q,t,d,D,m3);

%�ӷ�����
tempTime=cputime;
ct = myMod(ct1+ct1,q);
qiuhe(i)=cputime-tempTime;
%ct = [myMod(BFV_multi(ct1(1,:),ct2(1,:),D,q),q);myMod(BFV_multi(ct1(2,:),ct2(2,:),D,q),q)]

%���ܹ���
tempTime=cputime;
m1=Dnc(ct,q,t,D,s);
jiemi(i)=cputime-tempTime;
%m2=Dnc(ct2,q,t,D,s)
%m3=Dnc(ct3,q,t,D,s)

%�ӷ�����
%m=Dnc(ct1,q,t,D,s);

%�˷�����
%m=Dnc_multi(ct,q,t,D,s)


end
1

