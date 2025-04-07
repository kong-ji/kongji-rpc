package org.kongji.rpc.transmission;

import org.kongji.rpc.dto.RpcReq;
import org.kongji.rpc.dto.RpcResp;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */
public interface RpcClient {
    RpcResp<?> sendReq(RpcReq req);
}
