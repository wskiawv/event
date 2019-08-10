package com.freeouting.event;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
    @RequestMapping("/execTask")
    @ResponseBody
    public Object execTask(){
       ApplicationContext context = ApplicationContextUtil.getApplicationContext();
       EoaEvent eoaEvent = new EoaEvent(context,"触发EOA事件");
       context.publishEvent(eoaEvent);
        UpdatePayeeAccountEvent updatePayeeAccountEvent = new UpdatePayeeAccountEvent(context,"触发UpdatePayeeAccountEvent");
        context.publishEvent(updatePayeeAccountEvent);
        return "成功";
    }
}
