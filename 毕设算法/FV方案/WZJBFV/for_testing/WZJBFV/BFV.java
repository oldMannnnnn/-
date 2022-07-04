/*
 * MATLAB Compiler: 6.5 (R2017b)
 * Date: Sat Apr 30 11:09:18 2022
 * Arguments: 
 * "-B""macro_default""-W""java:WZJBFV,BFV""-T""link:lib""-d""F:\\毕业设计\\毕设算法\\FV方案\\WZJBFV\\for_testing""class{BFV:F:\\毕业设计\\毕设算法\\FV方案\\BFV_EncMulti.m,F:\\毕业设计\\毕设算法\\FV方案\\BFV_multi.m,F:\\毕业设计\\毕设算法\\FV方案\\Dnc.m,F:\\毕业设计\\毕设算法\\FV方案\\Dnc_multi.m,F:\\毕业设计\\毕设算法\\FV方案\\e5.m,F:\\毕业设计\\毕设算法\\FV方案\\e6s.m,F:\\毕业设计\\毕设算法\\FV方案\\Enc.m,F:\\毕业设计\\毕设算法\\FV方案\\eu3.m,F:\\毕业设计\\毕设算法\\FV方案\\genNoisePolynomial.m,F:\\毕业设计\\毕设算法\\FV方案\\genPolynomial.m,F:\\毕业设计\\毕设算法\\FV方案\\genPrivateKey.m,F:\\毕业设计\\毕设算法\\FV方案\\genPublicKey.m,F:\\毕业设计\\毕设算法\\FV方案\\genRandomPolynomial.m,F:\\毕业设计\\毕设算法\\FV方案\\myMessage.m,F:\\毕业设计\\毕设算法\\FV方案\\myMod.m,F:\\毕业设计\\毕设算法\\FV方案\\writeToExcel.m}"
 */

package WZJBFV;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>BFV</code> class provides a Java interface to MATLAB functions. 
 * The interface is compiled from the following files:
 * <pre>
 *  F:\\毕业设计\\毕设算法\\FV方案\\BFV_EncMulti.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\BFV_multi.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\Dnc.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\Dnc_multi.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\e5.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\e6s.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\Enc.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\eu3.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\genNoisePolynomial.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\genPolynomial.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\genPrivateKey.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\genPublicKey.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\genRandomPolynomial.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\myMessage.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\myMod.m
 *  F:\\毕业设计\\毕设算法\\FV方案\\writeToExcel.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>BFV</code> instance when 
 * it is no longer needed to ensure that native resources allocated by this class are 
 * properly freed.
 * @version 0.0
 */
