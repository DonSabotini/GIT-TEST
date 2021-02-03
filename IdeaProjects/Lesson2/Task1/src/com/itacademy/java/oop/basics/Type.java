package com.itacademy.java.oop.basics;

public enum Type {
    FULLTIME("Full-time"), PARTTIME("Part-time");

    public String getDisplayName() {
        return displayName;
    }

    private String displayName;

    private Type(String displayName){
        this.displayName = displayName;
    }

}
