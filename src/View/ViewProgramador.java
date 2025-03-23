package View;

import rh.Endereco;
import rh.Programador;

import java.util.Scanner;

public class ViewProgramador {
    private static void exibirMenu(){
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Cadastrar programador/Alterar programador");
        System.out.println("2 - Exibir Gerente");
        System.out.println("0 - Sair");
    }
    private static Programador cadastrarProgramador() {
        Programador programador = new Programador();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do programador: ");
        programador.setNome(sc.nextLine());
        System.out.println("Digite o cpf do programador: ");
        programador.setCpf(sc.nextLine());
        System.out.println("Digite o endereco do programador:");
        System.out.println("Logradouro:");
        String logradouro = sc.nextLine();
        System.out.println("Numero:");
        int numero = sc.nextInt();
        System.out.println("Complemento:");
        String complemento = sc.nextLine();
        System.out.println("Cep:");
        String cep = sc.nextLine();
        System.out.println("Cidade:");
        String cidade = sc.nextLine();
        System.out.println("Estado:");
        String estado = sc.nextLine();
        programador.setEndereco(new Endereco(logradouro,numero,complemento,cep,cidade,estado));
        System.out.println("Informe o salario fixo do programador: ");
        programador.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o ramal do programador: ");
        programador.setRamal(sc.nextInt());
        return programador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programador programador = null;
        int op;

        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    programador = cadastrarProgramador();
                    break;
                case 2:
                    if (programador != null) {
                        System.out.println(programador.getDetalhamento());}
                    else
                    {System.out.println("Nenhum programador encontrado");}
                    break;
                case 0:
                    System.out.println("Finalizando");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (op != 0);
        sc.close();
    }
}
