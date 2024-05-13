/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class LeerFichero {
    
    public static  ArrayList<Donante> leer(String ruta) throws IOException{
            ObjectMapper mapeador = new ObjectMapper();
        
        
        ArrayList<Donante> catalogo = mapeador.readValue(new File(ruta),
                    mapeador.getTypeFactory().
                constructCollectionType
        (ArrayList.class, Donante.class));
        
        ArrayList<Donante> devolver = new ArrayList<Donante>(catalogo.stream().limit(25).toList());
        return devolver;
        
        
    }
    
}
