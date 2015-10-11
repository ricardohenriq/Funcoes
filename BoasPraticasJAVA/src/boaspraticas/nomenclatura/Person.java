//EXEMPLO DE BOAS PRATICAS EM "NOMENCLATURA DE FUNÇÕES"
package boaspraticas.nomenclatura;

public class Person {
    public String Name;
    public boolean Died;
    
    /**
    * 
    * Nome de "Método" somente com caracteres ANSI e com prefixo adequado à 
    * sua função.
    *
    */
    public String getName(){
        return Name; 
    }
    
    /**
    * 
    * Nome de "Método" somente com caracteres ANSI e com prefixo adequado à 
    * sua função.
    *
    */
    public void setName(String Name){
        this.Name = Name;
    }
    
    /**
    * 
    * Nome de "Método" somente com caracteres ANSI e com nome 
    * significativo e autoexplicativo.
    *
    */
    public boolean verificaNomeExistente(String Name){
        return true;
    }
}
