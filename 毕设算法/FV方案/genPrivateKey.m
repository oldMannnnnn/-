function s=genPrivateKey(d)
    rand('state',sum(100*clock));
    %�������0��1��-1����
    S=ceil(3*rand(d))-2;
    
    %���ѡȡ����һ����Ϊ˽Կ
    s=S(round(7),:);
end