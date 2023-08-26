package com.chiyu.traft.config;

import com.chiyu.traft.enums.RpcServerEnum;

/**
 * @author tianqiyu119@gmail.com
 **/

public class TRaftRpcServerConfiguration {
    private RpcServerEnum rpcServerType = RpcServerEnum.tRaft;
    private Boolean startRpcServer;

    public Boolean getStartRpcServer() {
        return startRpcServer;
    }

    public void setStartRpcServer(Boolean startRpcServer) {
        this.startRpcServer = startRpcServer;
    }

    public RpcServerEnum getRpcServerType() {
        return rpcServerType;
    }

    public void setRpcServerType(RpcServerEnum rpcServerType) {
        this.rpcServerType = rpcServerType;
    }
}
