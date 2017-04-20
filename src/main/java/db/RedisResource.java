package db;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisResource {
	// inject the actual template
	  @Autowired
	  private RedisTemplate<String, String> template;

	  // inject the template as ListOperations
	  @Resource(name="redisTemplate")
	  private ValueOperations<String, String> valueOps;

	  public void addType(String userId, String type) {
	    valueOps.set(userId, type);
	  }

	  public String getType(String userId) {
		    return valueOps.get(userId);
		  }
}
