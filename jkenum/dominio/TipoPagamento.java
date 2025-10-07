package academy.devjojo.maratonajava.javacore.jkenum.dominio;

public enum TipoPagamento {
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };
        // metodo nao pode ter corpo
        // metodo criado apenas para ser sobrescrito
        public abstract double calcularDesconto(double valor);
    }