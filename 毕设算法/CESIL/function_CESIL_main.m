clc
clear

%����
n=13
N = 2^n;

p = round(rand(1)*N-1)
%��Կ����
[b,b_inv] = function_CESIL_Gen(n,N)

%�����㷨
c = function_CESIL_Enc(b,p,n);

%�����㷨
Dec_p = function_CESIL_Dec(b,b_inv,c)
p