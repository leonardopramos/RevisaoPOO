import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CadastroFuncionarios {

    private ArrayList<Funcionario> funcionarios;

    public CadastroFuncionarios() {

        funcionarios = new ArrayList<>();

    }

    public void cadastraFuncionario(Funcionario funcionario) {

        funcionarios.add(funcionario);

    }

    public Funcionario recuperaPorMatricula(String matricula) {

        for (Funcionario func : funcionarios) {

            if (func.getMatricula().equals(matricula)) {

                return func;

            }

        }

        return null;

    }
    public List<Funcionario> getPorSalario(double limite){
        List<Funcionario> aux = new LinkedList<>();
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getSalarioLiquido() < limite){
                aux.add(funcionarios.get(i));
            }
        }
        Collections.sort(aux, new ComparadorFunc());
        //ou
        // Collections.sort(aux, new Comparator<Funcionario>(){
        //     public int compare(Funcionario f1, Funcionario f2{
        //         return(f1.getNome().compareTo(f2.getNome()));
        //     });
        // });
        return aux;
    }

}