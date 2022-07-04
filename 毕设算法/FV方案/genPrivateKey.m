function s=genPrivateKey(d)
    rand('state',sum(100*clock));
    %生成随机0，1，-1矩阵
    S=ceil(3*rand(d))-2;
    
    %随机选取其中一行作为私钥
    s=S(round(7),:);
end