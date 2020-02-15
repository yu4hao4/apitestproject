package yuhao.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author 喻浩
 * @create 2020-02-12-17:32
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class ApiData {
    private String key;
    private String value;
}
