package com.chiyu.traft.config;

import com.chiyu.traft.model.Peer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianqiyu119@gmail.com
 */
public class TRaftConfiguration {
  private TRaftRpcServerConfiguration rpcServerConfiguration;

  private final List<Peer> peerList = new ArrayList<>();

  public TRaftRpcServerConfiguration getRpcServerConfiguration() {
    return rpcServerConfiguration;
  }

  public void setRpcServerConfiguration(TRaftRpcServerConfiguration rpcServerConfiguration) {
    this.rpcServerConfiguration = rpcServerConfiguration;
  }

  public List<Peer> addPeer(Peer peer) {
    peerList.add(peer);
    return peerList;
  }

  public List<Peer> getPeerList() {
    return peerList;
  }

  public List<Peer> removePeer(Peer peer) {
    peerList.remove(peer);
    return peerList;
  }
}
