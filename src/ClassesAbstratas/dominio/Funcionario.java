package ClassesAbstratas.dominio;

public abstract class Funcionario {

    protected double salario;
    protected String nome;

    public Funcionario( String nome, double salario) {
        this.salario = salario;
        this.nome = nome;
        calcularBonus();
    }
    public abstract void calcularBonus();
}
