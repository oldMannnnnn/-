function m=Encode(message,D,delta)
%     ������Ϣ���ȣ���ȡ����ʽģ���ȡ�
    [n,m]=size(message);
    X=myRoot(roots(D));
    Y=message;
    
    m=round(sym2poly(simplify(myLagrange(X,Y,delta))));
end