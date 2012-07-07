package jp.itacademy.samples.exception;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connector {
	public static void main(String[] args) {
		Connector conn = new Connector("www.yahoo.co.jp", 80);
		try {
			conn.connect();
			
		} catch (UnknownHostException e) {
			System.err.println(conn.host + "Ç™å©Ç¬Ç©ÇËÇ‹ÇπÇÒ");
		} catch (IOException e) {
			System.err.println("ê⁄ë±Ç≈Ç´Ç‹ÇπÇÒ");

		}
	}

	private String host;
	private int port;

	public Connector(String host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	public void connect() throws UnknownHostException, IOException {
		Socket sock = new Socket(host, port);
		System.out.println("ê⁄ë±ê¨å˜:" + sock);
	}
}
