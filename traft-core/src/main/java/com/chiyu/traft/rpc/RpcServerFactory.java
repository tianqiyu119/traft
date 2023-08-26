package com.chiyu.traft.rpc;

import com.chiyu.traft.config.TRaftNodeConfiguration;
import com.chiyu.traft.enums.RpcServerEnum;

/**
 * @author tianqiyu119@gmail.com
 */
public class RpcServerFactory {

  public static RpcServer createRpcServer(TRaftNodeConfiguration configuration) {
    RpcServer rpcServer;
    final RpcServerEnum rpcServerType =
        configuration.getRpcServerConfiguration().getRpcServerType();
    if (rpcServerType == RpcServerEnum.grpc) {
      rpcServer = new GRpcServer(configuration);
    }
    rpcServer = new TRaftRpcServer(configuration);
    return rpcServer;
  }
}
