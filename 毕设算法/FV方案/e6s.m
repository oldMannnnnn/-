% 参数说明
% q：多项式系数模
% d：模多项式的次数
% m：自定义实验的次数
% n：同态加法次数

function res=e6s(q,d,m,n)
    %声明临时变量，用于存储多次实验的结果
    res=zeros(d,n);
    %私钥s
    s=genPrivateKey(d);
    %模多项式D
    D=genPolynomial(d);
    for i=1:m
        %声明临时变量，存储一次的计算结果
        temp_res=zeros(1,d);
        for j=1:n
            %模拟多次加法的操作
            temp_res = temp_res+genNoisePolynomial(d);
        end
        
        temp_res=BFV_multi(temp_res,s,D,q);
        
        %将结果存储到res中去
        res(:,i)=temp_res';
    end
end