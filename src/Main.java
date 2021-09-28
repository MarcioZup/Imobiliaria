public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Fábio", "111111111-11", 2000, 001);
        Morador morador1 = new Morador("José", "222222222-22", 1850, 36 );
        Imovel imovel1 = new Imovel("Rua X", 800, funcionario1);
        imovel1.adicionaMorador(morador1);
        System.out.println(imovel1.toString());
    }
}
