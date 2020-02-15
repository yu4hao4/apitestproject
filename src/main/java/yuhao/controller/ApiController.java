package yuhao.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;
import yuhao.entity.ApiData;
import yuhao.entity.RespBean;
import yuhao.util.RedisUtil;

/**
 * @author 喻浩
 * @create 2020-02-12-12:24
 */
@Slf4j
@RestController
public class ApiController {
    private int indexdb = 0;
    @Autowired
    private RedisUtil util;

    /**
     * 分发api
     * @param api
     * @return
     */
    @GetMapping("/{api}")
    public String apiDistribution(@PathVariable("api") String api){
        return util.get(api, 0);
    }
    
    @PostMapping("/addApi")
    public RespBean addApi(@RequestBody ApiData data){
        System.out.println(data.getKey()+data.getValue());
        String set = util.set(data.getKey(), data.getValue(), indexdb);
        if ("ok".equalsIgnoreCase(set)){
            return RespBean.ok("成功："+data.getKey()+data.getValue());
        }else {
            return RespBean.error("失败");
        }
    }
}
