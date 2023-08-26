package com.chiyu.traft.rpc;

import com.chiyu.traft.config.TRaftNodeConfiguration;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tianqiyu119@gmail.com
 */
@Slf4j
public class TRaftRpcServer extends AbstractServer {

  public TRaftRpcServer(TRaftNodeConfiguration configuration) {
    this.configuration = configuration;
  }

  @Override
  public void start() {
    super.start();

  }
}
