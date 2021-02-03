package com.itacademy.java.opp.basics;

public enum Gender {
    MALE("Male"), FEMALE("Female");

    private String displayName;

    private Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

