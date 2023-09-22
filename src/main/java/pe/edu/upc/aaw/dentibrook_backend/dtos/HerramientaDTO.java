package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;

public class HerramientaDTO {
    private int herramienta_id;
    private Odontologo odontologo_id;
    private String nombre;

    public int getHerramienta_id() {
        return herramienta_id;
    }

    public void setHerramienta_id(int herramienta_id) {
        this.herramienta_id = herramienta_id;
    }

    public Odontologo getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(Odontologo odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
