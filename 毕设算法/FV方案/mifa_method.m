function mifa_method(A,x0,e,Max)

clc
format short           
v=x0;
k=0;
m=max(v);
m_old=2;
while (k<=Max)&&(abs(m_old-m)>e)
    m_old=m;
    k=k+1;
    y = A*v;
    if max(y)==max(abs(y))
        m=max(abs(y));
    else
        m=-max(abs(y));
    end
    a(k)=m;
    v = y/m;
end
if(k>=Max)
    disp('迭代步数太多，收敛速度太慢！');
end

fprintf('迭代步为%3d\n',k)
fprintf('用幂法得出的A的主特征值为');
a(k)
fprintf('对应于的A的主特征值的特征向量可取为');
v

