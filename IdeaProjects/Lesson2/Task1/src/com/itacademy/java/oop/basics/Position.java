package com.itacademy.java.oop.basics;

public enum Position {
    WORKER("Worker"), BOSS("Boss");

    public String getDisplayName() {
        return displayName;
    }

    private String displayName;

    private Position(String displayName){
        this.displayName = displayName;
    }

}
