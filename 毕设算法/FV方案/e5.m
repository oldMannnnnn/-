% ����˵��
% q������ʽϵ��ģ
% d��ģ����ʽ�Ĵ���
% m���Զ���ʵ��Ĵ���
% n��̬ͬ�ӷ�����

function res=e5(q,d,m,n)
    %������ʱ���������ڴ洢���ʵ��Ľ��
    res=zeros(d,m);
    for i=1:m
        %������ʱ�������洢һ�εļ�����
        temp_res=zeros(1,d);
        for j=1:n
            %ģ���μӷ��Ĳ���
            temp_res = myMod(temp_res+genNoisePolynomial(d),q);
        end
        %������洢��res��ȥ
        res(:,i)=temp_res';
    end
end