/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.weimont.app.dto_model;

/**
 *
 * @author montespierreg
 */
public class VentaDto {
    //Variables de entrada
    private double precio;
    private int cant;
    
    //Variables de salida
    private double monto;
    private double impuesto;

    public VentaDto(double precio, int cant) {
        this.precio = precio;
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    
    
}
