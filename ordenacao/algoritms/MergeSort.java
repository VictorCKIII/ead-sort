package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] aux = new int[elements.length];

        MergeSort(elements, aux, 0, elements.length -1);
        

        int [] sorted = elements.clone();
        return sorted;
    }
    
    
    private void MergeSort(int[] elements, int[] aux, int start, int end) {
            if(start < end) {

                 int meio = (start +end) / 2;
                 MergeSort(elements, aux, start, meio); 
                 MergeSort(elements, aux, meio + 1, end);
                 fusao(elements,aux,start, meio, end);

            }

    }


    private void fusao(int[] elements, int[] aux, int start, int meio, int end) {
        for (int i = start; i <= end; i++) {
            aux[i] = elements[i];

        }
        int left = start;
        int right = meio + 1;

        for (int i = start; i <= end; i++) {
            if(left > meio){
                elements[i]= aux[right++];
            } 
            else if(right > end){
                elements[i] = aux[left++];
            }
                
                  else if(aux[left] < aux[right]){
                elements[i] = aux[left++];
                 
            } else {
                elements[i] = aux[right++];

            }
            

            
        }


    }


    @Override
    public String getName() {
        return "MergeSort";
    }

}
