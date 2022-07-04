package com.wzj.server;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Server {
        public static void main(String[] args) {
                //创建服务端
                SocketAcceptor acceptor = new NioSocketAcceptor();

                //添加过滤流
                DefaultIoFilterChainBuilder chain = acceptor.getFilterChain();
                chain.addLast("MessageChain", new ProtocolCodecFilter(new ObjectSerializationCodecFactory()));
                chain.addLast("LineChain",new ProtocolCodecFilter(new TextLineCodecFactory()));

                //添加一个消息处理对象
                acceptor.setHandler(new ServerHandler());

                //绑定端口
                try {
                        acceptor.bind(new InetSocketAddress(8085));
                        System.out.println("启动完成");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
