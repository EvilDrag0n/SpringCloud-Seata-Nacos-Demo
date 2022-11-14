package info.lxlong.learn.seata.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description 全局异常处理
 * @author lxlong
 * @create 2022/11/11 18:18
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    public ResponseEntity<String> exceptionHandle(MyException e){
        log.info("----异常信息:{}", e.getMessage());
        return ResponseEntity.ok(e.getMessage());
    }
}
