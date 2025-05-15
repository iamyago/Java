package academy.devjojo.maratonajava.javacore.jkenum.teste;

import academy.devjojo.maratonajava.javacore.jkenum.dominio.TipoCliente;
import academy.devjojo.maratonajava.javacore.jkenum.dominio.cliente;
import academy.devjojo.maratonajava.javacore.jkenum.dominio.cliente.TipoPagamento;

public class clienteTeste {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("Yago", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        cliente cliente2 = new cliente("Joao", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
