function m=myMessage(d)

    %给消息m开辟空间
    m=zeros(1,d);

    x=input('请输入消息m=');
    n=length(x);
    if n>d
        disp('输入有误，请重新输入')
        return
    end
    j=0;
    for i=n:-1:1
        m(1,d-j)=x(1,n-j);
        j=j+1;
    end

end