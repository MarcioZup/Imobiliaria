import java.util.ArrayList;
import java.util.List;

public class Imovel {

    private String endereco;
    private double aluguel;
    private Funcionario funcionarioresponsavel;
    private List<Morador>moradores = new ArrayList<>();

    public Imovel(String endereco, double aluguel, Funcionario funcionarioresponsavel) {
        this.endereco = endereco;
        this.aluguel = aluguel;
        this.funcionarioresponsavel = funcionarioresponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAluguel() {
        return aluguel;
    }

    public void setAluguel(double aluguel) {
        this.aluguel = aluguel;
    }

    public Funcionario getFuncionarioresponsavel() {
        return funcionarioresponsavel;
    }

    public void setFuncionarioresponsavel(Funcionario funcionarioresponsavel) {
        this.funcionarioresponsavel = funcionarioresponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void adicionaMorador(Morador novoMorador){
        moradores.add(novoMorador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\nEndereço: " + endereco);
        retorno.append("\nValor do aluguel: R$ " + aluguel);
        retorno.append("\nMoradores: " + getMoradores());
        retorno.append("\nFuncionário responsável: " + getFuncionarioresponsavel());
        return retorno.toString();
    }
}
