package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Medicamento;
import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TratamientoDTO {
    private int tratamiento_id;
    private Medicamento medicamento_id;
    private Odontologo odontologo_id;
    private TipoPago tipo_pago_id;
    private BigDecimal costo;
    private LocalDate fecha_inicio;
    private LocalDate fecha_finalizacion;
    private int duracion_en_horas;
    private String efectos_esperados;
    private String estado;

    public int getTratamiento_id() {
        return tratamiento_id;
    }

    public void setTratamiento_id(int tratamiento_id) {
        this.tratamiento_id = tratamiento_id;
    }

    public Medicamento getMedicamento_id() {
        return medicamento_id;
    }

    public void setMedicamento_id(Medicamento medicamento_id) {
        this.medicamento_id = medicamento_id;
    }

    public Odontologo getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(Odontologo odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public TipoPago getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(TipoPago tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public void setFecha_finalizacion(LocalDate fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public int getDuracion_en_horas() {
        return duracion_en_horas;
    }

    public void setDuracion_en_horas(int duracion_en_horas) {
        this.duracion_en_horas = duracion_en_horas;
    }

    public String getEfectos_esperados() {
        return efectos_esperados;
    }

    public void setEfectos_esperados(String efectos_esperados) {
        this.efectos_esperados = efectos_esperados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
