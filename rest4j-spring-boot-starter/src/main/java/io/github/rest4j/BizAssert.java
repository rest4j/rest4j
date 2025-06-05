package io.github.rest4j;

import lombok.experimental.UtilityClass;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 业务断言
 *
 * @see io.github.rest4j.BizException
 * @since 0.1.3
 */
@UtilityClass
public class BizAssert {

    public void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new BizException(message);
        }
    }

    public void isTrue(boolean expression, int code, String message) {
        if (!expression) {
            throw new BizException(code, message);
        }
    }

    public void isTrue(boolean expression, BizError bizError) {
        if (!expression) {
            throw new BizException(bizError);
        }
    }

    public void isNull(Object object, String message) {
        if (object != null) {
            throw new BizException(message);
        }
    }

    public void isNull(Object object, int code, String message) {
        if (object != null) {
            throw new BizException(code, message);
        }
    }

    public void isNull(Object object, BizError bizError) {
        if (object != null) {
            throw new BizException(bizError);
        }
    }

    public void notNull(Object object, String message) {
        if (object == null) {
            throw new BizException(message);
        }
    }

    public void notNull(Object object, int code, String message) {
        if (object == null) {
            throw new BizException(code, message);
        }
    }

    public void notNull(Object object, BizError bizError) {
        if (object == null) {
            throw new BizException(bizError);
        }
    }

    public void hasLength(String text, String message) {
        if (!StringUtils.hasLength(text)) {
            throw new BizException(message);
        }
    }

    public void hasLength(String text, int code, String message) {
        if (!StringUtils.hasLength(text)) {
            throw new BizException(code, message);
        }
    }

    public void hasLength(String text, BizError bizError) {
        if (!StringUtils.hasLength(text)) {
            throw new BizException(bizError);
        }
    }

    public void hasText(String text, String message) {
        if (!StringUtils.hasText(text)) {
            throw new BizException(message);
        }
    }

    public void hasText(String text, int code, String message) {
        if (!StringUtils.hasText(text)) {
            throw new BizException(code, message);
        }
    }

    public void hasText(String text, BizError bizError) {
        if (!StringUtils.hasText(text)) {
            throw new BizException(bizError);
        }
    }

    public void notEmpty(Object[] array, String message) {
        if (ObjectUtils.isEmpty(array)) {
            throw new BizException(message);
        }
    }

    public void notEmpty(Object[] array, int code, String message) {
        if (ObjectUtils.isEmpty(array)) {
            throw new BizException(code, message);
        }
    }

    public void notEmpty(Object[] array, BizError bizError) {
        if (ObjectUtils.isEmpty(array)) {
            throw new BizException(bizError);
        }
    }

    public void notEmpty(Collection<?> collection, String message) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BizException(message);
        }
    }

    public void notEmpty(Collection<?> collection, int code, String message) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BizException(code, message);
        }
    }

    public void notEmpty(Collection<?> collection, BizError bizError) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BizException(bizError);
        }
    }

    public void notEmpty(Map<?, ?> map, String message) {
        if (CollectionUtils.isEmpty(map)) {
            throw new BizException(message);
        }
    }

    public void notEmpty(Map<?, ?> map, int code, String message) {
        if (CollectionUtils.isEmpty(map)) {
            throw new BizException(code, message);
        }
    }

    public void notEmpty(Map<?, ?> map, BizError bizError) {
        if (CollectionUtils.isEmpty(map)) {
            throw new BizException(bizError);
        }
    }
}
