package util;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/10 19:30
 */
public class ResponseStatus {
    /**
     * 添加状态码和封装结果
     * @param status
     * @param result
     * @return
     */
    public static ResponseEntity<Object> response(int status,Result result){
        return ResponseEntity.status(status).body(result);
    }
}
