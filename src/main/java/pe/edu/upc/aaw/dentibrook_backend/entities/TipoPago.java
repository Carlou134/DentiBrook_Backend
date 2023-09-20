package pe.edu.upc.aaw.dentibrook_backend.entities;
import org.hibernate.type.descriptor.sql.SmallIntTypeDescriptor;

import javax.persistence.*;

@Entity
@Table(name="tipo_pago")

public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdTipoPago;
    @Column(name = "Metodo_de_pago", nullable = false,length = 10)
    private String Metodo_de_pago;
    @Column(name = "Cuotas", nullable = false)
    private int Cuotas;
    @Column(name = "Porcentaje_descuento", nullable = false)
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
