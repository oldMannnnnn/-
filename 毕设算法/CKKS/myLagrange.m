function totalSum = myLagrange(X,Y,delta)
%     �����Ա���x
    syms x;
%     ��ȡ�Ա���x��ά��
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