package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="Servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "TipoServicio", nullable = false,length = 50)
    private String tipo_servicio;
    @Column(name = "Precio", nullable = false)
    private BigDecimal precio;

    public Servicio() {
    }

    public Servicio(int id, String tipo_servicio, BigDecimal precio) {
        this.id = id;
        this.tipo_servicio = tipo_servicio;
        this.precio = precio;
    }

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
