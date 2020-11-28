package com.global.view;

import java.io.Serializable;

import oracle.adf.controller.TaskFlowId;

public class RegionBean implements Serializable {
    private String taskFlowId = "/WEB-INF/cat-prod-flow.xml#cat-prod-flow";

    public RegionBean() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String catprodflow() {
        setDynamicTaskFlowId("/WEB-INF/cat-prod-flow.xml#cat-prod-flow");
        return null;
    }
}
