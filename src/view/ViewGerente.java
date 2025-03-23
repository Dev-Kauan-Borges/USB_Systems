package view;

import rh.Endereco;
import rh.Gerente;

import java.util.Scanner;

public class ViewGerente {
        private static void exibirMenu(){
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Cadastrar Gerente/Alterar Gerente");
            System.out.println("2 - Exibir Gerente");
            System.out.println("0 - Sair");
    }
        private static Gerente cadastrarGerente() {
            Gerente gerente = new Gerente();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o nome do gerente: ");
            gerente.setNome(sc.nextLine());
            System.out.println("Digite o cpf do gerente: ");
            gerente.setCpf(sc.nextLine());
            System.out.println("Digite o endereco do gerente:");
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
            gerente.setEndereco(new Endereco(logradouro,numero,complemento,cep,cidade,estado));
            System.out.println("Informe o salario fixo do Gerente: ");
            gerente.setSalarioFixo(sc.nextDouble());
            System.out.println("Informe a sala do Gerente: ");
            gerente.setSala(sc.nextInt());
            System.out.println("Informe o ramal do Gerente: ");
            gerente.setRamal(sc.nextInt());
            System.out.println("Informe o faturamento semestral do Gerente: ");
            gerente.setFaturamentoSemestral(sc.nextDouble());
            return gerente;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = null;
        int op;

        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    gerente = cadastrarGerente();
                    break;
                case 2:
                    if (gerente != null) {
                        System.out.println(gerente.getDetalhamento());}
                    else
                        {System.out.println("Nenhum gerente encontrado");}
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


