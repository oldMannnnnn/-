function res=Dncode(message,X,delta)
    [n,m] = size(message);
    res = zeros(1,m);
    for i=1:m
        res(i) = polyval(message/delta,X(i));
    end
end