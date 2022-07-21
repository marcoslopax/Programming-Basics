//  "Criaecopia.java" was made to create a txt file lines witch the number lines is determinated by de user, also this code make copy of another txt file.

package ProgramCopiar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public static void main (String [] args) throws IOException {
		
		Scanner opcao = new Scanner(System.in);
		System.out.printf("1 - Criar um arquivo \n2 - Copiar Arquivo \n");
		int Opcao = opcao.nextInt();
		
		if (Opcao == 1) {	
		
		Scanner nome = new Scanner(System.in);
		System.out.printf("Informe o nome do arquivo: \n");
		String nomeArquivo = nome.nextLine();
		
		FileWriter arquivo = new FileWriter(nomeArquivo);
		PrintWriter writer = new PrintWriter(arquivo);
		
		Scanner numero = new Scanner(System.in);
		System.out.printf("Informe o numero de linhas: \n");
		int numLinhas = numero.nextInt();
		
		for (int i=1; i <= numLinhas; i++) {
			writer.printf("Essa é a linha do número " + i + "%n");
		}
		
		arquivo.close();
		System.out.printf("Arquivo escrito com sucesso!");
		
}
		
		else if ( Opcao == 2) {
			Scanner leitura = new Scanner(System.in);
			System.out.printf("Informe o nome do arquivo: \n");
			String caminhoArquivo = leitura.nextLine();
			
			InputStream is = null;
			OutputStream os = null;
			
			try {
				
			is = new FileInputStream(caminhoArquivo);
			os = new FileOutputStream("Copia de " + caminhoArquivo);
			
			byte[] buf = new byte[1024];
			int len;
			while ((len = is.read(buf)) > 0) {
				os.write(buf, 0, len);
			}}
			catch (IOException e) {
				System.out.printf("Erro na abertura do arquivo: %s. \n", e.getMessage());
			
			} finally {
				is.close();
				os.close();

			}
			
		}
		else  {
			System.out.printf("Digite uma opção válida");
		}
	}}

