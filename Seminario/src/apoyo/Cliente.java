/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoyo;

import java.util.Date;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author julio
 */
public class Cliente {

    public String nombre;
    public String RFC;
    public int edad;
    public Date fecha;
    public String telefono;
    public String correo;

    Vector<Prestamo> prestamos;

    public Cliente(String nombre, String RFC, int edad, String telefono, String correo) {
        this.nombre = nombre;
        this.RFC = RFC;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        fecha = new Date();
        prestamos = new Vector();
    }

    public void addPrestamo(Prestamo p) {
        this.prestamos.add(p);
    }

    public boolean validarC() {
        String patron = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(correo);

        return matcher.matches();
    }

    public boolean validarT() {
        String patron = "^[2-9][0-9]{9}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(telefono);

        return matcher.matches();
    }

    public boolean validarRFC() {
        // Expresión regular para validar RFC
        String regex = "^[A-Z&Ñ]{4}\\d{6}[A-Z0-9]{3}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(RFC);

        return matcher.matches();
    }

    @Override
    public String toString() {
        return nombre;
    }

    public Vector<Prestamo> getPrestamos() {
        return prestamos;
    }

}
