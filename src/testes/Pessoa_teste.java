package testes;

import classes.Pessoa;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Scanner;

public class Pessoa_teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String telefone = "";
        String cpf = "";
        String rg = "";

        try {
            // cria a máscara do telefone
            MaskFormatter mascaraTelefone = new MaskFormatter("(##)#####-####");
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            MaskFormatter mascaraRG = new MaskFormatter("##.###.###-#");

            // cria o campo formatado com a máscara
            JFormattedTextField campoTelefone = new JFormattedTextField(mascaraTelefone);
            JFormattedTextField campoCPF = new JFormattedTextField(mascaraCPF);
            JFormattedTextField campoRG = new JFormattedTextField(mascaraRG);

            // exibe em uma janela simples
            JOptionPane.showMessageDialog(null, campoTelefone, "Digite o telefone:", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, campoCPF, "Digite o telefone:", JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null, campoRG, "Digite o telefone:", JOptionPane.PLAIN_MESSAGE);

            // pega o valor digitado
            telefone = campoTelefone.getText();
            telefone = campoCPF.getText();
            telefone = campoRG.getText();

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println("nome:");
        String nome = scanner.next();
        System.out.println("email:");
        String email = scanner.next();
        //------------------------------------------------------------
        System.out.println("estado:");
        String estado = scanner.next();
        System.out.println("cidade:");
        String cidade = scanner.next();
        System.out.println("bairro:");
        String bairro = scanner.next();
        System.out.println("rua:");
        String rua = scanner.next();
        System.out.println("numero:");
        String numero = scanner.next();
        System.out.println("complemento:");
        String complemento = scanner.next();

        Pessoa pessoa = new Pessoa(nome,cpf,rg,telefone,email,estado,cidade,bairro,rua,numero,complemento);
        System.out.println(pessoa.MostrarDados());
    }
}
