/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuentaBanco;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author david
 */
public class Cuenta {
    
    private String numeroCuenta;
    private String nif;
    private String nombreCliente;
    private int saldoActual;
    private double interes; //0.1 y 3

    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, String nif, String nombreCliente, int saldoActual, double interes) {
        this.numeroCuenta = generarNumeroCuenta();
        this.nif = nif;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNif() {
        return nif;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nif=" + nif + ", nombreCliente=" + nombreCliente + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    public String generarNumeroCuenta(){
        
        for (int i = 0; i < 10; i++) {
        
            String numeroCuenta = RandomStringUtils.randomNumeric(20);                      
        }
        
        return numeroCuenta;
    }
}
