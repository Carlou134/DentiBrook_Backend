package pe.edu.upc.aaw.dentibrook_backend.dtos;

public class RolbyUserDTO {
    private String rol;
    private int QuantityUsers;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getQuantityUsers() {
        return QuantityUsers;
    }

    public void setQuantityUsers(int quantityUsers) {
        QuantityUsers = quantityUsers;
    }
}
