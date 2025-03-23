package rh;

public class Vendedor extends Funcionario {
    private double vendasSemestral;

    public Vendedor() {super();}

    public Vendedor(String nome, String cpf, Endereco endereco, double salariofixo, double vendasSemestral){
        super(nome, cpf, endereco, salariofixo);
        this.vendasSemestral = vendasSemestral;
    }

    @Override
    public double getBonus() {
        return getVendasSemestral() * 0.015;
    }
    public String getDetalhamento() {
        return "Nome: " + getNome() + "\nCpf: " + getCpf() + "\nEndereço: \n" + getEndereco().getEnderecoCompleto() + "\nSalarioFixo: " + getSalarioFixo() + "\nVendas: " + getVendasSemestral() + "\nBonus: " + getBonus();
    }

    public double getVendasSemestral() {
        return vendasSemestral;
    }

    public Vendedor setVendasSemestral(double vendasSemestral) {
        this.vendasSemestral = vendasSemestral;
        return this;
    }
}
