package com.hendisantika.springdataredisexample.repository;

import com.hendisantika.springdataredisexample.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-data-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/12/17
 * Time: 19.52
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class RedisRepositoryImpl implements RedisRepository{
    private static final String KEY = "Movie";

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    @Autowired
    public RedisRepositoryImpl(RedisTemplate<String, Object> redisTemplate){
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();
    }

    public void add(final Movie movie) {
        hashOperations.put(KEY, movie.getId(), movie.getName());
    }

    public void delete(final String id) {
        hashOperations.delete(KEY, id);
    }

    public Movie findMovie(final String id){
        return (Movie) hashOperations.get(KEY, id);
    }

    public Map<Object, Object> findAllMovies(){
        return hashOperations.entries(KEY);
    }
}
