function totalSum = myLagrange(X,Y,delta)
%     定义自变量x
    syms x;
%     获取自变量x的维度
    [n,m] = size(X);
    totalSum=0;
    for i=1:m
        molSum=1;
        denSum=1;
        for j=1:m
            if i~=j
                molSum=molSum*(x-X(j));
                denSum=denSum*(X(i)-X(j));
            end
        end
        totalSum = totalSum+(molSum*Y(i))/denSum;
    end
    totalSum=totalSum*delta;
end