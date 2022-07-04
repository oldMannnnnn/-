package com.wzj.client;

import com.mathworks.toolbox.javabuilder.MWException;
import com.wzj.Message;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.wzj.utils.BFVUtils.*;


public class Client {
        public static void main(String[] args) throws MWException {
                Scanner input = new Scanner(System.in);
                //创建客户端
                NioSocketConnector client = new NioSocketConnector();
                DefaultIoFilterChainBuilder chain = client.getFilterChain();

                //添加过滤器
                chain.addLast("clientLineChain",new ProtocolCodecFilter(new TextLineCodecFactory()));
                chain.addLast("MessageChain", new ProtocolCodecFilter(new ObjectSerializationCodecFactory()));

                //添加事务处理对象
                client.setHandler(new ClientHandler());

                //连接服务器
                ConnectFuture connectFuture = client.connect(new InetSocketAddress("localhost",8085));
                connectFuture.awaitUninterruptibly();

                /**
                 * 生成密文
                 */


                int d = 16;
                int q = 874;
                int t = 7;

                //模系数多项式生成
                int[] D = genPolynomial(d);

                //私钥生成
                int[] privateKey = genPrivateKey(d);


                //公钥生成
                int[][] publicKey = genPublicKey(q,d,privateKey,D);


                //消息m
                int[] m = {0,0,0,0,0,0,0,-3,0,0,0,0,0,0,0,3};
                int[] m2 = {0,0,0,0,0,0,0,-2,0,0,0,0,0,0,0,2};
                int[] m3 = {0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,1};
                int[] m4 = {0,0,0,0,0,0,0,-1,0,0,0,0,0,0,0,1};

                System.out.println("开始加密");

                //加密Enc
                int[][] ct = Enc(publicKey,q,t,d,D,m);
                int[][] ct2 = Enc(publicKey,q,t,d,D,m2);
                int[][] ct3 = Enc(publicKey,q,t,d,D,m3);
                int[][] ct4 = Enc(publicKey,q,t,d,D,m4);

                System.out.println("加密完成，开始传输");

                Message message = new Message(ct);
                Message message2 = new Message(ct2);
                Message message3 = new Message(ct3);
                Message message4 = new Message(ct4);

                List<Message> messageList =  new ArrayList<>();
                messageList.add(message);
                messageList.add(message2);
                messageList.add(message3);
                messageList.add(message4);
                connectFuture.getSession().write(messageList);


                while(true){
                        String info = input.nextLine();
                        connectFuture.getSession().write(info);
                }

        }
}
