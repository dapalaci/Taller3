package com.clases;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Empresas extends Personas{
    private String tipDoc;
    private String documento;
    private String representante;
    public static List<Empresas> empresas = new ArrayList<>();
    public static List<Producto> newprod  = new ArrayList<>();
    boolean indExiste;

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public static List<Empresas> getEmpresas() {
        return empresas;
    }
    
	public static List<Producto> getNewprod() {
		return newprod;
	}

	public static void setNewprod(List<Producto> newprod) {
		Empresas.newprod = newprod;
	}

	public static void setEmpresas(List<Empresas> empresas) {
		Empresas.empresas = empresas;
	}

	ArrayList<Empresas> arraEmpresas = new ArrayList<>();
	
	@Override
    public void crearCliente() {
		int sizeArray = Integer.valueOf(JOptionPane.showInputDialog("Ingresar el numero de empresas a crear"));
    	
    	for (int i=0; i< sizeArray; i++) {
    		Empresas wEmpresa = new Empresas(); 
    		wEmpresa.setDocumento(JOptionPane.showInputDialog("Ingresar el id de la empresa"));
    		wEmpresa.setTipDoc(JOptionPane.showInputDialog("Ingresar el tipo de id de la empresa"));
    		wEmpresa.setRepresentante(JOptionPane.showInputDialog("Ingresar el nombre del representante de la empresa"));
    			
    		arraEmpresas.add(wEmpresa);
    		System.out.println("\n ");
		    System.out.println("El id de la empresa numero "+(i+1) +" es: "+arraEmpresas.get(i).getDocumento());
		    System.out.println("El tipo de id es: "+arraEmpresas.get(i).getTipDoc());
		    System.out.println("Su representante es: "+arraEmpresas.get(i).getRepresentante());
    	
        }
    }

	@Override
	public void eliminarCliente() {
		// TODO Auto-generated method stub
		String wNroDoc = JOptionPane.showInputDialog("Ingresar el documento de la empresa que desea eliminar");
		indExiste = false;
        for(Empresas emp: arraEmpresas){
             if(emp.getCedula().equals(wNroDoc)){
                arraEmpresas.remove(emp);
                System.out.println("La empresa fue eliminado exitosamente");
                indExiste = true;
                break;
            }
        }
        if (indExiste == false) {
        	System.out.println("La empresa no existe");
        }
		
	}

	@Override
	public void actualizarCliente() {
		// TODO Auto-generated method stub
		String wNroDoc = JOptionPane.showInputDialog("Ingresar el id de la empresa");
    	indExiste = false;
    	 
        for (Empresas wEmpresa : arraEmpresas){
            if(wEmpresa.getCedula().equals(wNroDoc)){
                System.out.println(wEmpresa.getDocumento());
                System.out.println(wEmpresa.getRepresentante());
                
                wEmpresa.setRepresentante(JOptionPane.showInputDialog("Ingresar el nuevo representante de la empresa"));
        		indExiste = true;
        		break;
            }
        }
        if (indExiste==false) {
        	System.out.println("La empresa no existe");
        }
		
	}

	@Override
	public void consultarCliente() {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("Ingresar el id de la empresa");
		String tipoid = JOptionPane.showInputDialog("Ingrese la tipo de id de la empresa que desea consultar"); 
		indExiste = false;
		 
        for (Empresas wEmpresas : arraEmpresas){
            if(wEmpresas.getDocumento().equals(id) &&
               wEmpresas.getTipDoc().equals(tipoid)){
            	 
                System.out.println("El representante es: " + wEmpresas.getRepresentante());
                indExiste = true;
                break;
        		}
        }
        if (indExiste==false) {
        	System.out.println("La empresa no existe");
        }
		
	}

	@Override
	public void consultarInformacion() {
		// TODO Auto-generated method stub
		
	}
}

