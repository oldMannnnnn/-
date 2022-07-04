package com.wzj.server;

import WZJBFV.BFV;
import com.wzj.Message;
import com.wzj.utils.BFVUtils;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.FilterEvent;

import java.util.*;

public class ServerHandler implements IoHandler {
        private static List<IoSession> sessionList = new ArrayList<>();
        private static List<Message> messageList = new ArrayList<>();
        private static int index = 0;

        private static int userNum = 2;
        private static int curUser = 0;

        private static int[][] sum = new int[2][16];



        public static int[][] add(int[][] ct){
                System.out.println(Arrays.toString(ct[0]));
                return BFVUtils.add(sum, ct);
        }




        @Override
        public void messageReceived(IoSession ioSession, Object o) throws Exception {
                System.out.println(ioSession.getId()+"进来了");
                if(o instanceof  List){
                        System.out.println("is List");
                        messageList.addAll((ArrayList<Message>)o);
                        sessionList.add(ioSession);
                        ioSession.write("数据发送成功");
                        System.out.println("数据接收完毕");
                }
                if(o instanceof  String){
                        System.out.println(o instanceof String);
                        String info = (String)o;
                        if("ok".equalsIgnoreCase(info)){
                                sessionList.get(0).write(new Message(sum));
                                System.out.println("整合完毕");
                        }
                        if("connect".equalsIgnoreCase(info)){
                                curUser++;
                                sessionList.add(ioSession);
                                ioSession.write(new String("连接成功"));
                                System.out.println(ioSession.getId()+": 连接成功");
                        }
                        if("getCT".equalsIgnoreCase(info)){
                                if(curUser == userNum){
                                        if(index == messageList.size()){
                                                ioSession.write("没啦，别要了");
                                        }else{
                                                List<Message> list = new ArrayList<>();
                                                Message message = messageList.get(index++);
                                                Message message2 = messageList.get(index++);
                                                list.add(message);
                                                list.add(message2);
                                                ioSession.write(list);
                                        }
                                }else{
                                        ioSession.write(new String("等一下，人没到齐。"));
                                }
                        }
                }
                if(o instanceof Message){
                        Message info = (Message) o;
                        sum = add(info.getCt());
                        System.out.println("接收到("+ioSession.toString()+")发送的密文:");
                        ioSession.write("感谢你的计算");
                }
        }

        @Override
        public void sessionCreated(IoSession ioSession) throws Exception {

        }

        @Override
        public void sessionOpened(IoSession ioSession) throws Exception {

        }

        @Override
        public void sessionClosed(IoSession ioSession) throws Exception {

        }

        @Override
        public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) throws Exception {

        }

        @Override
        public void exceptionCaught(IoSession ioSession, Throwable throwable) throws Exception {

        }

        @Override
        public void messageSent(IoSession ioSession, Object o) throws Exception {
                System.out.println("已向("+ioSession.getId()+")发送消息");

        }

        @Override
        public void inputClosed(IoSession ioSession) throws Exception {

        }

        @Override
        public void event(IoSession ioSession, FilterEvent filterEvent) throws Exception {

        }
}
