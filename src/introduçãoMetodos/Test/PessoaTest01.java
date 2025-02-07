package introduçãoMetodos.Test;

import introduçãoMetodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Antonio");
        pessoa.setIdade(0);


        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
