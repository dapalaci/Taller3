package com.clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.clases.Clientes;
import com.clases.Empresas;
import com.clases.Personas;
import com.clases.Producto;
import com.sun.org.apache.bcel.internal.classfile.Field;
import com.sun.org.apache.xpath.internal.operations.Equals;

public class Main {

	public static void main(String[] args) throws IOException {
        String menu =
                        "         * 1 Agregar cliente\n" +
                        "         * 2 Editar cliente\n" +
                        "         * 3 Eliminar cliente\n" +
                        "         * 4 Agregar productos\n" +
                        "         * 5 Consultar clientes con documento y tipo de documento \n" +
                        "         * 0 salir de la aplicacion";
        
        Scanner in = new Scanner(System.in);
        String tipoCliente;

        //Uso clico do while() para iniciar menu
        //@Deprecated(since = "1.2", forRemoval = true)
        Integer opMenu = new Integer(0);
        ArrayList<Producto> arrayProducto = new ArrayList<>();
        Clientes wCliente = new Clientes();
        Empresas wEmpresa = new Empresas();
        Producto wProducto = new Producto();
        
        do {

            System.out.println(menu);
            opMenu = in.nextInt();
            switch (opMenu.toString()) {
                case "1":
                	if (seleccionarTipo().equals("1")) {
                		wCliente.crearCliente(); 
                    }else if (seleccionarTipo().equals("2")){
                        wEmpresa.crearCliente();                  
                    } 
                	break;
                case "2":
                	if (seleccionarTipo().equals("1")) {
                		wCliente.actualizarCliente(); 
                    }else if (seleccionarTipo().equals("2")){
                        wEmpresa.actualizarCliente();                  
                    }  
                    break;
                case "3": 
                	if (seleccionarTipo().equals("1")) {
                		wCliente.eliminarCliente(); 
                    }else if (seleccionarTipo().equals("2")){
                        wEmpresa.eliminarCliente();                  
                    }
                    break;
                case "4":
                	wProducto.ingresarProductos(arrayProducto);
                    break;
                case "5":
                	if (seleccionarTipo().equals("1")) {
                		wCliente.consultarCliente(); 
                    }else if (seleccionarTipo().equals("2")){
                        wEmpresa.consultarCliente();                  
                    }
                	
                    break;
                case "0":
                    System.out.println("Muchas gracias por usar nuestra app, hasta luego");
                    break;
                default:
                    System.out.println("El valor ingresado no es una opcion de menu");
                    break;
            }
        } while (!opMenu.toString().equals("0"));
        in.close();

    }
	
	public static String seleccionarTipo() {
		String tipo = "";
		Scanner in = new Scanner(System.in);
		System.out.println("¿Seleccione el tipo de persona que quiere procesar?");
		System.out.println("1. Cliente");	
		System.out.println("2. Empresa");
		tipo = in.nextLine();
		return tipo;
  }
	
}

