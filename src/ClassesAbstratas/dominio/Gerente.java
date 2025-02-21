package ClassesAbstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.03;
    }

    @Override
    public String toString() {
        return "Gerente " +
                "nome: " + nome +
                ", salario: " + salario;
    }
}
