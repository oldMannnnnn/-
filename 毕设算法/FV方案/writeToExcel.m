function writeToExcel(fileName,A)
    %��������MxN��ʽת��ΪM*Nx1��ʽ
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