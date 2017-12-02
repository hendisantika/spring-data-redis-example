package com.hendisantika.springdataredisexample.domain;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/12/17
 * Time: 19.49
 * To change this template use File | Settings | File Templates.
 */
public class Movie implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;

    public Movie(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + '\'' + ", name =" + name + "}";
    }

}
