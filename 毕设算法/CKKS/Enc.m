function ct=Enc(pk,q,t,d,D,m)
    %���ܹ���


    %�������������������ʽ��һ����0��1��-1������ʽ
    %����������ʽ�����꼴����
    e1=genNoisePolynomial(d)
    %e1=[-3 3 0 2 -2 -3 2 -3 -4 5 -1 -2 1 4 -4 -1 3 -3 2 -3]
    
    e2=genNoisePolynomial(d)
    %e2=[-1 3 1 3 -1 -4 0 1 1 -1 -3 2 -3 -3 4 -3 1 4 3 -2]
    
    u=genPrivateKey(d)
    %u=[1 1 1 -1 0 -1 1 -1 0 -1 1 1 -1 1 -1 1 -1 1 1 1 ]

    
    ct0=BFV_multi(pk(1,:),u,D,q)+e1+conv(m,q)/t;
    ct1=BFV_multi(pk(2,:),u,D,q)+e2;
    ct=[round(ct0);round(ct1)];
end