function m=myMessage(d)

    %����Ϣm���ٿռ�
    m=zeros(1,d);

    x=input('��������Ϣm=');
    n=length(x);
    if n>d
        disp('������������������')
        return
    end
    j=0;
    for i=n:-1:1
        m(1,d-j)=x(1,n-j);
        j=j+1;
    end

end