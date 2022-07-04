function pk=genPublicKey(q,d,s,D)
    pk=zeros(2,length(s));

    %随机生成一个多项式，用于生成公钥
    a=myMod(randsample(q+1,d)'-1,q);
    
    %生成密文空间内的随机多项式
    a=genRandomPolynomial(q,d);
    %a=[6232991     4468759     8071583    -9205735     2480145     7880745      664117   -10042664      700992     6068675     1080889     4403536   -11676926    -5038114    -6847784      389783 8303932     7824347   -10936607     8220445];
   
    
    %生成噪声多项式e
    e=genNoisePolynomial(d);
    %e=[0 5 1 1 4 3 -1 -1 -1 -3 -4 2 3 2 3 0 0 -2 2 3];
    
    
    pk(1,:)=BFV_multi(-a,s,D,q)+e;
    
    pk(2,:)=a;
    
end