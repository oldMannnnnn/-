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
    disp('��������̫�࣬�����ٶ�̫����');
end

fprintf('������Ϊ%3d\n',k)
fprintf('���ݷ��ó���A��������ֵΪ');
a(k)
fprintf('��Ӧ�ڵ�A��������ֵ������������ȡΪ');
v

