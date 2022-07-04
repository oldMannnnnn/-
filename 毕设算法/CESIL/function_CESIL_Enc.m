%º”√‹À„∑®
function c = function_CESIL_Enc(b,p,n)
    c = zeros(1,n);
    pp = dec2bin(p);
    for i=1:n
        c(i)=str2double(pp(i));
    end
    
    while 1
        r = round(rand(n,1)*n-1)-0.5*n;
        if ismember(0,r)
            continue
        else
            break;
        end
    end
    %c = fliplr(c);
    c = c + ifft_fft(b,r);
    c=c';
end