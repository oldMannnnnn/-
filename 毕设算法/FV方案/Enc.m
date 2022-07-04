function ct=Enc(pk,q,t,d,D,m)
    %加密过程
    %随机生成两个噪声多项式和一个（0，1，-1）多项式
    %这三个多项式，用完即丢弃
    e1=genNoisePolynomial(d);
    
    e2=genNoisePolynomial(d);
    
    u=genPrivateKey(d);
    ct0=BFV_multi(pk(1,:),u,D,q)+e1+conv(m,q)/t;
    ct1=BFV_multi(pk(2,:),u,D,q)+e2;
    ct=[round(ct0);round(ct1)];
end