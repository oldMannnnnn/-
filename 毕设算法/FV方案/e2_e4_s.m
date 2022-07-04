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
n30=e6s(q,d,m,n30);
% writeToExcel('e2_e4_s_n30',n30);
hold on
histogram(n30,[-200:5:200])


%n=5
n5=5;
n5=e6s(q,d,m,n5);
% writeToExcel('e2_e4_s_n5',n5);
hold on
histogram(n5,[-200:5:200])

%n=1
n1=1;
n1=e6s(q,d,m,n1);
% writeToExcel('e2_e4_s_n1',n1);
hold on
histogram(n1,[-200:5:200])
title('u(e2+e4+...)','fontsize',16);
xlabel('系数')
ylabel('系数数量');
legend('n30','n5','n1');
