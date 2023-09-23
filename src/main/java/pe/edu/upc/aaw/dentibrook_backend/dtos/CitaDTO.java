package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;
import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;
import pe.edu.upc.aaw.dentibrook_backend.entities.Servicio;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;

import java.time.LocalDate;

public class CitaDTO {
    private int cita_id;
    private Paciente paciente_id;
    private Odontologo odontologo_id;
    private Servicio servicio_id;
    private TipoPago tipo_pago_id;
    private LocalDate fecha;
    private String hora;
    private int duracion_en_horas;
    private String motivo;
    private String estado;
    private String direccion_consultorio;
    private String tipo_cita;

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
