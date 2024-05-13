package daw;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaDonantes {

    private ArrayList<Donante> listaDonantes;

    public ListaDonantes() {
        try {
            listaDonantes = LeerFichero.leer("donantes.json");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "error leyendo archivo");
        }

    }

    public ArrayList<Donante> getLista() {
        return listaDonantes;
    }

    public Donante getDonante(int id) {

// Habría que controlar que si el id no es valido, hay excepción
        
        
        return listaDonantes.stream().filter(p -> p.getIdPaciente().equals(id)).findFirst().get();
    }

}
