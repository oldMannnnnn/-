function [x,k]=sor(A,b,x0,e,n)
format long;
D=diag(diag(A));      
L=(-1).*tril(A,-1);    
U=(-1).*triu(A,1);     
k=0;
w=1.2;
x=(D-w*L)\(((1-w)*D+w*U)*x0+w*b);
while norm(x-x0)>=e  
    x0=x;
    x=(D-w*L)\(((1-w)*D+w*U)*x0+w*b);
    k=k+1;
    %disp([k]);
    disp([x(1),x(2),x(3)]);
if k>n
        break;
end
end
