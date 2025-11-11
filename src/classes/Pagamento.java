package classes;

public class Pagamento {
    //Atributos
    protected String forma_pagamento;
    protected String status;
    protected String data;
    protected float valor;

    //Construtor
    public Pagamento(String forma_pagamento, String status, String data, float valor) {
        this.forma_pagamento = forma_pagamento;
        this.status = status;
        this.data = data;
        this.valor = valor;
    }

    //Métodos
    public float CalcularMaoDeObra(float mao_de_obra) {
        valor = valor + mao_de_obra;
        return valor;
    }

    public String MostrarDados() {
        return "Forma pagamento: " + this.forma_pagamento +
                "\nStatus: " + this.status +
                "\nData: " + this.data  +
                "\nValor: R$" + this.valor;
    }
}
