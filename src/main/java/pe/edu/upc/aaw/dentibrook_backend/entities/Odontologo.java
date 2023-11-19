package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "odontologo")
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int odontologo_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user_id;
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad_id;
    @Column(name = "experiencia_laboral_anios", nullable = false)
    private int experiencia_laboral_anios;
    @Column(name = "educacion_universitaria", length = 30)
    private String educacion_universitaria;
    @Column(name = "historial_pacientes", nullable = false)
    private int historial_pacientes;
    @Column(name = "horario_atencion", length = 100)
    private String horario_atencion;
    @Column(name = "salario", nullable = false)
    private BigDecimal salario;

    public Odontologo() {
    }

    public Odontologo(int odontologo_id, Users user_id, Especialidad especialidad_id, int experiencia_laboral_anios, String educacion_universitaria, int historial_pacientes, String horario_atencion, BigDecimal salario) {
        this.odontologo_id = odontologo_id;
        this.user_id = user_id;
        this.especialidad_id = especialidad_id;
        this.experiencia_laboral_anios = experiencia_laboral_anios;
        this.educacion_universitaria = educacion_universitaria;
        this.historial_pacientes = historial_pacientes;
        this.horario_atencion = horario_atencion;
        this.salario = salario;
    }

    public int getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(int odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Especialidad getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(Especialidad especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public int getExperiencia_laboral_anios() {
        return experiencia_laboral_anios;
    }

    public void setExperiencia_laboral_anios(int experiencia_laboral_anios) {
        this.experiencia_laboral_anios = experiencia_laboral_anios;
    }

    public String getEducacion_universitaria() {
        return educacion_universitaria;
    }

    public void setEducacion_universitaria(String educacion_universitaria) {
        this.educacion_universitaria = educacion_universitaria;
    }

    public int getHistorial_pacientes() {
        return historial_pacientes;
    }

    public void setHistorial_pacientes(int historial_pacientes) {
        this.historial_pacientes = historial_pacientes;
    }

    public String getHorario_atencion() {
        return horario_atencion;
    }

    public void setHorario_atencion(String horario_atencion) {
        this.horario_atencion = horario_atencion;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
