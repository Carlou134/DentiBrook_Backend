package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class TipoPagoDTO {
    private int IdTipoPago;
    private String Metodo_de_pago;
    private int Cuotas;
    private int Porcentaje_descuento;

    public int getIdTipoPago() {
        return IdTipoPago;
    }

    public void setIdTipoPago(int idTipoPago) {
        IdTipoPago = idTipoPago;
    }

    public String getMetodo_de_pago() {
        return Metodo_de_pago;
    }

    public void setMetodo_de_pago(String metodo_de_pago) {
        Metodo_de_pago = metodo_de_pago;
    }

    public int getCuotas() {
        return Cuotas;
    }

    public void setCuotas(int cuotas) {
        Cuotas = cuotas;
    }

    public int getPorcentaje_descuento() {
        return Porcentaje_descuento;
    }

    public void setPorcentaje_descuento(int porcentaje_descuento) {
        Porcentaje_descuento = porcentaje_descuento;
    }
}