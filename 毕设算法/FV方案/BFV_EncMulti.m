function BFV_EncMulti(u,v,q,t,D,s)
    c0=myMod((t.*BFV_multi(u(1,:),v(1,:),D,q))./q,q);
    c1=myMod((t.*(BFV_multi(u(1,:),v(1,:),D,q))+BFV_multi(u(1,:),v(2,:),D,q))./q,q);
    c2=myMod((t.*BFV_multi(u(2,:),v(2,:),D,q))./q,q);
    
    
    

end