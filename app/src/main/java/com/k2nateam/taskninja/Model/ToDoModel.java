package com.k2nateam.taskninja.Model;

public class ToDoModel {
    private int id, sts;
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSts() {
        return sts;
    }

    public void setSts(int sts) {
        this.sts = sts;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
