package com.clases;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Personas {
    private String cedula;
    private String celular;
    private String tipoid;

	public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getTipoid() {
		return tipoid;
	}

	public void setTipoid(String tipoid) {
		this.tipoid = tipoid;
	}
	
	public abstract void crearCliente();
    public abstract void eliminarCliente();
    public abstract void actualizarCliente();
    public abstract void consultarInformacion();
    

	public void actualizarCliente(String cedula, String tipoCedula) {
		// TODO Auto-generated method stub
		
	}

	public void consultarCliente() {
		// TODO Auto-generated method stub
		
	}
}

