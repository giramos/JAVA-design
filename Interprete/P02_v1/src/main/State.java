package main;

import java.util.Scanner;

public class State {

	public int pop() {
		 if (sp == 0) {
		        throw new IllegalStateException("Stack Underflow: no more elements to pop");
		    }
		    sp--;
		    return pila[sp];
	}

	public void push(int valor) {
		pila[sp] = valor;
		sp++;
	}

	public int getIp() {
		return ip;
	}

	public int[] memoria = new int[1024];
	public int ip = 0;
	int[] pila = new int[32];
	public int sp = 0;
	public Scanner console = new Scanner(System.in);

}
