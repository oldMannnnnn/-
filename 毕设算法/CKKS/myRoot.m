function res=myRoot(root)
    [n,m] = size(root);
    res = zeros(1,n);
    nn=n/2;
    
    for i=1:nn
        res(i) = root(2*i-1);
        res(nn+i)=root(2*i);
    end
    
end