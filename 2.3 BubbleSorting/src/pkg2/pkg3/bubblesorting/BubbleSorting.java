
package pkg2.pkg3.bubblesorting;

public class BubbleSorting {

    public void bubblesorting(int vet[]){
        for(int i =0; i<5; i++){
            for(int j = 0; j<4 ;j++){
                if(vet[j]>vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    }
}
