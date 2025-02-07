package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Funcionario;
import introduçãoMetodos.Dominio.Pessoa;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Antonio");
        funcionario.setIdade(20);
        funcionario.setSalarios(new double[]{1300, 1230, 1518});

        funcionario.impressora();
        System.out.println("Media " + funcionario.getMedia());
    }
}
