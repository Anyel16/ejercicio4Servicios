package modelo;

import java.time.LocalDate;
public abstract class Servicios implements Servicio{

    String Trabajador;
    LocalDate FechaInicio;
    String Cliente;

    public Servicios(String trabajador, LocalDate fechaInicio, String cliente) {
        Trabajador = trabajador;
        FechaInicio = fechaInicio;
        Cliente = cliente;
    }



    public Servicios(String cliente) {

        Cliente = cliente;
    }

    public String getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(String trabajador) {
        Trabajador = trabajador;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public abstract double costeMaterial();

    public abstract double costeManoObra();

    public abstract double costeTotal();
    public abstract String detalleServicio();


}