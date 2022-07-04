a = [42  -256  -393  -229   447  -369  -212   107    52    70  -138   322   186  -282   -60    84];
s = [1     0    -1    -1    -1     0    -1     1     0     1     0    -1     0     1     1    -1];
answer = zeros(16,16);

n=15;
for i=1:length(a)
    m=15;
    for j=1:length(s)
        if(n+m>15)
            if(s(j)==1)
                answer(i,n+m-15)=a(i)-n+m-15;
            end
            if(s(j)==-1)
                answer(i,n+m-15)=-a(i)-(n+m-15);
            end
        else
            answer(i,j)=a(i)*s(j);
            
        end
        m=m-1;
    end
    n=n-1;
    
end

sum(answer)