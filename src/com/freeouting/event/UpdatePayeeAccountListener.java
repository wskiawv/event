package com.freeouting.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UpdatePayeeAccountListener implements ApplicationListener<UpdatePayeeAccountEvent> {
    @Override
    @Async
    public void onApplicationEvent(UpdatePayeeAccountEvent updatePayeeAccountEvent) {
        updatePayeeAccountEvent.execTask();
    }
}
