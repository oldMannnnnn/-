package com.wzj;

import java.io.Serializable;
import java.util.Arrays;

public class Message implements Serializable {
        private int[][] ct;

        public Message() {
        }

        public Message(int[][] ct) {
                this.ct = ct;
        }

        public int[][] getCt() {
                return ct;
        }

        public void setCt(int[][] ct) {
                this.ct = ct;
        }

        @Override
        public String toString() {
                return "Message{" +
                        "ct=" + Arrays.toString(ct[0]) +", "+Arrays.toString(ct[1])+
                '}';
        }
}
