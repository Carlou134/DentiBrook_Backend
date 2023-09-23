package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class Tipo_servicioCitaDTO {
    private String Tipo_servicio;
    private int VrquantityCitas;

    public String getTipo_servicio() {
        return Tipo_servicio;
    }

    public void setTipo_servicio(String tipo_servicio) {
        Tipo_servicio = tipo_servicio;
    }

    public int getVrquantityCitas() {
        return VrquantityCitas;
    }

    public void setVrquantityCitas(int vrquantityCitas) {
        VrquantityCitas = vrquantityCitas;
    }
}
