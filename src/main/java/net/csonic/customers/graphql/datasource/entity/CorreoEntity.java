package net.csonic.customers.graphql.datasource.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CORREO")
public class CorreoEntity {
    @Id
    @Column(name = "CORREO_KEY_IDBC")
    private String correoKeyIdbc;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "CORREO_ESTADO")
    private String correoEstado;
    @Column(name = "TIPO_CORREO_ID")
    private String tipoCorreoId;
    @Column(name = "CORREO_PRIORIDAD")
    private int correoPrioridad;

    public CorreoEntity() {
    }

    public CorreoEntity(String correoKeyIdbc, String correo, String correoEstado, String tipoCorreoId, int correoPrioridad) {
        this.correoKeyIdbc = correoKeyIdbc;
        this.correo = correo;
        this.correoEstado = correoEstado;
        this.tipoCorreoId = tipoCorreoId;
        this.correoPrioridad = correoPrioridad;
    }

    public String getCorreoKeyIdbc() {
        return this.correoKeyIdbc;
    }

    public void setCorreoKeyIdbc(String correoKeyIdbc) {
        this.correoKeyIdbc = correoKeyIdbc;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreoEstado() {
        return this.correoEstado;
    }

    public void setCorreoEstado(String correoEstado) {
        this.correoEstado = correoEstado;
    }

    public String getTipoCorreoId() {
        return this.tipoCorreoId;
    }

    public void setTipoCorreoId(String tipoCorreoId) {
        this.tipoCorreoId = tipoCorreoId;
    }

    public int getCorreoPrioridad() {
        return this.correoPrioridad;
    }

    public void setCorreoPrioridad(int correoPrioridad) {
        this.correoPrioridad = correoPrioridad;
    }

    public CorreoEntity correoKeyIdbc(String correoKeyIdbc) {
        setCorreoKeyIdbc(correoKeyIdbc);
        return this;
    }

    public CorreoEntity correo(String correo) {
        setCorreo(correo);
        return this;
    }

    public CorreoEntity correoEstado(String correoEstado) {
        setCorreoEstado(correoEstado);
        return this;
    }

    public CorreoEntity tipoCorreoId(String tipoCorreoId) {
        setTipoCorreoId(tipoCorreoId);
        return this;
    }

    public CorreoEntity correoPrioridad(int correoPrioridad) {
        setCorreoPrioridad(correoPrioridad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CorreoEntity)) {
            return false;
        }
        CorreoEntity correoEntity = (CorreoEntity) o;
        return Objects.equals(correoKeyIdbc, correoEntity.correoKeyIdbc) && Objects.equals(correo, correoEntity.correo) && Objects.equals(correoEstado, correoEntity.correoEstado) && Objects.equals(tipoCorreoId, correoEntity.tipoCorreoId) && correoPrioridad == correoEntity.correoPrioridad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(correoKeyIdbc, correo, correoEstado, tipoCorreoId, correoPrioridad);
    }

    @Override
    public String toString() {
        return "{" +
            " correoKeyIdbc='" + getCorreoKeyIdbc() + "'" +
            ", correo='" + getCorreo() + "'" +
            ", correoEstado='" + getCorreoEstado() + "'" +
            ", tipoCorreoId='" + getTipoCorreoId() + "'" +
            ", correoPrioridad='" + getCorreoPrioridad() + "'" +
            "}";
    }

    
}
