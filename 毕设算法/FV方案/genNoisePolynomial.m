function e=genNoisePolynomial(d)
    t=10;
    e=myMod(round(randn(d,1)*t),t)';
end
