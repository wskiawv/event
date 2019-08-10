package com.freeouting.event;

import org.springframework.context.ApplicationEvent;

public class UpdatePayeeAccountEvent extends ApplicationEvent implements ExecTask {
    public String msg;
    public UpdatePayeeAccountEvent(Object source) {
        super(source);
    }
    public UpdatePayeeAccountEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    @Override
    public void beforeExecTask() {

    }

    @Override
    public void execTask() {
        System.out.println("---------------"+msg);
        for (int i = 1 ; i<101;i++){
            System.out.println("UpdatePayeeAccountEvent休眠");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("---------------i="+i);
        }


    }

    @Override
    public void afterExecTask() {

    }
}
