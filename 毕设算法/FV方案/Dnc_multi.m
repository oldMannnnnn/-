function m=Dnc_multi(ct,q,t,D,s)
    summ=myMod(ct(1,:)+BFV_multi(ct(1,:),s,D,q)+BFV_multi(ct(2,:),BFV_multi(s,s,D,q),D,q),q);
    
    m=myMod(round(deconv(conv(t,summ),q)),q);
    
    
end