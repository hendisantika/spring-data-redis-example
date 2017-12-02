package com.hendisantika.springdataredisexample.queue;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/12/17
 * Time: 19.54
 * To change this template use File | Settings | File Templates.
 */
public interface MessagePublisher {
    void publish(final String message);
}
