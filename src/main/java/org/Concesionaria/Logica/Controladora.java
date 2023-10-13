
package org.Concesionaria.Logica;

import java.util.List;
import org.Concesionaria.Persistencia.ControladoraPersistencia;

public class Controladora {
    
   ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
   public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantidadPuertas){
   
       Automovil auto = new Automovil();
       auto.setModelo(modelo);
       auto.setMarca(marca);
       auto.setMotor(motor);
       auto.setColor(color);
       auto.setPatente(patente);
       auto.setCantPuertas( cantidadPuertas);
       
       controlPersis.agregarAutomovil(auto);
       
   
   }

    public List<Automovil> traerAutos() {
    return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAutoEliminar) {
       controlPersis.borrarAuto(idAutoEliminar); 
    }

    public Automovil traerAuto(int num_cliente) {
        return controlPersis.traerAuto(num_cliente);
    }

    public void modificarRegistro(Automovil autoModificar, String modelo, String marca, String motor, String color, String patente, int puertas) {

        autoModificar.setModelo(modelo);
        autoModificar.setMarca(marca);
        autoModificar.setMotor(motor);
        autoModificar.setColor(color);
        autoModificar.setPatente(patente);
        autoModificar.setCantPuertas(puertas);
        controlPersis.editarRegistro(autoModificar);
        
    }
}
