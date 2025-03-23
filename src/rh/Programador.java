package rh;

public class Programador extends Funcionario {
    private int ramal;

    public Programador(){super();}
    public Programador(String nome, String cpf, Endereco endereco, double salarioFixo, int ramal) {
        super(nome, cpf, endereco, salarioFixo);
        this.ramal = ramal;
    }

    public double getBonus() {
        return getSalarioFixo() * 0.02;
    }
    public String getDetalhamento() {
        return "Nome: " + this.getNome() + "\nRamal: " + this.getRamal() + "\nEndereco: \n" + this.getEndereco().getEnderecoCompleto() + "\nSalario mensal: " + this.getSalarioFixo() + "\nBonus: " + this.getBonus();
    }

    public int getRamal() {
        return ramal;
    }

    public Programador setRamal(int ramal) {
        this.ramal = ramal;
        return this;
    }

}
