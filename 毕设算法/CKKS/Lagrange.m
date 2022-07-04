function s=Lagrange(x,y,x0)  
%输入x为插值节点向量,y为函数值向量,x0为未知节点组成的向量.
%输出s为利用Lagrange插值求得的未知节点的函数值组成的向量.
%注意x,y两个向量的长度必须一致.
for i=1:length(x0)             
  t=0.0;
  for j=1:length(x)                
    u=1.0;
    for k=1:length(x)
      if k~=j
        u=u*(x0(i)-x(k))/(x(j)-x(k));
      end
    end
    t=t+u*y(j);
  end
  s(i)=t;
end
