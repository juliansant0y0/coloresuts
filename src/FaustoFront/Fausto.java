
package FaustoFront;

import javax.swing.JOptionPane;

/**
 *
 * @author aula12
 */
public class Fausto {
    private String Nombre;
    private String edad;

    public Fausto(String Nombre, String edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public void Mostrar (){
        JOptionPane.showMessageDialog(null, ""+this.Nombre+" edad "+this.edad);
    }
    
}
