%ÃÜÔ¿Éú³ÉËã·¨
function [b,b_inv] = function_CESIL_Gen(n,N)
while 1
    b = round(rand(1,n)*2^31-1);
    %b = round(rand(1,n)*n-1);
    b_fft = fft(b);
    if(ismember(0,b_fft))
        continue;
    end
    b_inv = ifft(b_fft.^-1);
    len = norm(b_inv,2)
    if(len >= 1/(2*N))
        continue;
    else
        break;
    end
end
end