/*
 * MATLAB Compiler: 6.5 (R2017b)
 * Date: Sat Apr 30 11:09:18 2022
 * Arguments: 
 * "-B""macro_default""-W""java:WZJBFV,BFV""-T""link:lib""-d""F:\\毕业设计\\毕设算法\\FV方案\\WZJBFV\\for_testing""class{BFV:F:\\毕业设计\\毕设算法\\FV方案\\BFV_EncMulti.m,F:\\毕业设计\\毕设算法\\FV方案\\BFV_multi.m,F:\\毕业设计\\毕设算法\\FV方案\\Dnc.m,F:\\毕业设计\\毕设算法\\FV方案\\Dnc_multi.m,F:\\毕业设计\\毕设算法\\FV方案\\e5.m,F:\\毕业设计\\毕设算法\\FV方案\\e6s.m,F:\\毕业设计\\毕设算法\\FV方案\\Enc.m,F:\\毕业设计\\毕设算法\\FV方案\\eu3.m,F:\\毕业设计\\毕设算法\\FV方案\\genNoisePolynomial.m,F:\\毕业设计\\毕设算法\\FV方案\\genPolynomial.m,F:\\毕业设计\\毕设算法\\FV方案\\genPrivateKey.m,F:\\毕业设计\\毕设算法\\FV方案\\genPublicKey.m,F:\\毕业设计\\毕设算法\\FV方案\\genRandomPolynomial.m,F:\\毕业设计\\毕设算法\\FV方案\\myMessage.m,F:\\毕业设计\\毕设算法\\FV方案\\myMod.m,F:\\毕业设计\\毕设算法\\FV方案\\writeToExcel.m}"
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
