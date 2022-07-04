function a=genRandomPolynomial(q,d)
    
    %生成随机系数矩阵
    A=round(q*rand(d));
    
    %随机选取其中一行作为系数
    a=myMod(A(round(rand()*d),:),q);
end