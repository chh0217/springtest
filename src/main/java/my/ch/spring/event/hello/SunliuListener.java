package my.ch.spring.event.hello;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

/**
 * Created by chenh on 2017/10/9.
 */
public class SunliuListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(final Class<? extends ApplicationEvent> eventType) {
        return eventType == ContentEvent.class;
    }

    @Override
    public boolean supportsSourceType(final Class<?> sourceType) {
        return sourceType == String.class;
    }

    @Override
    public void onApplicationEvent(final ApplicationEvent event) {
        System.out.println("孙六在王五之后收到新的内容：" + event.getSource());
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
