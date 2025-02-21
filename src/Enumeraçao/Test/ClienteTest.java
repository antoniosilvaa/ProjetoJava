package Enumeraçao.Test;

import Enumeraçao.dominio.Cliente;
import Enumeraçao.dominio.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Antonio", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Biatriz", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Aecio Flavio", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Aride", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
