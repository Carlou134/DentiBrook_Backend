package pe.edu.upc.aaw.dentibrook_backend.entities;
import javax.persistence.*;

@Entity
@Table(name="tipo_pago")

public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipo_pago_id;
    @Column(name = "metodo_de_pago", length = 10)
    private String metodo_de_pago;
    @Column(name = "cuotas", nullable = false)
    private int cuotas;
    @Column(name = "porcentaje_descuento", nullable = false)
    private int porcentaje_descuento;

    public TipoPago() {
    }

    public TipoPago(int tipo_pago_id, String metodo_de_pago, int cuotas, int porcentaje_descuento) {
        this.tipo_pago_id = tipo_pago_id;
        this.metodo_de_pago = metodo_de_pago;
        this.cuotas = cuotas;
        this.porcentaje_descuento = porcentaje_descuento;
    }

    public int getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(int tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public String getMetodo_de_pago() {
        return metodo_de_pago;
    }

    public void setMetodo_de_pago(String metodo_de_pago) {
        this.metodo_de_pago = metodo_de_pago;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(int porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }
}
