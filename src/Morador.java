public class Morador extends Pessoa{

    private int tempoDeContrato;

    public Morador(String nome, String cpf, double salario, int tempoDeContrato) {
        super(nome, cpf, salario);
        this.tempoDeContrato = tempoDeContrato;
    }

    public int getTempoDeContrato() {
        return tempoDeContrato;
    }

    public void setTempoDeContrato(int tempoDeContrato) {
        this.tempoDeContrato = tempoDeContrato;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome: " + getNome());
        retorno.append(" CPF: " + getCpf());
        retorno.append(" Salário R$ " + getSalario());
        retorno.append(" Tempo de contrato: " + tempoDeContrato + " meses.");
        return retorno.toString();
    }
}
