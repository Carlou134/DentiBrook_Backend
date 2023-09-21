package pe.edu.upc.aaw.dentibrook_backend.dtos;
import java.math.BigDecimal;

public class ServicioDTO {
    private int id;
    private String tipo_servicio;
    private BigDecimal precio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
