package com.chiyu.traft.model;

import java.io.Serializable;

/**
 * @author tianqiyu119@gmail.com
 **/

public abstract class Node implements Serializable {
    private String id;
    private Peer peer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Peer getPeer() {
        return peer;
    }

    public void setPeer(Peer peer) {
        this.peer = peer;
    }
}
