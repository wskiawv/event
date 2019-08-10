package com.freeouting.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class EoaListener implements ApplicationListener<EoaEvent> {

    @Override
    @Async
    public void onApplicationEvent(EoaEvent eoaEvent) {
        EoaEvent e = eoaEvent;
        e.execTask();

    }
}
