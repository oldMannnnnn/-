function writeToExcel(fileName,A)
    %将矩阵由MxN形式转变为M*Nx1形式
    [m,n]=size(A);
    res=zeros(m*n,1);
    count=1;
    for i=1:m
        for j=1:n
            res(count,1)=A(i,j);
            count=count+1;
        end
    end
    xlswrite(fileName,res);   
end