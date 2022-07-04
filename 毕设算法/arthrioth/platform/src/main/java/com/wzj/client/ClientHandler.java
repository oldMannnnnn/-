package com.wzj.client;

import com.wzj.Message;
import com.wzj.utils.BFVUtils;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.FilterEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientHandler implements IoHandler {

private  int[][] sum = new int[2][16];



public  int[][] add(int[][] ct){
        System.out.println(Arrays.toString(ct[0]));
        return BFVUtils.add(sum, ct);
}



@Override
public void messageReceived(IoSession ioSession, Object o) throws Exception {
        System.out.println(o instanceof List);
        if(o instanceof  List){
                List info = (ArrayList<Message>) o;
                for(int i = 0 ; i < info.size() ; i++){
                        Message message = (Message) info.get(i);
                        sum = add(message.getCt());
                }
                Message totalMessage = new Message(sum);
                ioSession.write(totalMessage);
        }
        if(o instanceof String){
                System.out.println("Echo: "+(String)o);
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
                System.out.println("发送成功");
        }

        @Override
        public void inputClosed(IoSession ioSession) throws Exception {

        }

        @Override
        public void event(IoSession ioSession, FilterEvent filterEvent) throws Exception {

        }
}
