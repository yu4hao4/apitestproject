package yuhao.mapper;

import org.apache.ibatis.annotations.Mapper;
import yuhao.entity.ApiData;

/**
 * @author 喻浩
 * @create 2020-02-12-17:59
 */
@Mapper
public interface ApiMapper {
    
    boolean addApi(ApiData data);
}
