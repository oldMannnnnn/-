% clear all
% clc
% 
% n=2;
% d=2^n;
% m=[1+4i 5-2i 1-4i 5+2i]
% delta = 2^7;
% 
% 
% %多项式模x^n+1的所有解
% p=[1 0 0 0 1];
% p=roots(p)
% 
% X=[-0.7071 + 0.7071i 0.7071 + 0.7071i -0.7071 - 0.7071i 0.7071 - 0.7071i];
% Y=m;
% 
% m=round(sym2poly(simplify(myLagrange(X,Y,delta))))
% 
% % 
% % clear
% % syms x
% % y=1+2*x+3*x^2+4*x^3;
% % sym2poly(y)
% 
% polyval(m/2^7,X(3))
% 

clear
clc

d=4;
message = [1.2+4i 5.1-2i 1.2-4i 5.1+2i]
delta = 2^15;
D=genPolynomial(4);
m=Encode(message,D,delta)
Dncode(m,myRoot(roots(D)),delta)

