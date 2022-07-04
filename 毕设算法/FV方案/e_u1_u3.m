clear 
clc
%基础参数
q=874;
t=7;
d=16;


% 实验次数m
m=500;

%n=30
n30=30;
n30=eu3(q,d,m,n30);
% writeToExcel('e_u1_u3_n30',n30);
hold on
histogram(n30,[-150:5:150]);

%n=5
n5=5;
n5=eu3(q,d,m,n5);
% writeToExcel('e_u1_u3_n5',n5);
hold on
histogram(n5,[-150:5:150]);

%n=1
n1=1;
n1=eu3(q,d,m,n1);
% writeToExcel('e_u1_u3_n1',n1);
hold on
histogram(n1,[-150:5:150]);
title('e(u1+u2+...)','fontsize',16);
xlabel('系数')
ylabel('系数数量');
legend('n30','n5','n1');
