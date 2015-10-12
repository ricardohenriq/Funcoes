//EXEMPLO DE PESSIMAS PRATICAS EM "NOMENCLATURA DE FUNÇÕES"
package boaspraticas.nomenclatura;

public class Carro {
    int qtdPeças;
    String mod;
    //Nome de "Método" que não é descritivo e que não segue as convenções de 
    //nomenclatura do java.
    public String RetMod(){
        return mod;
    }
    //Nome de "Método" que não é descritivo.
    public void mod(String mod){
        this.mod = mod;
    } 
    //Nome de "Método" que não descritivo o suficiente e com caracteres non-ANSI.
    public int retQtdPeças(){
        return qtdPeças;
    }
}
