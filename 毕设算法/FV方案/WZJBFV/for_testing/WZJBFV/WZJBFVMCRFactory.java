/*
 * MATLAB Compiler: 6.5 (R2017b)
 * Date: Sat Apr 30 11:09:18 2022
 * Arguments: 
 * "-B""macro_default""-W""java:WZJBFV,BFV""-T""link:lib""-d""F:\\��ҵ���\\�����㷨\\FV����\\WZJBFV\\for_testing""class{BFV:F:\\��ҵ���\\�����㷨\\FV����\\BFV_EncMulti.m,F:\\��ҵ���\\�����㷨\\FV����\\BFV_multi.m,F:\\��ҵ���\\�����㷨\\FV����\\Dnc.m,F:\\��ҵ���\\�����㷨\\FV����\\Dnc_multi.m,F:\\��ҵ���\\�����㷨\\FV����\\e5.m,F:\\��ҵ���\\�����㷨\\FV����\\e6s.m,F:\\��ҵ���\\�����㷨\\FV����\\Enc.m,F:\\��ҵ���\\�����㷨\\FV����\\eu3.m,F:\\��ҵ���\\�����㷨\\FV����\\genNoisePolynomial.m,F:\\��ҵ���\\�����㷨\\FV����\\genPolynomial.m,F:\\��ҵ���\\�����㷨\\FV����\\genPrivateKey.m,F:\\��ҵ���\\�����㷨\\FV����\\genPublicKey.m,F:\\��ҵ���\\�����㷨\\FV����\\genRandomPolynomial.m,F:\\��ҵ���\\�����㷨\\FV����\\myMessage.m,F:\\��ҵ���\\�����㷨\\FV����\\myMod.m,F:\\��ҵ���\\�����㷨\\FV����\\writeToExcel.m}"
 */

package WZJBFV;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class WZJBFVMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "WZJBFV_2E15A9E4D1682B94E2C021A40D31007C";
    
    /** Component name */
    private static final String sComponentName = "WZJBFV";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(WZJBFVMCRFactory.class)
        );
    
    
    private WZJBFVMCRFactory()
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
            WZJBFVMCRFactory.class, 
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
