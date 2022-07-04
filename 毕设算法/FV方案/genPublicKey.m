function pk=genPublicKey(q,d,s,D)
    pk=zeros(2,length(s));

    %�������һ������ʽ���������ɹ�Կ
    a=myMod(randsample(q+1,d)'-1,q);
    
    %�������Ŀռ��ڵ��������ʽ
    a=genRandomPolynomial(q,d);
    
    %������������ʽe
    e=genNoisePolynomial(d);
    
    pk(1,:)=BFV_multi(-a,s,D,q)+e;
    
    pk(2,:)=a;
    
end