public class Funcionario extends Pessoa{

    private double numeroDoCreci;

    public Funcionario(double numeroDoCreci) {
        this.numeroDoCreci = numeroDoCreci;
    }

    public Funcionario(String nome, String cpf, double salario, double numeroDoCreci) {
        super(nome, cpf, salario);
        this.numeroDoCreci = numeroDoCreci;
    }

    public double getNumeroDoCreci() {
        return numeroDoCreci;
    }

    public void setNumeroDoCreci(double numeroDoCreci) {
        this.numeroDoCreci = numeroDoCreci;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " + getNome());
        retorno.append(" CPF: " + getCpf());
        retorno.append(" Salário R$ " + getSalario());
        retorno.append(" Número do Creci: " + numeroDoCreci);
        return retorno.toString();
    }
}
