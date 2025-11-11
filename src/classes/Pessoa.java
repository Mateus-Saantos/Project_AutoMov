package classes;

public class Pessoa {
    //Atributos
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String telefone;
    protected String email;
    //ENDERECO
    protected String estado;
    protected String cidade;
    protected String bairro;
    protected String rua;
    protected String numero;
    protected String complemento;

    //Construtor
    public Pessoa(String nome, String cpf, String rg, String telefone,
                  String email, String estado, String cidade, String bairro,
                  String rua, String numero, String complemento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    //Métodos
    public String MostrarDados(){
        return "\nnome: " + this.nome +
                "\ncpf: " + this.cpf +
                "\nrg: " + this.rg +
                "\ntelefone: " + this.telefone +
                "\nemail: " + this.email +
                "\nestado: " + this.estado +
                "\ncidade: " + this.cidade +
                "\nbairro: "+ this.bairro +
                "\nrua: "+ this.rua +
                "\nnumero: "+ this.numero +
                "\ncomplemento: "+ this.complemento +
                "\n\n=========================================\n";
    }

}
