function r=BFV_multi(u,v,D,q)
    %������ʽu��v��ˣ����ŶԶ���ʽģDȡģ��
    %QΪ�̣�RΪ����
    [Q,R]=deconv(conv(u,v),D);
    
    %��ȡ����
    n=length(R);
    R=R(1,n-length(u)+1:n);
    
    %��ϵ������ȡģ
    r=myMod(R,q);
end