package com.alibaba.practice;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSocket {
	
	public static void main(String[] args) {
		String host = "127.0.0.1";
		int port = 9999;
		
		try{
			Socket client = new Socket(host, port);
			OutputStreamWriter write = new OutputStreamWriter(client.getOutputStream());
			write.write("Hello World!");
			write.flush();
			write.close();
			client.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
