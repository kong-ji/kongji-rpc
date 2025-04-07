package org.kongji.client;


import org.kongji.api.User;
import org.kongji.api.UserService;
import org.kongji.rpc.dto.RpcReq;
import org.kongji.rpc.dto.RpcResp;
import org.kongji.rpc.transmission.RpcClient;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */

public class Main {
    public static void main(String[] args) {
        /*
         *需要将远程调用变成本地调用,如下
         */
//        UserService userService = new UserServiceImpl() == 远程调用;
//        User user = userService.getUser();
//        System.out.println(user);

        RpcClient rpcClient = new RpcClient() {
            @Override
            public RpcResp<?> sendReq(RpcReq req) {


                return null;
            }
        };
    }
}
