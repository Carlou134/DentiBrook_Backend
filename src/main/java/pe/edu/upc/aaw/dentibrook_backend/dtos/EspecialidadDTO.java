package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class EspecialidadDTO {
    private int especialidad_id;
    private String nombreEspecialidad;

    public int getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(int especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }
}
