package com.example;

public class Disease {
    private String name;
    private boolean curable;

    public Disease(String name, boolean curable) {
        this.name = name;
        this.curable = curable;
    }

    public String getName() {
        return name;
    }

    public boolean isCurable() {
        return curable;
    }

    //1st Step

    public void setCurable(boolean curable) {
        this.curable = curable;
    }
}
