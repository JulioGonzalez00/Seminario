/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apoyo;

/**
 *
 * @author julio
 */
public class Prestamo {

    public int monto;
    public int meses;
    public float intereses;

    public Prestamo(int monto, int meses, float intereses) {
        this.monto = monto;
        this.meses = meses;
        this.intereses = intereses;
    }

    public String toString() {
        String string = "Monto: " + monto;
        string += ", Meses: " + meses;
        string += ", Intereses: " + intereses;
        string += ".";

        return string;
    }

}
