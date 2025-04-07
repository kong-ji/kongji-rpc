package org.kongji.rpc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */
@Getter
@ToString
@AllArgsConstructor
public enum RpcRespStatus {
    SUCCESS(0, "success"),
    FAIL(9999, "fail"),
    ;

    private final int code;
    private final String msg;

    public static boolean isSuccessful(Integer code) {
        return SUCCESS.getCode() == code;
    }


    public static boolean isFailed(Integer code) {
        return !isSuccessful(code);
    }
}
