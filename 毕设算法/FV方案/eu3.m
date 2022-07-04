% ����˵��
% q������ʽϵ��ģ
% d��ģ����ʽ�Ĵ���
% m���Զ���ʵ��Ĵ���
% n��̬ͬ�ӷ�����

function res=eu3(q,d,m,n)
    %������ʱ���������ڴ洢���ʵ��Ľ��
    res=zeros(d,n);
    %��������ʽe
    e=genNoisePolynomial(d);
    %ģ����ʽD
    D=genPolynomial(d);
    for i=1:m
        %������ʱ�������洢һ�εļ�����
        temp_res=zeros(1,d);
        for j=1:n
            %ģ���μӷ��Ĳ���
            temp_res = temp_res+genPrivateKey(d);
        end
        
        temp_res=BFV_multi(temp_res,e,D,q);
        
        %������洢��res��ȥ
        res(:,i)=temp_res';
    end
end