package com.milli;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Server s = new Server(2000);
        s.start();
        Client c = new Client(2000);
        c.close();
        s.close();
    }
}
