//EXEMPLO DE BOAS PRATICAS EM "AÇÕES QUE UMA FUNÇÃO PODE EXECUTAR"
package boaspraticas.acoes;

import java.util.ArrayList;
import java.util.List;

public class ListWorker {
    List valores;
    
    public ListWorker(){
        this.valores = new ArrayList<Integer>();
    }
    
    /**
    *
    * Método tem várias operações exucutadas através de outros métodos deixando-o
    * conciso e organizado.
    * 
    */
    public List retornaListaDeValores(){
        this.valores = initializeListaDeValores();
        this.valores = multiplicaListaDeValores();
        return this.valores;
    }
    
    public List initializeListaDeValores(){
        for(int i = 0; i < 10; i++){
            this.valores.add(i);
        }
        return this.valores;
    }
    
    public List multiplicaListaDeValores(){
        for(int i = 0; i < 10; i++){         
            this.valores.set(i,((int)this.valores.get(i) * 2));
        }
        return this.valores;
    }
}
