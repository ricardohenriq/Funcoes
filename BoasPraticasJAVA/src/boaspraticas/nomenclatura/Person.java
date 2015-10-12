//EXEMPLO DE BOAS PRATICAS EM "NOMENCLATURA DE FUNÇÕES"
package boaspraticas.nomenclatura;

public class Person {
    public String name;
    public boolean died;
    //Nome de "Método" somente com caracteres ANSI e com prefixo adequado à 
    //sua função.
    public String getName(){
        return name; 
    }
    // Nome de "Método" somente com caracteres ANSI e com prefixo adequado à 
    //sua função.
    public void setName(String name){
        this.name = name;
    }
    //Nome de "Método" somente com caracteres ANSI e com nome 
    //significativo e autoexplicativo.
    public boolean verificaNomeExistente(String name){
        return true;
    }
}
