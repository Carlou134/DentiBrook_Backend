package pe.edu.upc.aaw.dentibrook_backend.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MedicamentoDTO {
    private int medicamento_id;
    private String nombre;
    private String forma_farmaceutica;
    private String via;
    private LocalDate fecha_caducidad;
    private BigDecimal precio;

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
