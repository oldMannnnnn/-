clc
clear

%明文
n=13
N = 2^n;

p = round(rand(1)*N-1)
%密钥生成
[b,b_inv] = function_CESIL_Gen(n,N)

%加密算法
c = function_CESIL_Enc(b,p,n);

%解密算法
Dec_p = function_CESIL_Dec(b,b_inv,c)
p