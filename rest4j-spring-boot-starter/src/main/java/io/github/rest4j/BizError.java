package io.github.rest4j;

/**
 * 业务异常 - 枚举接口
 *
 * @see io.github.rest4j.BizException
 * @since 0.1.3
 */
public interface BizError {

    int getCode();

    String getMessage();
}
