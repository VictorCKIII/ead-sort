package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int aux = i; 
            for (int j = i + 1; j < elements.length; j++) {
                if(aux > elements[j]) {
                    aux = elements[j];
                
                }


            }
            int check = aux;
            aux = elements[i];

            elements[i] = check;




        } 




        int [] sorted = elements.clone();
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }

    
}
