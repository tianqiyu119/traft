package com.chiyu.traft.core;

import com.chiyu.traft.model.Peer;
import com.chiyu.traft.model.TRaftNode;

/**
 * @author tianqiyu119@gmail.com
 **/

public class TRaftNodeFactory {
    public TRaftNode createTRaftNode(final Peer peer) {
        return new TRaftNode(peer);
    }
}
