function pk=genPublicKey(q,d,s,D)
    pk=zeros(2,length(s));

    %随机生成一个多项式，用于生成公钥
    a=myMod(randsample(q+1,d)'-1,q);
    
    %生成密文空间内的随机多项式
    a=genRandomPolynomial(q,d);
    
    %生成噪声多项式e
    e=genNoisePolynomial(d);
    
    pk(1,:)=BFV_multi(-a,s,D,q)+e;
    
    pk(2,:)=a;
    
end