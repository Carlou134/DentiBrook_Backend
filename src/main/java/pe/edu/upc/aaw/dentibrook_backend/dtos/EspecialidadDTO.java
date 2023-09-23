package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class EspecialidadDTO {
    private int especialidad_id;
    private String nombre_especialidad;

    public int getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(int especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }
}
