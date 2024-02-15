package ru.alexeygold2077;

import java.io.Serializable;

public class TestClass implements Serializable {
    public String ulala = "I am a ulala!";

    @Override
    public String toString() {
        return ulala;
    }
}
