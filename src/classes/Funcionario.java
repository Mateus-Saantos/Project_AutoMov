package classes;

public class Funcionario extends Pessoa{

    //Atributos
    protected String login;
    protected String senha;
    protected String cargo;

    //Construtor herdado de pessoa
    public Funcionario(String nome, String cpf, String rg, String telefone,
                       String email, String estado, String cidade, String bairro,
                       String rua, String numero, String complemento,
                       String login, String senha, String cargo) {
        super(nome, cpf, rg, telefone, email, estado, cidade, bairro, rua, numero, complemento);
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    //Métodos
}
