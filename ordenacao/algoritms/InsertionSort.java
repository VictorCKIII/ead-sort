package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int aux = i + 1;
            for (int j = i; j < elements.length; j++) {
                if(aux > elements[j]); { 
                elements[j] = aux;
                }  
                aux = elements[j];
                
                
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        int [] sorted = elements.clone(); 
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
