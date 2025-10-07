package academy.devjojo.maratonajava.javacore.jkenum.teste;

import academy.devjojo.maratonajava.javacore.jkenum.dominio.TipoCliente;
import academy.devjojo.maratonajava.javacore.jkenum.dominio.TipoPagamento;
import academy.devjojo.maratonajava.javacore.jkenum.dominio.cliente;


public class clienteTeste {
    public static void main(String[] args) {
        cliente cliente1 = new cliente("Yago", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        cliente cliente2 = new cliente("Joao", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(cliente1);
        System.out.println(cliente2);
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.TipoClientePorNomeRelatiorio("PESSOA_JURIDICA");
        System.out.println(tipoCliente2);
        System.out.println(tipoCliente);
    }
}
