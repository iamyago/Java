package academy.devjojo.maratonajava.javacore.jkenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    // metodo final funciona como valor unico.
    // n pode ser sobrescrito
    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
