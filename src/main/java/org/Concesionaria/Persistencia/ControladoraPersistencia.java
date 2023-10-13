
package org.Concesionaria.Persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.Concesionaria.Logica.Automovil;
import org.Concesionaria.Persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        
       return autoJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAutoEliminar) {
        try {
            autoJpa.destroy(idAutoEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int num_cliente) {
        return autoJpa.findAutomovil(num_cliente);
    }

    public void editarRegistro(Automovil autoModificar) {
        try {
            autoJpa.edit(autoModificar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
