package academy.devjojo.maratonajava.javacore.jkenum.dominio;
// Enumeração - serve como enumeração, como debito e credito.
// é possivel colocar ENUM dentro de uma classe: public enum TipoPagamento {
//        DEBITO, CREDITO
//    }
// mas que não é uma boa pratica.
public class cliente {
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
