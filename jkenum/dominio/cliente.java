package academy.devjojo.maratonajava.javacore.jkenum.dominio;
// Enumeração - serve como
// é possivel colocar ENUM dentro de uma classe: public enum TipoPagamento {
//        DEBITO, CREDITO
//    }
// mas que não é uma boa pratica.
public class cliente {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
