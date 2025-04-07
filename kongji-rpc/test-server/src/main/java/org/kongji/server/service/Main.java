package org.kongji.server.service;

import org.kongji.rpc.transmission.RpcServer;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */

public class Main {
    public static void main(String[] args) {
        RpcServer rpcServer = new RpcServer() {
            @Override
            public void start() {
                //  服务端启动...
            }
        };
        rpcServer.start();
    }
}
