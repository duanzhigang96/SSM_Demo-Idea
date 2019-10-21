package com.example.javaTest;

public class B {

    private CallBack callBack;

    public interface CallBack {
        void sendResult(String language);
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }

    public void doThing() {
//        callBack.sendResult("VB");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    callBack.sendResult("VB");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
