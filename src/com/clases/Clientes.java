package com.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Clientes extends Personas{
	public static List<Clientes> arrclientes = new ArrayList<>();
    private String nombre;
    private String telefono;
    private String direccion;
    private List<Producto> productos;
    Boolean indExiste = false;
    
    Scanner in = new Scanner(System.in);
    
    public Clientes(String nombre, String telefono, String direccion, List<Producto> productos) {
        super();
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.productos = productos;
    }

    public Clientes() {
    }

    public Clientes(String cedula, String tipoId, String celular, String nombre, String telefono, String direccion) {
    	super();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public static void setClientes(List<Clientes> arrclientes) {
        Clientes.arrclientes = arrclientes;
    }
    
    public static List<Clientes> getClientes(){
        return arrclientes;
    }
    
    @Override
    public void crearCliente() {
    	
    	int sizeArray = Integer.valueOf(JOptionPane.showInputDialog("Ingresar el numero de clientes a crear"));
    	
    	for (int i=0; i< sizeArray; i++) {
    		 
    		String wcedula =JOptionPane.showInputDialog("Ingresar el documento del cliente");
    		String wtidoId =JOptionPane.showInputDialog("Ingresar el tipo de documento del cliente");
    		String wNombre =JOptionPane.showInputDialog("Ingresar el nombre del cliente");
    		String wTelefono=JOptionPane.showInputDialog("Ingresar el telefono del cliente");
    		String wCelular=JOptionPane.showInputDialog("Ingrese su numero celular");
    		String wDireccion=JOptionPane.showInputDialog("Ingresar la dirección del cliente");
    	
    		Clientes wCliente = new Clientes(wcedula,wtidoId,wNombre,wTelefono,wCelular,wDireccion );
    	
    		wCliente.setCedula(wcedula);
    		wCliente.setTipoid(wtidoId);
    		wCliente.setNombre(wNombre);
    		wCliente.setTelefono(wTelefono);
    		wCliente.setCelular(wCelular);
    		wCliente.setDireccion(wDireccion);
		
    		arrclientes.add(wCliente);
    		System.out.println("\n ");
		    System.out.println("El id del cliente numero "+(i+1)+" es: "+arrclientes.get(i).getCedula());
		    System.out.println("El tipo de id es: "+arrclientes.get(i).getTipoid());
		    System.out.println("Su nombre es: "+arrclientes.get(i).getNombre());
		    System.out.println("Su telefono es: "+arrclientes.get(i).getTelefono());
		    System.out.println("Su celular es: "+arrclientes.get(i).getCelular());
		    System.out.println("Su dirección es: "+arrclientes.get(i).getDireccion() );
		    System.out.println(" ");
    	}
    }
    	
    @Override
    public  void actualizarCliente() {
    	String wNroDoc = JOptionPane.showInputDialog("Ingresar el documento del cliente");
        //System.out.println("Ingrese la cedula del cliente que desea consultar"); 
		//String cedula = in.nextLine();
    	indExiste = false;
        for (Clientes wClientes : arrclientes){
            if(wClientes.getCedula().equals(wNroDoc)){
                System.out.println(wClientes.getCedula());
                System.out.println(wClientes.getCelular());
                System.out.println(wClientes.getNombre());
                System.out.println(wClientes.getTelefono());
                System.out.println(wClientes.getDireccion());
                
        		wClientes.setTelefono(JOptionPane.showInputDialog("Ingresar el nuevo numero de telefono del cliente"));
        		wClientes.setCelular(JOptionPane.showInputDialog("Ingrese su nuevo numero celular"));
        		wClientes.setDireccion(JOptionPane.showInputDialog("Ingresar la nueva dirección del cliente"));
        		System.out.println(" ");
        		indExiste = true;
        		break;
            }
            
        }
        if (indExiste==false) {
        	System.out.println("El cliente no existe");
        }
       }

    @Override
    public  void consultarCliente() {
        
		String cedula = JOptionPane.showInputDialog("Ingresar el documento del cliente");
		String tipoid = JOptionPane.showInputDialog("Ingrese la tipo de id del cliente que desea consultar"); 
		indExiste = false;
		//Clientes wCliente = new Clientes();
        for (Clientes wClientes : arrclientes){
            if(wClientes.getCedula().equals(cedula) &&
               wClientes.getTipoid().equals(tipoid)){
            	 
                System.out.println("El cliente se llama: " + wClientes.getNombre());
                System.out.println("Su numero celular es : " + wClientes.getCelular());
                System.out.println("Su numero telefonico es: "+ wClientes.getTelefono());
                System.out.println("Su direccion es : "+ wClientes.getDireccion());
                System.out.println(" ");
                indExiste = true;
                break;
        		}
        }
        if (indExiste==false) {
        	System.out.println("El cliente no existe");
        }
       }

	@Override
	public void eliminarCliente() {
		// TODO Auto-generated method stub
		String wNroDoc = JOptionPane.showInputDialog("Ingresar el documento del cliente que desea eliminar");
		indExiste = false;
        for(Clientes wClientes: arrclientes){
             if(wClientes.getCedula().equals(wNroDoc)){
                arrclientes.remove(wClientes);
                System.out.println("El cliente fue eliminado exitosamente");
                indExiste = true;
                break;
            }
        }
        if (indExiste == false) {
        	System.out.println("El cliente no existe");
        }
	}

	@Override
	public void consultarInformacion() {
		// TODO Auto-generated method stub
		
	}

	

}

