package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {

        QuickSort(elements, 0, elements.length - 1);
        
        int [] sorted = elements.clone();
        return sorted;
    }



    public static void QuickSort(int[] elements, int left, int right) {
            if(left<right){
                int pivo = particao(elements, left, right);
                QuickSort(elements, left, pivo);
                QuickSort(elements, pivo + 1, right); 
                
            }
        
    }

    private static int particao(int[] elements, int left, int right) {
        int meio = (int) (left + right) / 2;
        int pivo = elements[meio];
        int aux = left - 1;
        int aux2 = right + 1;
        while(true) {
            do{
                aux++;     
            } while (elements[aux] < pivo);
            do{
                aux2 --;
            } while(elements[aux2] > pivo);
            if (aux >= aux2) {
                return aux2;
            }
            int auxtroca = elements[aux];
            elements[aux] = elements[aux2];
            elements[aux2] = auxtroca;
        }
    }  



    @Override
    public String getName() {
        return "QuickSort";
    }

}
