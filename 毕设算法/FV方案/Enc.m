function ct=Enc(pk,q,t,d,D,m)
    %���ܹ���
    %�������������������ʽ��һ����0��1��-1������ʽ
    %����������ʽ�����꼴����
    e1=genNoisePolynomial(d);
    
    e2=genNoisePolynomial(d);
    
    u=genPrivateKey(d);
    ct0=BFV_multi(pk(1,:),u,D,q)+e1+conv(m,q)/t;
    ct1=BFV_multi(pk(2,:),u,D,q)+e2;
    ct=[round(ct0);round(ct1)];
end