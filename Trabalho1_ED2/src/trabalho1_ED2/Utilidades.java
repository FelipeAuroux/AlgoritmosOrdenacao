package trabalho1_ED2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Utilidades {
	//atributos da classe com modificador de acesso
	private File arquivo;
	private FileWriter fw;
	private BufferedWriter bw;
	public Utilidades() {
		super();
		//instanciando e armazenando nos atributos
		arquivo = new File(System.getProperty("user.home")+"\\Tempo.txt"); 
		//arquivo será gravado na pasta do usuário
		try {
			fw = new FileWriter(arquivo);
			bw = new BufferedWriter(fw);			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

	public static int[] gerarVetor(int tamanho) {
		
	int[] vetor = new int[tamanho];
	
	 for (int i = 0; i < vetor.length; i++) {
         vetor[i] = (int) (Math.random()*tamanho);
 }
	
	return vetor;
	}
	
	public static int[] clonarVetor(int[] vetor) {
		
		int[] vetorClone = new int[vetor.length];
		
		for(int i=0; i<vetor.length; i++) {
			vetorClone[i] = vetor[i];
		}
		return vetorClone;
	}
	
	public void escreverTxt(String texto) {
	
	try {
		bw.write(texto);
		bw.newLine();		
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	

		
	}
	public void fechartxt() {
		
		try {
			bw.close();
			fw.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

			
		}
	
	}
    
	

