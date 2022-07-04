package com.wzj.utils;

import WZJBFV.BFV;
import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

import java.util.Arrays;

public class BFVUtils {

        public static void main(String[] args) throws MWException {
                int d = 16;
                int q = 874;
                int t = 7;

                //模系数多项式生成
                int[] D = genPolynomial(d);

                //私钥生成
                int[] privateKey = genPrivateKey(d);
                System.out.println("私钥s= "+Arrays.toString(privateKey));


                //公钥生成
                int[][] publicKey = genPublicKey(q,d,privateKey,D);
                System.out.println("私钥pk= ");
                System.out.println(Arrays.toString(publicKey[0]));
                System.out.println(Arrays.toString(publicKey[1]));


                //消息m
                int[] m = {0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,3};
                int[] m1 = {0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,2};
                int[] m2 = {0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,1};

                //加密Enc
                int[][] ct = Enc(publicKey,q,t,d,D,m);
                int[][] ct1 = Enc(publicKey,q,t,d,D,m1);
                int[][] ct2 = Enc(publicKey,q,t,d,D,m2);
                System.out.println("密文ct= ");
                System.out.println(Arrays.toString(ct[0]));
                System.out.println(Arrays.toString(ct[1]));

                System.out.println("密文ct1= ");
                System.out.println(Arrays.toString(ct1[0]));
                System.out.println(Arrays.toString(ct1[1]));

                System.out.println("密文ct2= ");
                System.out.println(Arrays.toString(ct2[0]));
                System.out.println(Arrays.toString(ct2[1]));

                //同态加法
                System.out.println("同态加法密文");
                int[][] sum = add(ct,ct1);
                System.out.println(Arrays.toString(sum[0]));
                System.out.println(Arrays.toString(sum[1]));

                //解密
//                int[] dncM = Dnc(ct2,q,t,D,privateKey);
                int[] dncM = Dnc(sum,q,t,D,privateKey);
                System.out.println("解密出的消息m= "+Arrays.toString(dncM));

        }

        /**
         * 私钥的生成
         * @param d 模系数值
         * @return
         * @throws MWException
         */
        public static int[] genPrivateKey(int d) throws MWException {
                return toIntNums(new BFV().genPrivateKey(1,d));
        }

        /**
         * 生成模多项式
         * @param d 模次数
         * @return
         * @throws MWException
         */
        public static int[] genPolynomial(int d) throws MWException {
                return toIntNums(new BFV().genPolynomial(1,d));
        }

        /**
         * 生成公钥
         * @param q 模系数
         * @param d 模次数
         * @param s 私钥
         * @param D 模多项式
         * @return
         * @throws MWException
         */
        public static int[][] genPublicKey(int q,int d,int[] s,int[] D) throws MWException {
                return toIntNums2(new BFV().genPublicKey(1,(double)q,d,intToDouble(s),intToDouble(D)));
        }

        /**
         * 加密函数
         * @param pk 公钥
         * @param q
         * @param t
         * @param d
         * @param D
         * @param m
         * @return
         * @throws MWException
         */
        public static int[][] Enc(int[][] pk,int q,int t,int d,int[] D,int[] m) throws MWException {
                return toIntNums2(new BFV().Enc(1,pk,(double)q,(double)t,d,intToDouble(D),m));
        }

        public static int[] Dnc(int[][] ct,int q,int t,int[] D,int[] s) throws MWException {
                return toIntNums(new BFV().Dnc(1,intToDouble2(ct),(double)q,t,intToDouble(D),s));
        }

        /**
         * 将返回的结果转换为一维数组
         * @param result 返回结果
         * @return
         */
        public static int[] toIntNums(Object[] result){
                MWNumericArray mwn = ((MWNumericArray) result[0]);
                int len = mwn.numberOfElements();
                int[] res = new int[len];
                for (int i = 0; i < len; i++) {
                        res[i] = mwn.getInt(i+1);
                }
                return res;
        }

        /**
         * 将返回结果转换为二维数组
         * @param result
         * @return
         */
        public static int[][] toIntNums2(Object[] result){
                MWNumericArray mwn = ((MWNumericArray) result[0]);
                int len = mwn.numberOfElements();
                int[][] res = new int[2][len/2];

                for (int i = 0; i < len/2; i++) {
                        res[0][i] = mwn.getInt(2*i+1);
                        res[1][i] = mwn.getInt(2*i+2);
                }
                return res;
        }

        /**
         * BFV同态加法，与四则运算加法一致。
         * 两密文相加即可
         * @param ct1
         * @param ct2
         * @return
         */
        public static int[][] add(int[][] ct1, int[][] ct2){
                int row = ct1.length;
                int col = ct1[0].length;
                int[][] sum = new int[row][col];
                for(int i = 0 ; i < row ; i++){
                        for (int j = 0; j < col; j++) {
                                sum[i][j] = ct1[i][j]+ct2[i][j];
                        }
                }
                return sum;
        }


        public static double[] intToDouble(int[] sourceNums){
                int len = sourceNums.length;
                double[] targetNums = new double[len];
                for(int i = 0 ; i < len ; i++){
                        targetNums[i] = (double) sourceNums[i];
                }
                return targetNums;
        }

        public static double[][] intToDouble2(int[][] sourceNums){
                int rows = sourceNums.length;
                int cols = sourceNums[0].length;
                double[][] targetNums = new double[rows][cols];
                for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                                targetNums[i][j] = (double) sourceNums[i][j];
                        }
                }
                return targetNums;
        }



}
