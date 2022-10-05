public class App {
    public static void main(String[] args) throws Exception {

        Funcionario f = new Funcionario("Paulo", 999999999);
        Funcionario f1 = new Funcionario("Joao", 99999999);
        Funcionario f2 = new Funcionario("Rogerio", 99999999);
        FuncionarioComFilho f3 = new FuncionarioComFilho("Sergio", 100, 2);
        Pesquisador f4 = new Pesquisador("Luciano", 1299, "Biologia");

        System.out.println(f.getMatricula());
        System.out.println(f1.getMatricula());
        System.out.println(f2.getMatricula());
        System.out.println(f3.getSalarioLiquido());

        if(f4 instanceof Pesquisador){
            Pesquisador aux = (Pesquisador) f4;
            System.out.println(aux.getCatPesquisa());
        }
    }
}
