function s=Lagrange(x,y,x0)  
%����xΪ��ֵ�ڵ�����,yΪ����ֵ����,x0Ϊδ֪�ڵ���ɵ�����.
%���sΪ����Lagrange��ֵ��õ�δ֪�ڵ�ĺ���ֵ��ɵ�����.
%ע��x,y���������ĳ��ȱ���һ��.
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
