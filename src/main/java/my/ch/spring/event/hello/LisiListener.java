package my.ch.spring.event.hello;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by chenh on 2017/10/9.
 */
@Component
public class LisiListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(final ApplicationEvent event){
        if(event instanceof ContentEvent) {
            System.out.println("李四收到了新的内容：" + event.getSource());
        }
    }
}
