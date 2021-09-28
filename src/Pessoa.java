public class Pessoa {

    private String nome;
    private String cpf;
    private double salario;

    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " + nome);
        retorno.append(" CPF: " + cpf);
        retorno.append(" Salário R$ " + salario);
        return retorno.toString();
    }
}
