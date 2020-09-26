package br.ucsal.sever;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
	public static void main(String[] args) throws Exception {
		try (ServerSocket serverSocket = new ServerSocket(4444)) {
			System.out.println("SERVER START");
			
			Socket cliente = serverSocket.accept();
			PrintWriter writer = new PrintWriter(cliente.getOutputStream(),true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					cliente.getInputStream()));
			String linha = reader.readLine();
			System.out.println("CLIENTE: -"+linha);
			writer.println("SERVIDOR: -"+linha);
			
			linha = reader.readLine();
			System.out.println("CLIENTE: -"+linha);
			writer.println("SERVIDOR: -"+linha);
			
			cliente.close();
		}
	}
}
