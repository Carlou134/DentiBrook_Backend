package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name="Servicio")

public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Servicio_id;
    @Column(name = "Precio", nullable = false)
    private Double Precio;

    @Column(name = "TipoServicio", nullable = false,length = 50)
    private String tipo_servicio;

    public int getServicio_id() {
        return Servicio_id;
    }

    public void setServicio_id(int servicio_id) {
        Servicio_id = servicio_id;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }
}
