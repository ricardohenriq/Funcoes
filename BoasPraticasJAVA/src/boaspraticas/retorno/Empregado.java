//EXEMPLO DE BOAS PRATICAS EM "RETORNO"
package boaspraticas.retorno;

public class Empregado {
    String name;
    String cargo;
    
    // Sempre que algum método ou função retornar um conjunto ou algum tipo
    // de coleção, retorne o conjunto vazio ao invés de NULL. Desta forma,
    // eliminamos muitos testes if-else para elementos nulos.
    public String getName(){
        return (null == this.name ? "" : this.name);
    }
}
