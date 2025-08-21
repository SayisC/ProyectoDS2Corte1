package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Publicacion;
import co.edu.unbosque.view.VentanaActualizar;
import co.edu.unbosque.view.VentanaCrear;
import co.edu.unbosque.view.VentanaDigital;
import co.edu.unbosque.view.VentanaEliminar;
import co.edu.unbosque.view.VentanaFisico;
import co.edu.unbosque.view.VentanaMenu;
import co.edu.unbosque.view.VentanaMostrar;

public class Controlador implements ActionListener {
	private VentanaMenu vm;
	private VentanaFisico vf;
	private VentanaDigital vd;
	private VentanaCrear ventanaCrear;
	private VentanaActualizar ventanaActualizar;
	private VentanaEliminar ventanaEliminar;
	private VentanaMostrar ventanaMostrar;
	private Publicacion publicacion;
	private ArrayList<Publicacion> listaPublicaciones;
	

	public Controlador() {
		vm = new VentanaMenu();
		vf = new VentanaFisico();
		vd = new VentanaDigital();
		ventanaCrear = new VentanaCrear();
		ventanaActualizar = new VentanaActualizar();
		ventanaEliminar = new VentanaEliminar();
		ventanaMostrar = new VentanaMostrar();
		publicacion = new Publicacion();
		listaPublicaciones = new ArrayList<>();

	}

	public void runGui() {
		vm.setVisible(true);
		vf.setVisible(false);
		vd.setVisible(false);
		ventanaCrear.setVisible(false);
		ventanaActualizar.setVisible(false);
		asignarListeners();
	}

	private void asignarListeners() {
		vm.getFisico().addActionListener(this);
		vm.getFisico().setActionCommand("MENU_FISICO");

		vm.getDigital().addActionListener(this);
		vm.getDigital().setActionCommand("MENU_DIGITAL");

		vf.getVolver().addActionListener(this);
		vf.getVolver().setActionCommand("VOLVER_MENUF");

		vd.getVolver().addActionListener(this);
		vd.getVolver().setActionCommand("VOLVER_MENUD");
		
		vf.getCrear().addActionListener(this);
		vf.getCrear().setActionCommand("BTN_CREAR");
		
		vf.getActualizar().addActionListener(this);
		vf.getActualizar().setActionCommand("BTN_ACTUALIZAR");
		
		ventanaCrear.getVolver().addActionListener(this);
		ventanaCrear.getVolver().setActionCommand("VOLVERC");
		
		ventanaCrear.getConfirmar().addActionListener(this);
		ventanaCrear.getConfirmar().setActionCommand("BTN_CONFIRMAR");
		
		ventanaActualizar.getVolver().addActionListener(this);
		ventanaActualizar.getVolver().setActionCommand("VOLVERA");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String alias = e.getActionCommand();
		switch (alias) {
		case "MENU_FISICO":
			vm.setVisible(false);
			vf.setVisible(true);
			break;

		case "MENU_DIGITAL":
			vm.setVisible(false);
			vd.setVisible(true);
			break;
			
		case "VOLVER_MENUF":
			vf.setVisible(false);
			vm.setVisible(true);
			break;
			
		case "VOLVER_MENUD":
			vd.setVisible(false);
			vm.setVisible(true);
			break;
		case "BTN_CREAR":
			ventanaCrear.limpiarCampos();
			vf.setVisible(false);
			ventanaCrear.setVisible(true);
			break;
		case "BTN_ACTUALIZAR":
			ventanaActualizar.setVisible(true);
			vf.setVisible(false);
			break;
		case "VOLVERC":
			vf.setVisible(true);
			ventanaCrear.setVisible(false);
			break;	
		case "VOLVERA":
			ventanaActualizar.setVisible(false);
			vf.setVisible(true);
		default:
			System.out.println("Comando no reconocido: " + alias);
		}
	}
	
}
