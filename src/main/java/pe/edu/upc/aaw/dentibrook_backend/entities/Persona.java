package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int persona_id;
    @Column(name = "nombre", length = 30)
    private String nombre;
    @Column(name = "apellido", length = 30)
    private String apellido;
    @Column(name = "genero")
    private char genero;
    @Column(name = "fecha_nacimiento")
    private LocalDate fecha_nacimiento;
    @Column(name = "DNI", length = 9)
    private String DNI;
    @Column(name = "correo_electronico", length = 30)
    private String correo_electronico;
    @Column(name = "telefono", length = 10)
    private String telefono;
    @Column(name = "pais_de_origen", length = 20)
    private String pais_de_origen;

    public Persona() {
    }

    public Persona(int persona_id, String nombre, String apellido, char genero, LocalDate fecha_nacimiento, String DNI, String correo_electronico, String telefono, String pais_de_origen) {
        this.persona_id = persona_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.DNI = DNI;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.pais_de_origen = pais_de_origen;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais_de_origen() {
        return pais_de_origen;
    }

    public void setPais_de_origen(String pais_de_origen) {
        this.pais_de_origen = pais_de_origen;
    }
}
