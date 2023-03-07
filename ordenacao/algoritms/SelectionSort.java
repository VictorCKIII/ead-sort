package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int aux = i; 
            for (int j = i + 1; j < elements.length; j++) {
                
            }
        }









        int [] sorted = elements.clone();
        return sorted;
    }

    @Override
    public String getName() {
        return "SelectionSort";
    }
}
