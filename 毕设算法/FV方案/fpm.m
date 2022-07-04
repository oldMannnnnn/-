function [s,y] = fpm(A, x0, eps)
k = 1;
r= 0;
y = x0./max(abs(x0));
[L,U]=lu(A);
z = L\y;
x = U\z;
u = max(x);
s = 1/u;
if abs(u-r)<eps
    return
end
while abs(u-r)>eps
    k=k+1;
    r= u;
    y= x./max(abs(x));
    z = L\y;
    x = U\z;
    u = max(x);
end
[m, index] = max(abs(x));
s = 1/x(index);
end