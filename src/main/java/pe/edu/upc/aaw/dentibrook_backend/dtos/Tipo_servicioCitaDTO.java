package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class Tipo_servicioCitaDTO {
    private String tipo_servicio;
    private int vrquantityCitas;

    public String getTipo_servicio() {
        return tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        this.tipo_servicio = tipo_servicio;
    }

    public int getVrquantityCitas() {
        return vrquantityCitas;
    }

    public void setVrquantityCitas(int vrquantityCitas) {
        this.vrquantityCitas = vrquantityCitas;
    }
}
