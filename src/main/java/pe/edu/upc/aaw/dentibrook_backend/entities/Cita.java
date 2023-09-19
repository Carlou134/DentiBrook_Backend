package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Cita")
public class Cita{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Cita_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Servicio Servicio_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private TipoPago IDTipoPago;
    @ManyToOne
    @JoinColumn(name = "id")
    private Paciente id_paciente;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "tipo_cita", nullable = false,length = 10)
    private String tipo_cita;
    @Column(name = "Duracion_en_horas", nullable = false)
    private int Duracion_en_horas;
    @Column(name = "motivo", nullable = false,length = 100)
    private String motivo;
    @Column(name = "estado", nullable = false,length = 10)
    private String estado;
    @Column(name = "direccion_consultorio", nullable = false,length = 30)
    private String direccion_consultorio;
    @Column(name = "hora", nullable = false,length = 5)
    private String hora;

    public int getCita_id() {
        return Cita_id;
    }

    public void setCita_id(int cita_id) {
        Cita_id = cita_id;
    }

    public Servicio getServicio_id() {
        return Servicio_id;
    }

    public void setServicio_id(Servicio servicio_id) {
        Servicio_id = servicio_id;
    }

    public TipoPago getIDTipoPago() {
        return IDTipoPago;
    }

    public void setIDTipoPago(TipoPago IDTipoPago) {
        this.IDTipoPago = IDTipoPago;
    }

    public Paciente getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Paciente id_paciente) {
        this.id_paciente = id_paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo_cita() {
        return tipo_cita;
    }

    public void setTipo_cita(String tipo_cita) {
        this.tipo_cita = tipo_cita;
    }

    public int getDuracion_en_horas() {
        return Duracion_en_horas;
    }

    public void setDuracion_en_horas(int duracion_en_horas) {
        Duracion_en_horas = duracion_en_horas;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}

