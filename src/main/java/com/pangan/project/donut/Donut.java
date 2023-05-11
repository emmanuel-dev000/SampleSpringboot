package com.pangan.project.donut;

public class Donut {
    private String id;
    private String name;

    public Donut() {
    }

    public Donut(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
