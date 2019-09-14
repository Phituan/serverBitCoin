package com.example.assignmentpart1.entity;

public class JsonResponse {
    private int status;
    private String message;
    private Object metaData;

    public int getStatus() {
        return status;
    }

    public JsonResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public JsonResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getMetaData() {
        return metaData;
    }

    public JsonResponse setMetaData(Object metaData) {
        this.metaData = metaData;
        return this;
    }
}
