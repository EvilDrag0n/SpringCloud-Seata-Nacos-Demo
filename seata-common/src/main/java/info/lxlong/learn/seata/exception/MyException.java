package info.lxlong.learn.seata.exception;

/**
 * @description 自定义异常A
 * @author lxlong
 * @create 2022/11/14 15:16
 */
public class MyException extends RuntimeException {

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public MyException(String message) {
        super(message);
    }
}
