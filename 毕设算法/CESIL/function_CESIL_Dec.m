%Ω‚√‹À„∑®
function p = function_CESIL_Dec(b,b_inv,c)
    c = c'-ifft_fft(b,round(ifft_fft(b_inv,c)));
    p = 0;
    n = size(c);
    for i=1:n
        p = p+c(i)*2^(i-1);
    end
end