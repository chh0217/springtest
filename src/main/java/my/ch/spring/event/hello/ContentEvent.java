package my.ch.spring.event.hello;

import org.springframework.context.ApplicationEvent;

/**
 * Created by chenh on 2017/10/9.
 */
public class ContentEvent extends ApplicationEvent{
    public ContentEvent(final String content) {
        super(content);
    }
}
