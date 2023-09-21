package pe.edu.upc.aaw.dentibrook_backend.entities;
import javax.persistence.*;

@Entity
@Table(name="tipo_pago")

public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipo_pago_id;
    @Column(name = "Metodo_de_pago", length = 10)
    private String Metodo_de_pago;
    @Column(name = "Cuotas", nullable = false)
    private int Cuotas;
    @Column(name = "Porcentaje_descuento", nullable = false)
    private int Porcentaje_descuento;

    public TipoPago() {
    }

    public TipoPago(int tipo_pago_id, String metodo_de_pago, int cuotas, int porcentaje_descuento) {
        this.tipo_pago_id = tipo_pago_id;
        Metodo_de_pago = metodo_de_pago;
        Cuotas = cuotas;
        Porcentaje_descuento = porcentaje_descuento;
    }

    public int getTipo_pago_id() {
        return tipo_pago_id;
    }

    public void setTipo_pago_id(int tipo_pago_id) {
        this.tipo_pago_id = tipo_pago_id;
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
