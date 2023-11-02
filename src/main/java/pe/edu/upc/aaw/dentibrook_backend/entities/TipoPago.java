package pe.edu.upc.aaw.dentibrook_backend.entities;
import javax.persistence.*;

@Entity
@Table(name="tipo_pago")

public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipo_pago_id;
    @Column(name = "metodo_de_pago", length = 50)
    private String metodoDePago;
    @Column(name = "cuotas", nullable = false)
    private int cuotas;
    @Column(name = "porcentaje_descuento", nullable = false)
    private int porcentaje_descuento;

    public TipoPago() {
    }

    public TipoPago(int tipo_pago_id, String metodoDePago, int cuotas, int porcentaje_descuento) {
        this.tipo_pago_id = tipo_pago_id;
        this.metodoDePago = metodoDePago;
        this.cuotas = cuotas;
        this.porcentaje_descuento = porcentaje_descuento;
    }

    public int getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(int tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
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
