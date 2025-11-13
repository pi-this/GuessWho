package com.example.guesswho;

public enum Questions {
    EYES("Does your character have eyes?"),
    LEGS("Does your character have legs?"),
    ARMS("Does your character have arms?"),
    MOUTH("Does your character have a mouth?"),
    NOSE("Does your character have a nose?"),
    CUBE_FACE("Is the Character's face a cube?"),
    EYE("Does your character have only one eye?");

    public String value;

    private Questions(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
