package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tratamiento")
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tratamiento_id;
    @ManyToOne
    @JoinColumn(name = "medicamento_id")
    private Medicamento medicamento_id;
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo_id;
    @ManyToOne
    @JoinColumn(name = "tipo_pago_id")
    private TipoPago tipo_pago_id;
    @Column(name = "costo")
    private BigDecimal costo;
    @Column(name = "fecha_inicio")
    private LocalDate fecha_inicio;
    @Column(name = "fecha_finalizacion")
    private LocalDate fecha_finalizacion;
    @Column(name = "duracion_en_horas")
    private int duracion_en_horas;
    @Column(name = "efectos_esperados", length = 200)
    private String efectos_esperados;
    @Column(name = "estado", length = 20)
    private String estado;

    public Tratamiento() {
    }

    public Tratamiento(int tratamiento_id, Medicamento medicamento_id, Odontologo odontologo_id, TipoPago tipo_pago_id, BigDecimal costo, LocalDate fecha_inicio, LocalDate fecha_finalizacion, int duracion_en_horas, String efectos_esperados, String estado) {
        this.tratamiento_id = tratamiento_id;
        this.medicamento_id = medicamento_id;
        this.odontologo_id = odontologo_id;
        this.tipo_pago_id = tipo_pago_id;
        this.costo = costo;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.duracion_en_horas = duracion_en_horas;
        this.efectos_esperados = efectos_esperados;
        this.estado = estado;
    }

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
