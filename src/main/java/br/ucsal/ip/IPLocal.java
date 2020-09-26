package br.ucsal.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPLocal {

	
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address.getHostName().toString());
			System.out.println(address.getHostAddress().toString());
			for(InetAddress ia : InetAddress.getAllByName(address.getHostName())) {
				System.out.println(ia.getHostName().toString());
				System.out.println(ia.getHostAddress().toString());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
