package com.neeloo.PraticeTest.model;

public class Todo {
    public Todo(int id, String task, boolean completed) {
        this.id = id;
        this.task = task;
        this.completed = completed;
    }

   public Todo(){}

    int id;
    String task;
    boolean completed;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


}
