//EXEMPLO DE PÉSSIMAS PRATICAS EM "RETORNO"
package boaspraticas.retorno;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    String razaoSocial;
	List listaFuncionarios;
	public Empresa(){
		this.listaFuncionarios = new ArrayList<Funcionario>();
	}
    //Se razaoSocial estiver vazio terá de ser feito varias comparação com NULL.
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
	//Se listaFuncionarios estiver vazio terá de ser feito varias comparação com NULL.
	public List getListaFuncionarios(){
		return this.listaFuncionarios;
	}
}
