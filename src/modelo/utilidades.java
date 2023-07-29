/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author juan_seb.bastidas
 */
public class utilidades {
    
    public static boolean guardarArchivo(LinkedList<Cliente>listaClientes){
        boolean t = false;
        try{
            String nombreArchivo = "clientes.txt";
            
            FileWriter filew = new FileWriter(nombreArchivo);
            
            BufferedWriter writer = new BufferedWriter(filew);
            //PrintWriter salida = new PrintWriter(
                    //new BufferedWriter(new FileWriter(nombreArchivo)));
            for (Cliente objE : listaClientes) {
                writer.write(objE.toString());
                //writer.write(Cliente.toString() + "\n");
            }
            writer.close();
            filew.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
        return t;
    }
    
}
