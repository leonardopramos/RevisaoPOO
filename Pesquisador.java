public class Pesquisador extends Funcionario{
    
    private String catPesquisa;

    public Pesquisador(String nome, double salBruto, String catPesquisa){
        super(nome, salBruto);
        this.catPesquisa = catPesquisa;
    }

    public String getCatPesquisa() {
        return catPesquisa;
    }
}
