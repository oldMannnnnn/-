function value=myMod(v,q)
    Q=q/2;
    for i=1:length(v)
        while (v(i)>Q || v(i)<=-Q)
            if(v(i)>Q)
                v(i)=mod(v(i),q)-q;
            else
                if(v(i)<1-Q)
                    v(i)=mod(v(i),q);
               
                end
            end
        end
    end
    value=v;
end