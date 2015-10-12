//EXEMPLO DE BOAS PRATICAS EM "PARAMETROS DE FUNÇÕES"
package boaspraticas.parametros;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List listaClientes;
    
	public Agenda(){
		this.listaClientes = new ArrayList<Cliente>();
	}
	
    // Somente um parametro (neste caso um objeto que engloba várias propriedades
    // previnindo o envio de varios parametros no construtor).
    public void addClientes(Cliente cliente){
        this.listaClientes.add(cliente);
    }
}
