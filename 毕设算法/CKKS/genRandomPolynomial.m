function a=genRandomPolynomial(q,d)
    
    %�������ϵ������
    A=round(q*rand(d));
    
    %���ѡȡ����һ����Ϊϵ��
    a=myMod(A(round(rand()*d),:),q);
end