package rh;

public class Gerente extends Funcionario {
    private int sala;
    private int ramal;
    private double faturamentoSemestral;

    public Gerente(){
        super();
    };
    public Gerente(String nome, String cpf, Endereco endereco, double salarioFixo, int sala, int ramal, double faturamentoSemestral){
        super(nome, cpf, endereco, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }

    @Override
    public double getBonus() {
        return getFaturamentoSemestral() * 0.05;
    }

    public String getDetalhamento() {
        return "Nome: " + this.getNome() +"\nSala : " + getSala() +"\nRamal: " + this.getRamal() + "\nEndereco: \n" + this.getEndereco().getEnderecoCompleto() +"\nSalario mensal: " + this.getSalarioFixo() +"\nFaturamento: " + this.getFaturamentoSemestral() + "\nBonus: " + this.getBonus();
    }

    public int getSala() {
        return sala;
    }

    public Gerente setSala(int sala) {
        this.sala = sala;
        return this;
    }

    public int getRamal() {
        return ramal;
    }

    public Gerente setRamal(int ramal) {
        this.ramal = ramal;
        return this;
    }

    public double getFaturamentoSemestral() {
        return faturamentoSemestral;
    }

    public Gerente setFaturamentoSemestral(double faturamentoSemestral) {
        this.faturamentoSemestral = faturamentoSemestral;
        return this;
    }
}
