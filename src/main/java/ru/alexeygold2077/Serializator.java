package ru.alexeygold2077;

import java.io.*;
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

    public T Deserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(filePath)));
        @SuppressWarnings("unchecked") T forReturt = (T) objectInputStream.readObject();
        return forReturt;
    }
}
