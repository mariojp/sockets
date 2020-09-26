package br.ucsal.cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",4444);
		PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println("CLIENTE START");
		System.out.println("CLIENTE: - Olá Enfermeira!!!!");
		writer.println("Olá Enfermeira!!!!");	
		String linha = null;
		linha = reader.readLine();
		System.out.println(linha);
		
		writer.println("Olá SEU JOAO!!!!");	
		linha = null;
		linha = reader.readLine();
		System.out.println(linha);
		
		socket.close();
	}
}
