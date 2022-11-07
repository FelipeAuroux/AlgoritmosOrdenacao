package trabalho1_ED2;

import java.io.IOException;
import java.util.Arrays;

public class TesteOrdena {

	public static void main(String[] args) throws IOException {
		Utilidades utilidades = new Utilidades();
for (int t=1000; t<=10000; t+=1000) {
		int[] vetor = Utilidades.gerarVetor(t);
		utilidades.escreverTxt("→ Vetor de tamanho [" + t + "] \n");
		long somaQuick = 0;
		long somaInsert = 0;
		long somaShell= 0;
		long somaHeap = 0;
		for (int v = 1; v < 51; v++) {
			int[] cloneQuick = Utilidades.clonarVetor(vetor);
			int[] cloneInsert = Utilidades.clonarVetor(vetor);
			int[] cloneShell = Utilidades.clonarVetor(vetor);
			int[] cloneHeap = Utilidades.clonarVetor(vetor);
			System.out.println(">>> Ordenação " + v + "] <<<\n");
			utilidades.escreverTxt("» Ordenação " + v);
//Quick		
			System.out.println("\t>>> QuickSort\n\t    Vetor Inicial " + Arrays.toString(cloneQuick));
			Ordena quick = new Ordena();
			long tempoInicial = System.nanoTime();
			quick.quickSort(cloneQuick, 0, cloneQuick.length - 1);
			long tempoFinal = System.nanoTime();
			long tempoTotal = tempoFinal - tempoInicial;
			utilidades.escreverTxt("\t╔ Tempo de execução da Ordenação QuickSort = " + (tempoFinal - tempoInicial)+" ns");
			System.out.println("\t    Vetor Final " + Arrays.toString(cloneQuick) 
			+ "\n\t -> Executado em = " + tempoTotal + " ns\n\n\t .----------------------------------.\n");
			somaQuick = somaQuick + tempoTotal;
// Insertion

			System.out.println("\t>>> InsertionSort\n\t    Vetor Inicial " + Arrays.toString(cloneInsert));
			Ordena Insert = new Ordena();
			tempoInicial = System.nanoTime();
			Insert.insertionSort(cloneInsert);
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			utilidades.escreverTxt("\t║ Tempo de execução da Ordenação InsertionSort = " + (tempoFinal - tempoInicial)+" ns");
			System.out.println("\t    Vetor Final " + Arrays.toString(cloneInsert) 
			+ "\n\t -> Executado em = " + (tempoTotal) + " ns\n\n\t .----------------------------------.\n");
			somaInsert = somaInsert + tempoTotal;
			
//Shell

			System.out.println("\t>>> ShellSort\n\t    Vetor Inicial " + Arrays.toString(cloneShell));
			Ordena Shell = new Ordena();
			tempoInicial = System.nanoTime();
			Shell.Shellsort(cloneShell);
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			utilidades.escreverTxt("\t║ Tempo de execução da Ordenação ShellSort = " + (tempoFinal - tempoInicial)+" ns");
			System.out.println("\t    Vetor Final " + Arrays.toString(cloneShell) 
			+ "\n\t -> Executado em = " + tempoTotal + " ns\n\n\t .----------------------------------.\n");
			somaShell = somaShell+ tempoTotal;
			
//Heap
			System.out.println("\t>>> HeapSort\n\t    Vetor Inicial " + Arrays.toString(cloneHeap));
			Ordena heap = new Ordena();
			tempoInicial = System.nanoTime();
			heap.HeapSort(cloneHeap);
			tempoFinal = System.nanoTime();
			tempoTotal = tempoFinal - tempoInicial;
			utilidades.escreverTxt("\t╚ Tempo de execução da Ordenação HeapSort = " + (tempoFinal - tempoInicial)+" ns");
			System.out.println("\t    Vetor Final " + Arrays.toString(cloneHeap) 
			+ "\n\t -> Executado em = " + tempoTotal + " ns\n\n\t>>> [ Fim da Ordenação " + v + "] <<<\n");
			somaHeap = somaHeap + tempoTotal;
			
		}
		utilidades.escreverTxt("\n\t\t╔ A média de tempo do QuickSort foi: "+ somaQuick/50 + " ns");
		utilidades.escreverTxt("\t\t║ A média de tempo do InsertionSort foi: "+ somaInsert/50 + " ns");
		utilidades.escreverTxt("\t\t║ A média de tempo do ShellSort foi: "+ somaShell/50 + " ns");
		utilidades.escreverTxt("\t\t╚ A média de tempo do HeapSort foi: "+ somaHeap/50 + " ns");
		utilidades.escreverTxt("\n");		
	}
utilidades.fechartxt();
}
}