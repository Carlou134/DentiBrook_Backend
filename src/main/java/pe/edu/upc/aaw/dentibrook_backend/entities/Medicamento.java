package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "medicamento")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicamento_id;
    @Column(name = "nombre", length = 100)
    private String nombre;
    @Column(name = "forma_farmaceutica", length = 50)
    private String forma_farmaceutica;
    @Column(name = "via", length = 50)
    private String via;
    @Column(name = "fecha_caducidad")
    private LocalDate fecha_caducidad;
    @Column(name = "precio")
    private BigDecimal precio;

    public Medicamento() {
    }

    public Medicamento(int medicamento_id, String nombre, String forma_farmaceutica, String via, LocalDate fecha_caducidad, BigDecimal precio) {
        this.medicamento_id = medicamento_id;
        this.nombre = nombre;
        this.forma_farmaceutica = forma_farmaceutica;
        this.via = via;
        this.fecha_caducidad = fecha_caducidad;
        this.precio = precio;
    }

    public int getMedicamento_id() {
        return medicamento_id;
    }

    public void setMedicamento_id(int medicamento_id) {
        this.medicamento_id = medicamento_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getForma_farmaceutica() {
        return forma_farmaceutica;
    }

    public void setForma_farmaceutica(String forma_farmaceutica) {
        this.forma_farmaceutica = forma_farmaceutica;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public LocalDate getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(LocalDate fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
