package modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicios{
    double Superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double superficie) {
        Superficie = superficie;
    }

    public double getPrecioPintura() {
        return PrecioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }

    public double costeMaterial(){
        return ((this.Superficie/7.8)*this.PrecioPintura);
    }

    public double costeManoObra(){
        return ((this.Superficie/10)*9.5);
    }

    public double costeTotal(){
        if (this.Superficie<50) {
            return costeMaterial() + costeManoObra() + (costeMaterial()+costeManoObra())*0.15;
        } else {
            return costeMaterial() + costeManoObra();
        }
    }

    @Override
    public String detalleServicio() {
        return "TrabajoPintura{" +
                "Superficie=" + Superficie +
                ", PrecioPintura=" + PrecioPintura +
                ", Trabajador='" + Trabajador + '\'' +
                ", FechaInicio=" + FechaInicio +
                ", Cliente='" + Cliente + '\'' +
                '}';
    }
}
