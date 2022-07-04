function r=BFV_multi(u,v,D,q)
    %两多项式u，v相乘，接着对多项式模D取模，
    %Q为商，R为余数
    [Q,R]=deconv(conv(u,v),D);
    
    %截取余数
    n=length(R);
    R=R(1,n-length(u)+1:n);
    
    %对系数进行取模
    r=myMod(R,q);
end