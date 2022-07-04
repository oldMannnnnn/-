function  a = ifft_fft(a,b)
    a = ifft((fft(a))*(fft(b)));
end