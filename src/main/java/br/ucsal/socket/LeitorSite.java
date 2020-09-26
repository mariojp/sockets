package br.ucsal.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LeitorSite {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.ucsal.br/");
		InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String linha = "";
		while ((linha = bufferedReader.readLine()) != null ) {
			System.out.println(linha);
		}
	}
}
