clear
clc

%基础参数
q=874;
t=7;
d=16;

%实验次数m
m=500;
%n=30
n=30;
n30=e5(q,d,m,n);
% writeToExcel('e1_e3_n30.xls',n30);
histogram(n30,[-60:5:60])
%n=5
n=5;
n5=e5(q,d,m,n);
hold on
histogram(n5,[-60:5:60])
%n=1
n=1;
n1=e5(q,d,m,n);
hold on
histogram(n1,[-60:5:60])
title('e1+e3+...','fontsize',16);
xlabel('系数')
ylabel('系数数量');
legend('n30','n5','n1');
% writeToExcel('e1_e3_n1.xls',n1);

