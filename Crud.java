import java.util.ArrayList;
import java.util.Scanner;

public class Crud {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> cpfs = new ArrayList<>();

        String cpf, cpf_busca, nome;
        int escolha, indice;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha a operação");
            System.out.println("1- Adicionar aluno");
            
         
            escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o cpf do aluno");
                cpf = scan.next();
                System.out.println("Digite o nome do aluno");
                nome = scan.next();

                //adicionar no banco de dados
                nomes.add(nome);
                cpfs.add(cpf);

                System.out.println("Aluno adicionado com sucesso");           
                       
            }
            
        }
        
    }
    
}
