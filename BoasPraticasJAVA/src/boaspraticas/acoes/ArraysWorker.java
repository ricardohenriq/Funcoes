//EXEMPLO DE PÉSSIMAS PRATICAS EM "AÇÕES QUE UMA FUNÇÃO PODE EXECUTAR"
package boaspraticas.acoes;

import java.util.ArrayList;
import java.util.List;

public class ArraysWorker {
    List valores;
    // Método tem várias operações (o que não é conciso): 1ª Inicializar o objeto 
    // com valores iniciais (neste caso de 0 a 9), 2ª Recuperar os valores do array 
    // multiplica-los por 2 e re-incerilo multiplicado.
    public List retornaValores(){
        this.valores = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            this.valores.add(i);
        }
        for(int i = 0; i < 10; i++){         
            this.valores.set(i,((int)this.valores.get(i) * 2));
        }
        return this.valores;
    }
}
