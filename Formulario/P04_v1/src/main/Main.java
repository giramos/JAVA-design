package main;

import formulario.Campo;
import formulario.CampoAll;
import formulario.CampoAny;
import formulario.CampoLongitud;
import formulario.CampoMayorQue;
import formulario.CampoMenorQue;
import formulario.CampoNumero;
import formulario.CampoPredefinido;
import formulario.CampoTexto;
import formulario.Formulario;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

//		formulario.addCampo(new Campo("Nombre", new CampoTexto()));
//		formulario.addCampo(new Campo("Apellido", new CampoTexto()));
//		formulario.addCampo(new Campo("Tel�fono", new CampoNumero()));
//		formulario.addCampo(new Campo("Ciudad", new CampoPredefinido("Ciudad", "Santander", "Oviedo", "Cádiz")));
//		formulario.addCampo(new Campo("Código Producto", new CampoLongitud(4)));
//		formulario.addCampo(new Campo("Código Postal", new CampoAll(new CampoLongitud(4), new CampoNumero())));
//		formulario.addCampo(new Campo("Edad", new CampoAll(new CampoNumero(), new CampoMayorQue(18))));
//		formulario.addCampo(new Campo("Sueldo", new CampoAll(new CampoNumero(), new CampoMayorQue(800), new CampoMenorQue(1200))));
//		formulario.addCampo(new Campo("Ubicación", new CampoAny(new CampoPredefinido("Ciudad", "Santander", "Oviedo", "Cádiz"), new CampoAll(new CampoLongitud(4), new CampoNumero()))));
		formulario.addCampo(new Campo("Código de Promoción", new CampoAny(new CampoTexto(), new CampoAll(new CampoNumero(), new CampoLongitud(3)))));

		formulario.PideDatos();
		formulario.escribeFormulario();
	}
}
