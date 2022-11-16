import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String usuario;
    private String contraseña;

    static List listaPersonas = new ArrayList<Persona>();

    public Persona() {
    }

    public Persona(String nombre, String usuario, String contraseña) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public List<Persona> getPersona() {
        if (this.listaPersonas == null) {
            listaPersonas = new ArrayList<Persona>();
        }
        return listaPersonas;
    }
}