package View;

import rh.Endereco;
import rh.Vendedor;

import java.util.Scanner;

public class ViewVendedor {
    private static void exibirMenu(){
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Cadastrar programador/Alterar programador");
        System.out.println("2 - Exibir Gerente");
        System.out.println("0 - Sair");
    }
    private static Vendedor cadastrarVendedor() {
        Vendedor vendedor = new Vendedor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        vendedor.setNome(sc.nextLine());
        System.out.println("Digite o cpf do vendedor: ");
        vendedor.setCpf(sc.nextLine());
        System.out.println("Digite o endereco do vendedor:");
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
        vendedor.setEndereco(new Endereco(logradouro,numero,complemento,cep,cidade,estado));
        System.out.println("Informe o salario fixo do vendedor: ");
        vendedor.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o valor de vendas semestral: ");
        vendedor.setVendasSemestral(sc.nextDouble());
        return vendedor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vendedor vendedor = null;
        int op;

        do {
            exibirMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    vendedor = cadastrarVendedor();
                    break;
                case 2:
                    if (vendedor != null) {
                        System.out.println(vendedor.getDetalhamento());}
                    else
                    {System.out.println("Nenhum vendedor encontrado");}
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
