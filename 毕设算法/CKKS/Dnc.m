function m=Dnc(ct,q,t,D,s)
    %¿ªÊ¼½âÃÜ
    ct0s_ct1=BFV_multi(ct(2,:),s,D,q)+ct(1,:);
    myMod(ct0s_ct1,q)
    m=round(deconv(conv(ct0s_ct1,t),q));

end