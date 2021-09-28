import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {

    private List<Imovel>imoveis = new ArrayList<>();

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void adicionaImoveis(Imovel novoImovel){
        imoveis.add(novoImovel);
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "imoveis=" + imoveis +
                '}';
    }
}
