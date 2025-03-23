package rh;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private double salarioFixo;

    public Funcionario(){}
    public Funcionario(String nome, String cpf, Endereco endereco, double salarioFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salarioFixo = salarioFixo;

    }


    public String getNome() {
        return nome;
    }

    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Funcionario setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Funcionario setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
        return this;
    }
    public abstract double getBonus();
    public abstract String getDetalhamento();
}
