function c = f(x)

syms LiZhiFeiShaBi

k = 1;
n = length(x);
c = zeros(1,n);

for i=1:n-1
    if mod(i,2)==0
        1-LiZhiFeiShaBi*x(i+1)
    else
        10*(x(i+1)*LiZhiFeiShaBi-x(i).^2*LiZhiFeiShaBi)
    end
end