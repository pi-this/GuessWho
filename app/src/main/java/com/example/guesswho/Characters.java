package com.example.guesswho;

public enum Characters {
    AL("Al"),
    BUD("Bud"),
    CHUCK("Chuck"),
    ERIC("Eric"),
    GREG("Greg"),
    JAY("Jay"),
    TIMMY("Timmy"),
    TYSON("Tyson");

    public String value;

    private Characters(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
