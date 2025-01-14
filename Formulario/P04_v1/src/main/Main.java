package main;

import formulario.Campo;
import formulario.CampoNumero;
import formulario.CampoPredefinido;
import formulario.CampoTexto;
import formulario.Formulario;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new Campo("Nombre", new CampoTexto()));
		formulario.addCampo(new Campo("Apellido", new CampoTexto()));
		formulario.addCampo(new Campo("Tel�fono", new CampoNumero()));
		formulario.addCampo(new Campo("Ciudad", new CampoPredefinido("Ciudad", "Santander", "Oviedo", "Cádiz")));

		formulario.PideDatos();
		formulario.escribeFormulario();
	}
}
