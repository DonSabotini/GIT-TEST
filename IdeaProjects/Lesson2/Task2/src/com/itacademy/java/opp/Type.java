package com.itacademy.java.opp;

public enum Type {
    LEASING("Leasing loan"), CONSUMER("Consumer loan");

    private String displayName;

    private Type(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
