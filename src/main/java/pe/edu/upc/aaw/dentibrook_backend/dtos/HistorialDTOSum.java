package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class HistorialDTOSum {
    private String nombreEspecialidad;
    private int totalPacientes;

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public int getTotalPacientes() {
        return totalPacientes;
    }

    public void setTotalPacientes(int totalPacientes) {
        this.totalPacientes = totalPacientes;
    }
}
