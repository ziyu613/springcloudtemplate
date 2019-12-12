package com.oceanwood.platform.core.redis;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
/**
 * common template for operating redis database
 *
 * @author By TianF
 **/

public class CommTemplate extends RedisTemplate{

    @Override
    public RedisConnectionFactory getConnectionFactory() {
        return super.getConnectionFactory();
    }

    @Override
    protected RedisConnection createRedisConnectionProxy(RedisConnection pm) {
        return super.createRedisConnectionProxy(pm);
    }

    @Override
    protected RedisConnection preProcessConnection(RedisConnection connection, boolean existingConnection) {
        return super.preProcessConnection(connection, existingConnection);
    }
}
