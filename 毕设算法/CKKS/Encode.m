function m=Encode(message,D,delta)
%     根据消息长度，获取多项式模长度。
    [n,m]=size(message);
    X=myRoot(roots(D));
    Y=message;
    
    m=round(sym2poly(simplify(myLagrange(X,Y,delta))));
end