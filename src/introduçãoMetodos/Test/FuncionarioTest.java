package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();


        funcionario.Nome = "Antonio";
        funcionario.idade = 20;
        funcionario.salarios = new double[]{1200, 1320};

        funcionario.impressora();
    }
}
