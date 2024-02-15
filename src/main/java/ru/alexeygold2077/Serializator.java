package ru.alexeygold2077;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Serializator <T> {

    private final T object;
    private final String filePath;

    Serializator(T object, String filePath) {
        this.object = object;
        this.filePath = filePath;
    }

    public void Serialize() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(filePath)));
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }
}
