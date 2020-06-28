package com.yangq.selfmotivation.exception;

import com.yangq.selfmotivation.enuma.JsonResultEnum;
import lombok.Getter;

/**
 * ElasticsearchException
 *
 * @author fxbin
 * @version v1.0
 * @since 2019/8/26 1:53
 */
public class ElasticsearchException extends RuntimeException {

    @Getter
    private String errcode;

    @Getter
    private String errmsg;

    public ElasticsearchException(JsonResultEnum resultCode) {
        this(resultCode.getCode(), resultCode.getMessage());
    }

    public ElasticsearchException(String message) {
        super(message);
    }

    public ElasticsearchException(String errcode, String errmsg) {
        super(errmsg);
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public ElasticsearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElasticsearchException(Throwable cause) {
        super(cause);
    }

    public ElasticsearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
