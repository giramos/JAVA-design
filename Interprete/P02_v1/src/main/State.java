package main;

import java.util.Scanner;

public class State {

	public int pop() {
		return pila[--sp];
	}

	public void push(int valor) {
		pila[sp] = valor;
		sp++;
	}

	public int getIp() {
		return ip;
	}

	public void setIP(int ip) {
		this.ip = ip;
	}

	public int read(int direccion) {
		return memoria[direccion];
	}

	public void write(int direccion, int valor) {
		memoria[direccion] = valor;
	}

	int[] memoria = new int[1024];
	int ip = 0;
	int[] pila = new int[32];
	int sp = 0;
	public Scanner console = new Scanner(System.in);

}
