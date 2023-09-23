package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class QuantitybyCitaDTO {
    private String tipo_cita;
    private int adQuantityCita;

    public String getTipo_cita() {
        return tipo_cita;
    }

    public void setTipo_cita(String tipo_cita) {
        this.tipo_cita = tipo_cita;
    }

    public int getAdQuantityCita() {
        return adQuantityCita;
    }

    public void setAdQuantityCita(int adQuantityCita) {
        this.adQuantityCita = adQuantityCita;
    }
}
