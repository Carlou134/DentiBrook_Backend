package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="cita")
public class Cita{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cita_id;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente_id;
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Servicio servicio_id;
    @ManyToOne
    @JoinColumn(name = "tipo_pago_id")
    private TipoPago tipo_pago_id;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "hora", nullable = false,length = 5)
    private String hora;
    @Column(name = "Duracion_en_horas", nullable = false)
    private int duracion_en_horas;
    @Column(name = "motivo", nullable = false,length = 100)
    private String motivo;
    @Column(name = "estado", nullable = false,length = 10)
    private String estado;
    @Column(name = "direccion_consultorio", nullable = false,length = 30)
    private String direccion_consultorio;
    @Column(name = "tipo_cita", nullable = false, length = 10)
    private String tipo_cita;

    public Cita() {
    }

    public Cita(int cita_id, Paciente paciente_id, Odontologo odontologo_id, Servicio servicio_id, TipoPago tipo_pago_id, LocalDate fecha, String hora, int duracion_en_horas, String motivo, String estado, String direccion_consultorio, String tipo_cita) {
        this.cita_id = cita_id;
        this.paciente_id = paciente_id;
        this.odontologo_id = odontologo_id;
        this.servicio_id = servicio_id;
        this.tipo_pago_id = tipo_pago_id;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion_en_horas = duracion_en_horas;
        this.motivo = motivo;
        this.estado = estado;
        this.direccion_consultorio = direccion_consultorio;
        this.tipo_cita = tipo_cita;
    }

    public int getCita_id() {
        return cita_id;
    }

    public void setCita_id(int cita_id) {
        this.cita_id = cita_id;
    }

    public Paciente getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Paciente paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Odontologo getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(Odontologo odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public Servicio getServicio_id() {
        return servicio_id;
    }

    public void setServicio_id(Servicio servicio_id) {
        this.servicio_id = servicio_id;
    }

    public TipoPago getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(TipoPago tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getDuracion_en_horas() {
        return duracion_en_horas;
    }

    public void setDuracion_en_horas(int duracion_en_horas) {
        this.duracion_en_horas = duracion_en_horas;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion_consultorio() {
        return direccion_consultorio;
    }

    public void setDireccion_consultorio(String direccion_consultorio) {
        this.direccion_consultorio = direccion_consultorio;
    }

    public String getTipo_cita() {
        return tipo_cita;
    }

    public void setTipo_cita(String tipo_cita) {
        this.tipo_cita = tipo_cita;
    }
}

