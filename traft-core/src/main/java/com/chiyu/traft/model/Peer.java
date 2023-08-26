package com.chiyu.traft.model;

import lombok.Builder;

/**
 * @author tianqiyu119@gmail.com
 */
@Builder
public class Peer {
  private String groupId;
  private String ip;
  private Integer port;
  private String name;
  private Integer priority;

  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  @Override
  public String toString() {
    return "Peer{" +
            "groupId='" + groupId + '\'' +
            ", ip='" + ip + '\'' +
            ", port=" + port +
            ", name='" + name + '\'' +
            ", priority=" + priority +
            '}';
  }
}
