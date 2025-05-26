package Serialization.domain;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = -3621096720687718379L;

    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;


    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }


    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
           String newTurma = ois.readUTF();
           turma = new Turma(newTurma);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
