package modelo;

public interface Servicio {
    double costeMaterial();

    double costeManoObra();

    double costeTotal();
    String detalleServicio();
}
