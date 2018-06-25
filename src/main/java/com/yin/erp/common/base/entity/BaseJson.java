package com.yin.erp.common.base.entity;


import com.yin.erp.common.base.entity.po.BaseVo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author yin.weilong
 * @date 2018.06.25
 */
@Builder
public class BaseJson {

    public static final String SUCCESS = "0";

    public static final String ERROR = "1";

    public static final String MESSAGE_OK = "操作成功";

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private Object data;

    @Getter
    @Setter
    private String message;

    /**
     * 成功消息
     *
     * @param data
     * @return
     */
    public static BaseJson success(Object data) {
        return BaseJson.builder().code(SUCCESS).data(data).message(MESSAGE_OK).build();
    }

    public static BaseJson success() {
        return BaseJson.builder().code(SUCCESS).message(MESSAGE_OK).build();
    }

    /**
     * 错误消息
     *
     * @param message
     * @return
     */
    public static BaseJson error(String message) {
        return BaseJson.builder().code(ERROR).message(message).build();
    }
}
