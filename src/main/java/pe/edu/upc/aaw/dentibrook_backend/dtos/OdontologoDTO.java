package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Especialidad;
import pe.edu.upc.aaw.dentibrook_backend.entities.Users;
import java.math.BigDecimal;

public class OdontologoDTO {
    private int odontologo_id;
    private Users user_id;
    private Especialidad especialidad_id;
    private int experiencia_laboral_anios;
    private String educacion_universitaria;
    private int historial_pacientes;
    private String horario_atencion;
    private BigDecimal salario;

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
