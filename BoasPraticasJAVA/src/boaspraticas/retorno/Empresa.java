//EXEMPLO DE PÉSSIMAS PRATICAS EM "RETORNO"
package boaspraticas.retorno;

public class Empresa {
    String razaoSocial;

    /**
     * 
     * Se razaoSocial estiver vazio terá de ser feito varias comparação com NULL.
     * 
     */
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
}
