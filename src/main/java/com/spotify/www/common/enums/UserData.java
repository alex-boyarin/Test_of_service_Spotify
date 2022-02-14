package com.spotify.www.common.enums;

public enum UserData {
    EMAIL("email"),
    PASSWORD("password");
    private String value;

    UserData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
