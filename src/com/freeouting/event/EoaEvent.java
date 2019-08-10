package com.freeouting.event;

import org.springframework.context.ApplicationEvent;

public class EoaEvent extends ApplicationEvent implements ExecTask{
    public String msg;
    public EoaEvent(Object source) {
        super(source);
    }
    public EoaEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    @Override
    public void beforeExecTask() {

    }

    @Override
    public void execTask() {
        System.out.println("-----------------------"+msg);
        for (int k = 200;k<301;k++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----------------------k="+k);
        }
    }

    @Override
    public void afterExecTask() {

    }
}
