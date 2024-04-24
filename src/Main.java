import java.util.*;

/**
 * @author bruno
 */

public class Main {

    public static void main(String[] args) {

        listaDeAlunos();

    }

    private static void listaDeAlunos() {
        Scanner s = new Scanner(System.in);
        Set<String> lista = new TreeSet<>();

        System.out.println("Deseja adicionar um novo aluno?");
        System.out.println("Digite S para sim e N para não");
        String resposta = s.next();

        while(resposta.equalsIgnoreCase("S")) {

            //Coleta de nomes.
            System.out.println("Digite o nome do aluno.");
            lista.add(s.next());

            //Confirmação de necessidade de mais adições.
            System.out.println("Deseja adicionar algum aluno?");
            resposta = s.next();
        }

        System.out.println("Seus alunos foram adicionados com sucesso.");
        System.out.println("Aqui está a lista de alunos em ordem alfabética.");
        System.out.println(lista);
        System.out.println("Obrigado!");
    }
}

