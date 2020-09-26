package br.ucsal.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class LeitorSocket {
	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("awsweb02.ucsal.br",80);
		PrintWriter writer = new PrintWriter(socket.getOutputStream());
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		writer.print("GET /designs/templates/leftbar/stylesheets/style.css HTTP/1.1\n"
				+ "Host: noosfero.ucsal.br\n"
				+ "Connection: keep-alive\n"
				+ "Pragma: no-cache\n"
				+ "Cache-Control: no-cache\n"
				+ "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.121 Safari/537.36\n"
				+ "Accept: text/css,*/*;q=0.1\n"
				+ "Referer: http://noosfero.ucsal.br/institucional\n"
				+ "Accept-Encoding: gzip, deflate\n"
				+ "Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7\n"
				+ "Cookie: _ga=GA1.2.791896424.1571191944; nvg53994=6ede2ffc9a6eed343ba899e7809|2_289; _hjid=305d493e-e7d5-4faa-971b-a0d48c7a4dd8");
		writer.flush();
		
		String linha = "";
		while ((linha = reader.readLine()) != null ) {
			System.out.println(linha);
		}
		socket.close();
	}
}
