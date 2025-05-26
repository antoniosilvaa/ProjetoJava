package Serialization.test;

import Serialization.domain.Aluno;
import Serialization.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) throws IOException {
        Aluno aluno = new Aluno(1L, "Antonio", "antonio1914");
        Turma turmaMat = new Turma("Matematica");
        aluno.setTurma(turmaMat);
        serialization(aluno);
        Descserialization();
    }

    private static void serialization(Aluno aluno) throws IOException {
        Path alunoSer = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(alunoSer))) {
            outputStream.writeObject(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void Descserialization() throws IOException {
        Path alunoSer = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(alunoSer))) {
            Aluno aluno = (Aluno) inputStream.readObject();
            System.out.println(aluno);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
