package com.wzj.client;

import com.mathworks.toolbox.javabuilder.MWException;
import com.wzj.Message;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Scanner;

import static com.wzj.utils.BFVUtils.*;


public class Client3 {
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
                System.out.println("连接完成");

                while(true){
                        String info = input.nextLine();
                        connectFuture.getSession().write(info);
                }

        }
}
