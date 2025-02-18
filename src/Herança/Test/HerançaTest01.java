package Herança.Test;

import Herança.dominio.Endereço;
import Herança.dominio.Funcionario;
import Herança.dominio.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        Pessoa pessoa = new Pessoa("Antonio");
        endereço.setCep("60330-878");
        endereço.setRua("Rua Irapuã");
        endereço.getCep();
        endereço.getRua();
        pessoa.setCpf("888888888888");
        pessoa.setEndereço(endereço);

        pessoa.imprime();


        System.out.println("-----------");

        Funcionario funcionario = new Funcionario("Bia");


        funcionario.setCpf("9999999999");
        funcionario.setSalario(2220);
        funcionario.setEndereço(endereço);
        funcionario.imprime();
        funcionario.relatorioPagamento();

    }
}
