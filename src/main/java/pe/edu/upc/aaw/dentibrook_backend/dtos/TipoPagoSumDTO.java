package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class TipoPagoSumDTO {
    private String metodoDePago;
    private int totalCuotas;

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public int getTotalCuotas() {
        return totalCuotas;
    }

    public void setTotalCuotas(int totalCuotas) {
        this.totalCuotas = totalCuotas;
    }
}
