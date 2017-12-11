import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CaçaPalavras {

	static String palavras[] = new String[10];
	static boolean primeiro = true;
	static char letras[];

	public static void main(String[] args) {

		lerArquivo();
		System.out.println("\n");
		matrizUm();
		
	}

	public static String[] lerArquivo() { // metodo que le o arquivo txt e// retorna
							// os dados por linha em um // vetor

		int nPalavras = 0;
		String palavraArquivo = "";
		Scanner arquivo = null;

		File filename = new File("D:/Kamila Kautzmann/Documentos/Java/AlgoritimosIII/Caca_Palavras/palavras.txt");
		try {
			arquivo = new Scanner(new FileInputStream(filename));
			System.out.println("Palavras para encontrar: " + "\n");
			while (arquivo.hasNext()) {

				palavraArquivo = arquivo.nextLine();

				palavras[nPalavras] = palavraArquivo;

				System.out.println(palavras[nPalavras]);

				nPalavras++;

			}

		} catch (IOException e) {
			System.out.println("Não foi possivel ler o arquivo de palavras!");
		}

		return palavras;

	}// final do ler arquivo

	public static void matrizUm() { // popula a matriz
		
		char matrizUm[][] = new char[20][20];

		for (int l = 0; l < matrizUm.length; l++) {
			for (int c = 0; c < matrizUm.length; c++) {
				
				matrizUm[l][c] = '.';//popula matriz com .
			}
	}
	
//		System.out.println(matrizUm[l][c]);// popula matriz com . e exibe
	
	}// final da Matriz1
	
	public static void matrizDois() { // popula a matriz

		char matrizDois[][] = new char[20][20];

		for (int l = 0; l < matrizDois.length; l++) {
			for (int c = 0; c < matrizDois.length; c++) {
				System.out.println(matrizDois[l][c] = '.');// popula matriz com .
			}
		}
	}// final da Matriz2

	public static void matrizTres() { // popula a matriz

		char matrizTres[][] = new char[20][20];

		for (int l = 0; l < matrizTres.length; l++) {
			for (int c = 0; c < matrizTres.length; c++) {
				System.out.println(matrizTres[l][c] = '.');// popula matriz com . e exibe
			}
		}
	}// final da Matriz3

	public static void matrizQuatro() { // popula a matriz

		char matrizQuatro[][] = new char[20][20];

		for (int l = 0; l < matrizQuatro.length; l++) {
			for (int c = 0; c < matrizQuatro.length; c++) {
				System.out.println(matrizQuatro[l][c] = '.');// popula matriz com . e exibe
			}
		}
	}// final da Matriz4

	
	
	
	
}// final do caça palavras
