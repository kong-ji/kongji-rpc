package org.kongji.rpc.dto;

import cn.hutool.core.util.StrUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RpcReq implements Serializable {
    private static final long serialVersionUID = 1L;

    private String reqId;
    private String interfaceName;
    private String methodName;
    private Object[] params;
    private Class<?>[] paramTypes;
    private String version;
    private String group;


    public String rpcServiceName() {
        return getInterfaceName()
                + StrUtil.blankToDefault(getVersion(), StrUtil.EMPTY)
                + StrUtil.blankToDefault(getGroup(), StrUtil.EMPTY);
    }
}
