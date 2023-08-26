package com.chiyu.traft.rpc;

import com.chiyu.traft.config.TRaftNodeConfiguration;

/**
 * @author tianqiyu119@gmail.com
 **/

public class AbstractServer implements RpcServer {
    protected TRaftNodeConfiguration configuration;
    @Override
    public void start() {

    }

    public TRaftNodeConfiguration getConfiguration() {
        return configuration;
    }
}
