/*
 * MATLAB Compiler: 6.5 (R2017b)
 * Date: Mon Apr 11 16:28:37 2022
 * Arguments: 
 * "-B""macro_default""-W""java:demo,plotter""-T""link:lib""-d""F:\\��ҵ���\\�����㷨\\FV����\\demo\\for_testing""class{plotter:F:\\��ҵ���\\�����㷨\\FV����\\BFV_multi.m,F:\\��ҵ���\\�����㷨\\FV����\\Dnc.m,F:\\��ҵ���\\�����㷨\\FV����\\drawplot.m,F:\\��ҵ���\\�����㷨\\FV����\\Enc.m,F:\\��ҵ���\\�����㷨\\FV����\\genNoisePolynomial.m,F:\\��ҵ���\\�����㷨\\FV����\\genPolynomial.m,F:\\��ҵ���\\�����㷨\\FV����\\genPrivateKey.m,F:\\��ҵ���\\�����㷨\\FV����\\genPublicKey.m,F:\\��ҵ���\\�����㷨\\FV����\\genRandomPolynomial.m,F:\\��ҵ���\\�����㷨\\FV����\\myMessage.m,F:\\��ҵ���\\�����㷨\\FV����\\myMod.m}"
 */

package demo;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class DemoMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "demo_94EF1E13A8FBAF4024587D5BD8323531";
    
    /** Component name */
    private static final String sComponentName = "demo";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(DemoMCRFactory.class)
        );
    
    
    private DemoMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            DemoMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{9,3,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
