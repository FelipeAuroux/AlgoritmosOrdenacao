package trabalho1_ED2;

public class Ordena {

	public static void insertionSort(int[] vetor) {
	    int j;
	    int key;
	    int i;

	    for (j = 1; j < vetor.length; j++)
	    {
	      key = vetor[j];
	      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
	      {
	         vetor[i + 1] = vetor[i];
	       }
	        vetor[i + 1] = key;
	    }
	}
	
	public static void Shellsort(int arrayToSort[]) {
	    int n = arrayToSort.length;

	    for (int gap = n / 2; gap > 0; gap /= 2) {
	        for (int i = gap; i < n; i++) {
	            int key = arrayToSort[i];
	            int j = i;
	            while (j >= gap && arrayToSort[j - gap] > key) {
	                arrayToSort[j] = arrayToSort[j - gap];
	                j -= gap;
	            }
	            arrayToSort[j] = key;
	        }
	    }
	}
	
    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = separar(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
  }

    			private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else {
                      int troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }
  
    public void HeapSort(int arr[])
	    {
	        int N = arr.length;
	 
	        // Build heap (rearrange array)
	        for (int i = N / 2 - 1; i >= 0; i--)
	            heapify(arr, N, i);
	 
	        // One by one extract an element from heap
	        for (int i = N - 1; i > 0; i--) {
	            // Move current root to end
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	 
	            // call max heapify on the reduced heap
	            heapify(arr, i, 0);
	        }
	    }
	 
	    // To heapify a subtree rooted with node i which is
	    // an index in arr[]. n is size of heap
	    void heapify(int arr[], int N, int i)
	    {
	        int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2
	 
	        // If left child is larger than root
	        if (l < N && arr[l] > arr[largest])
	            largest = l;
	 
	        // If right child is larger than largest so far
	        if (r < N && arr[r] > arr[largest])
	            largest = r;
	 
	        // If largest is not root
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	            // Recursively heapify the affected sub-tree
	            heapify(arr, N, largest);
	        }
	    }
			    
}
