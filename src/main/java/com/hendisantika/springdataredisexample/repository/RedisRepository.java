package com.hendisantika.springdataredisexample.repository;

import com.hendisantika.springdataredisexample.domain.Movie;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/12/17
 * Time: 19.51
 * To change this template use File | Settings | File Templates.
 */
public interface RedisRepository {
    /**
     * Return all movies
     */
    Map<Object, Object> findAllMovies();

    /**
     * Add key-value pair to Redis.
     */
    void add(Movie movie);

    /**
     * Delete a key-value pair in Redis.
     */
    void delete(String id);

    /**
     * find a movie
     */
    Movie findMovie(String id);
}
