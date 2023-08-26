package com.chiyu.traft.model;

import com.chiyu.traft.config.TRaftNodeConfiguration;
import com.chiyu.traft.enums.State;
import com.chiyu.traft.rpc.RpcServer;
import com.chiyu.traft.rpc.RpcServerFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author underwood/tianqiyu119@126.com
 */
@Slf4j
public class TRaftNode extends Node {
  private volatile State state;

  public TRaftNode(Peer peer) {
    super();
    this.setPeer(peer);
  }

  public boolean init(TRaftNodeConfiguration configuration) {
    this.setPeer(configuration.getPeer());
    if (configuration.getRpcServerConfiguration().getStartRpcServer()) {
      this.startRpcServer(configuration);
    }
    log.info("TRaft node init successfully. {}", configuration.getPeer());
    return true;
  }

  private void startRpcServer(TRaftNodeConfiguration configuration) {
    final RpcServer rpcServer = RpcServerFactory.createRpcServer(configuration);
    rpcServer.start();
  }
}
