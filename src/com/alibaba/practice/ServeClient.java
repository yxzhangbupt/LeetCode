package com.alibaba.practice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeClient {
	public static void main(String[] args) {
		int port = 9999;
		try{
			ServerSocket server = new ServerSocket(port);
			Socket socket = server.accept();
			InputStreamReader reader = new InputStreamReader(socket.getInputStream());
			int len;
			char[] c = new char[1024];
			StringBuilder s = new StringBuilder();
			while((len=reader.read(c))!=-1){
				s.append(c, 0, len);
			}
			System.out.println(s);
			reader.close();
			socket.close();
			server.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
