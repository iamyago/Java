package academy.devjojo.maratonajava.javacore.jkenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");

    // metodo final funciona como valor unico.
    // n pode ser sobrescrito
    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public static TipoCliente TipoClientePorNomeRelatiorio(String nomeRelatorio) {
        for (TipoCliente value : values()) {
            if (value.getNomeRelatorio().equals(nomeRelatorio)) {
                return value;
            }
        }
        return null;
    }
}
