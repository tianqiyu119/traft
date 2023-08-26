package com.chiyu.traft.config;

import com.chiyu.traft.model.Peer;

/**
 * @author tianqiyu119@gmail.com
 */
public class TRaftNodeConfiguration extends TRaftConfiguration {
  private Peer peer;

  public Peer getPeer() {
    return peer;
  }

  public void setPeer(Peer peer) {
    this.peer = peer;
  }
}
