package main;
import java.util.ArrayList;
import java.util.List;

import main.instrucciones.Add;
import main.instrucciones.Input;
import main.instrucciones.Jmp;
import main.instrucciones.Jmpg;
import main.instrucciones.Load;
import main.instrucciones.Mul;
import main.instrucciones.Output;
import main.instrucciones.Push;
import main.instrucciones.Store;
import main.instrucciones.Sub;

public class Main {

	static List<String[]> instrucciones = new ArrayList<String[]>();
	static State state = new State();
	
	public static void main(String[] args) throws Exception {
		Loading.cargar();
		ejecutaPrograma();
	}

	private static void ejecutaPrograma() {
	    while (state.getIp() < instrucciones.size()) {
	        String[] instruccion = instrucciones.get(state.getIp());
	        Instruccion instruccionObj = null;

	        if (instruccion[0].equals("push")) {
	            instruccionObj = new Push(instruccion);
	        } else if (instruccion[0].equals("add")) {
	            instruccionObj = new Add();
	        } else if (instruccion[0].equals("sub")) {
	            instruccionObj = new Sub();
	        } else if (instruccion[0].equals("mul")) {
	            instruccionObj = new Mul();
	        } else if (instruccion[0].equals("jmp")) {
	            instruccionObj = new Jmp(instruccion);
	        } else if (instruccion[0].equals("jmpg")) {
	            instruccionObj = new Jmpg(instruccion);
	        } else if (instruccion[0].equals("load")) {
	            instruccionObj = new Load();
	        } else if (instruccion[0].equals("store")) {
	            instruccionObj = new Store();
	        } else if (instruccion[0].equals("input")) {
	            instruccionObj = new Input();
	        } else if (instruccion[0].equals("output")) {
	            instruccionObj = new Output();
	        }

	        if (instruccionObj != null) {
	            instruccionObj.execute(state);
	        }
	    }
	}


}
