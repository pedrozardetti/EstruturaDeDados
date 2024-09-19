import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Solicitar nova senha comum");
            System.out.println("2 - Solicitar nova senha prioritária");
            System.out.println("3 - Chamar o próximo paciente");
            System.out.println("4 - Listar todas as senhas");
            System.out.println("5 - Visualizar quem é o próximo");
            System.out.println("6 - Excluir uma senha");
            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite a senha comum: ");
                    String senhaComum = sc.nextLine();
                    fila.adicionarComum(senhaComum);
                    break;
                case 2:
                    System.out.print("Digite a senha prioritária: ");
                    String senhaPrioridade = sc.nextLine();
                    fila.adicionarPrioridade(senhaPrioridade);
                    break;
                case 3:
                    System.out.println(fila.chamarProximo());
                    break;
                case 4:
                    fila.listarSenhas();
                    break;
                case 5:
                    System.out.println(fila.proximoVisualizar());
                    break;
                case 6:
                    System.out.print("Excluir senha de qual tipo (comum/prioridade)? ");
                    String tipo = sc.nextLine();
                    fila.excluirSenha(tipo);
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
