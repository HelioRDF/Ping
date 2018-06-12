import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//oi
public class Ping {

	public static void main(String[] args) throws IOException {

		String saida = "C:/Users/helio.franca/Desktop/Ping/Teste.bat";
		executarComando(saida);

	}
//Teste xxx
	public static String executarComando(String comando) throws IOException {
		Process processo = Runtime.getRuntime().exec(comando);
		BufferedReader entrada = new BufferedReader(new InputStreamReader(processo.getInputStream()));
		String saida = null, linha = null;

		while ((linha = entrada.readLine()) != null) {
			saida = saida == null ? linha + "\n" : saida + linha + "\n";

			System.out.println("\nLinha:"+linha);
			

			if(linha.equalsIgnoreCase("Request timed out.")){

				System.out.println("Perca de pacote detectado.\n");

			}
		
		}

		System.out.println(saida);

		return saida;

	}

}