public class BFV extends MWComponentInstance<BFV>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>BFV_EncMulti</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sBFV_EncMultiSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "BFV_EncMulti",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>BFV_multi</code> MATLAB function.
     */
    private static final MWFunctionSignature sBFV_multiSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "BFV_multi",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>Dnc</code> MATLAB function.
     */
    private static final MWFunctionSignature sDncSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "Dnc",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>Dnc_multi</code> MATLAB function.
     */
    private static final MWFunctionSignature sDnc_multiSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "Dnc_multi",
                                /* max inputs = */ 5,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>e5</code> MATLAB function.
     */
    private static final MWFunctionSignature sE5Signature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "e5",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>e6s</code> MATLAB function.
     */
    private static final MWFunctionSignature sE6sSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "e6s",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>Enc</code> MATLAB function.
     */
    private static final MWFunctionSignature sEncSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "Enc",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>eu3</code> MATLAB function.
     */
    private static final MWFunctionSignature sEu3Signature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "eu3",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>genNoisePolynomial</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sGenNoisePolynomialSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "genNoisePolynomial",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>genPolynomial</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sGenPolynomialSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "genPolynomial",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>genPrivateKey</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sGenPrivateKeySignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "genPrivateKey",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>genPublicKey</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sGenPublicKeySignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "genPublicKey",
                                /* max inputs = */ 4,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>genRandomPolynomial</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sGenRandomPolynomialSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "genRandomPolynomial",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>myMessage</code> MATLAB function.
     */
    private static final MWFunctionSignature sMyMessageSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "myMessage",
                                /* max inputs = */ 1,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>myMod</code> MATLAB function.
     */
    private static final MWFunctionSignature sMyModSignature =
        new MWFunctionSignature(/* max outputs = */ 1,
                                /* has varargout = */ false,
                                /* function name = */ "myMod",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);
    /**
     * Maintains information used in calling the <code>writeToExcel</code> MATLAB 
     *function.
     */
    private static final MWFunctionSignature sWriteToExcelSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "writeToExcel",
                                /* max inputs = */ 2,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     * @throws MWException An error has occurred during the function call.
     */
    private BFV (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(BFV.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>BFV</code> class.
     * @throws MWException An error has occurred during the function call.
     */
    public BFV() throws MWException
    {
        this(WZJBFVMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #BFV(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides an API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     * @throws MWException An error has occurred during the function call.
     */
    public BFV(String pathToComponent) throws MWException
    {
        this(WZJBFVMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>BFV</code> class. Use this constructor to 
     * specify the options required to instantiate this component.  The options will be 
     * specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     * @throws MWException An error has occurred during the function call.
     */
    public BFV(MWComponentOptions componentOptions) throws MWException
    {
        this(WZJBFVMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(BFV.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first MATLAB function specified to MCC, with any arguments given on
     * the command line, and prints the result.
     *
     * @param args arguments to the function
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = WZJBFVMCRFactory.newInstance();
            mcr.runMain( sBFV_EncMultiSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(BFV.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>BFV_EncMulti</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void BFV_EncMulti(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBFV_EncMultiSignature);
    }

    /**
     * Provides the interface for calling the <code>BFV_EncMulti</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void BFV_EncMulti(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBFV_EncMultiSignature);
    }

    /**
     * Provides the standard interface for calling the <code>BFV_EncMulti</code> MATLAB function with 
     * 6 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] BFV_EncMulti(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBFV_EncMultiSignature), 
                    sBFV_EncMultiSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>BFV_multi</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %两多项式u，v相乘，接着对多项式模D取模，
     *     %Q为商，R为余数
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void BFV_multi(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sBFV_multiSignature);
    }

    /**
     * Provides the interface for calling the <code>BFV_multi</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %两多项式u，v相乘，接着对多项式模D取模，
     *     %Q为商，R为余数
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void BFV_multi(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sBFV_multiSignature);
    }

    /**
     * Provides the standard interface for calling the <code>BFV_multi</code> MATLAB function with 
     * 4 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %两多项式u，v相乘，接着对多项式模D取模，
     *     %Q为商，R为余数
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] BFV_multi(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sBFV_multiSignature), 
                    sBFV_multiSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>Dnc</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %开始解密
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void Dnc(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sDncSignature);
    }

    /**
     * Provides the interface for calling the <code>Dnc</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %开始解密
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void Dnc(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sDncSignature);
    }

    /**
     * Provides the standard interface for calling the <code>Dnc</code> MATLAB function with 
     * 5 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %开始解密
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] Dnc(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sDncSignature), 
                    sDncSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>Dnc_multi</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void Dnc_multi(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sDnc_multiSignature);
    }

    /**
     * Provides the interface for calling the <code>Dnc_multi</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void Dnc_multi(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sDnc_multiSignature);
    }

    /**
     * Provides the standard interface for calling the <code>Dnc_multi</code> MATLAB function with 
     * 5 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] Dnc_multi(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sDnc_multiSignature), 
                    sDnc_multiSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>e5</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void e5(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sE5Signature);
    }

    /**
     * Provides the interface for calling the <code>e5</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void e5(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sE5Signature);
    }

    /**
     * Provides the standard interface for calling the <code>e5</code> MATLAB function with 
     * 4 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] e5(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sE5Signature), 
                    sE5Signature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>e6s</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void e6s(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sE6sSignature);
    }

    /**
     * Provides the interface for calling the <code>e6s</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void e6s(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sE6sSignature);
    }

    /**
     * Provides the standard interface for calling the <code>e6s</code> MATLAB function with 
     * 4 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] e6s(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sE6sSignature), 
                    sE6sSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>Enc</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %加密过程
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void Enc(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEncSignature);
    }

    /**
     * Provides the interface for calling the <code>Enc</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %加密过程
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void Enc(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEncSignature);
    }

    /**
     * Provides the standard interface for calling the <code>Enc</code> MATLAB function with 
     * 6 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %加密过程
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] Enc(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEncSignature), 
                    sEncSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>eu3</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void eu3(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEu3Signature);
    }

    /**
     * Provides the interface for calling the <code>eu3</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void eu3(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEu3Signature);
    }

    /**
     * Provides the standard interface for calling the <code>eu3</code> MATLAB function with 
     * 4 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %声明临时变量，用于存储多次实验的结果
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] eu3(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEu3Signature), 
                    sEu3Signature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>genNoisePolynomial</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genNoisePolynomial(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGenNoisePolynomialSignature);
    }

    /**
     * Provides the interface for calling the <code>genNoisePolynomial</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genNoisePolynomial(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGenNoisePolynomialSignature);
    }

    /**
     * Provides the standard interface for calling the <code>genNoisePolynomial</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] genNoisePolynomial(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGenNoisePolynomialSignature), 
                    sGenNoisePolynomialSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>genPolynomial</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genPolynomial(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGenPolynomialSignature);
    }

    /**
     * Provides the interface for calling the <code>genPolynomial</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genPolynomial(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGenPolynomialSignature);
    }

    /**
     * Provides the standard interface for calling the <code>genPolynomial</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] genPolynomial(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGenPolynomialSignature), 
                    sGenPolynomialSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>genPrivateKey</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %生成随机0，1，-1矩阵
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genPrivateKey(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGenPrivateKeySignature);
    }

    /**
     * Provides the interface for calling the <code>genPrivateKey</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %生成随机0，1，-1矩阵
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genPrivateKey(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGenPrivateKeySignature);
    }

    /**
     * Provides the standard interface for calling the <code>genPrivateKey</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %生成随机0，1，-1矩阵
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] genPrivateKey(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGenPrivateKeySignature), 
                    sGenPrivateKeySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>genPublicKey</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %随机生成一个多项式，用于生成公钥
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genPublicKey(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGenPublicKeySignature);
    }

    /**
     * Provides the interface for calling the <code>genPublicKey</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %随机生成一个多项式，用于生成公钥
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genPublicKey(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGenPublicKeySignature);
    }

    /**
     * Provides the standard interface for calling the <code>genPublicKey</code> MATLAB function with 
     * 4 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %随机生成一个多项式，用于生成公钥
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] genPublicKey(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGenPublicKeySignature), 
                    sGenPublicKeySignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>genRandomPolynomial</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %生成随机系数矩阵
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genRandomPolynomial(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sGenRandomPolynomialSignature);
    }

    /**
     * Provides the interface for calling the <code>genRandomPolynomial</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %生成随机系数矩阵
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void genRandomPolynomial(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sGenRandomPolynomialSignature);
    }

    /**
     * Provides the standard interface for calling the <code>genRandomPolynomial</code> MATLAB function with 
     * 2 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %生成随机系数矩阵
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] genRandomPolynomial(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sGenRandomPolynomialSignature), 
                    sGenRandomPolynomialSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>myMessage</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %给消息m开辟空间
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void myMessage(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sMyMessageSignature);
    }

    /**
     * Provides the interface for calling the <code>myMessage</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %给消息m开辟空间
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void myMessage(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sMyMessageSignature);
    }

    /**
     * Provides the standard interface for calling the <code>myMessage</code> MATLAB function with 
     * 1 input argument.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %给消息m开辟空间
     * </pre>
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] myMessage(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sMyMessageSignature), 
                    sMyMessageSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>myMod</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void myMod(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sMyModSignature);
    }

    /**
     * Provides the interface for calling the <code>myMod</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void myMod(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sMyModSignature);
    }

    /**
     * Provides the standard interface for calling the <code>myMod</code> MATLAB function with 
     * 2 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * @param nargout Number of outputs to return.
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] myMod(int nargout, Object... rhs) throws MWException
    {
        Object[] lhs = new Object[nargout];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sMyModSignature), 
                    sMyModSignature);
        return lhs;
    }
    /**
     * Provides the interface for calling the <code>writeToExcel</code> MATLAB function 
     * where the first argument, an instance of List, receives the output of the MATLAB function and
     * the second argument, also an instance of List, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %将矩阵由MxN形式转变为M*Nx1形式
     * </pre>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void writeToExcel(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sWriteToExcelSignature);
    }

    /**
     * Provides the interface for calling the <code>writeToExcel</code> MATLAB function 
     * where the first argument, an Object array, receives the output of the MATLAB function and
     * the second argument, also an Object array, provides the input to the MATLAB function.
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %将矩阵由MxN形式转变为M*Nx1形式
     * </pre>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void writeToExcel(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sWriteToExcelSignature);
    }

    /**
     * Provides the standard interface for calling the <code>writeToExcel</code> MATLAB function with 
     * 2 comma-separated input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>
     * Description as provided by the author of the MATLAB function:
     * </p>
     * <pre>
     * %将矩阵由MxN形式转变为M*Nx1形式
     * </pre>
     * @param rhs The inputs to the MATLAB function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] writeToExcel(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sWriteToExcelSignature), 
                    sWriteToExcelSignature);
        return lhs;
    }
}
