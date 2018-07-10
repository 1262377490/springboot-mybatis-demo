package com.test.demo.bean;

import java.util.Date;

public class Order {
    private String id;

    private String warehouseName;

    private String agentPerson;

    private Date createAt;

    private String fromwhere;

    private Object detail;

    private String remarks;

    private Byte status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public String getAgentPerson() {
        return agentPerson;
    }

    public void setAgentPerson(String agentPerson) {
        this.agentPerson = agentPerson == null ? null : agentPerson.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getFromwhere() {
        return fromwhere;
    }

    public void setFromwhere(String fromwhere) {
        this.fromwhere = fromwhere == null ? null : fromwhere.trim();
    }

    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}