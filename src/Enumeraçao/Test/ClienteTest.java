package Enumeraçao.Test;

import Enumeraçao.dominio.Cliente;
import Enumeraçao.dominio.TipoCliente;
import Enumeraçao.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Antonio", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Beatriz", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
