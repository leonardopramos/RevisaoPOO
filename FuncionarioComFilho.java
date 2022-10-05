public class FuncionarioComFilho extends Funcionario {

    private double qtdFilhos;
    
    FuncionarioComFilho(String nome, double salBruto, int qtdFilhos) {
        super(nome, salBruto);
        this.qtdFilhos = qtdFilhos;
    }
    @Override
    public double getSalarioLiquido() {
        double adicional = (getSalarioBruto() * 0.01) * qtdFilhos;
        return super.getSalarioLiquido() + adicional;
    }
}
