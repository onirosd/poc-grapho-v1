package net.csonic.customers.graphql.datasource.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DCC")
public class DccEntity {
    @Id
    @Column(name = "DCC_CIC")
    private String dccCic;
    @Column(name = "DCC_CORREO")
    private String dccCorreo;
    @Column(name = "DCC_ESTADO_CORREO")
    private String dccEstadoCorreo;
    @Column(name = "DCC_TIPO_CORREO_ID")
    private String dccTipoCorreoId;
    @Column(name = "DCC_PRIORIDAD")
    private int dccPrioridad;

    public DccEntity() {
    }

    public DccEntity(String correoKeyIdbc, String dccCorreo, String dccEstadoCorreo, String dccTipoCorreoId, int dccPrioridad) {
        this.dccCic = correoKeyIdbc;
        this.dccCorreo = dccCorreo;
        this.dccEstadoCorreo = dccEstadoCorreo;
        this.dccTipoCorreoId = dccTipoCorreoId;
        this.dccPrioridad = dccPrioridad;
    }

    public String getDccCic() {
        return this.dccCic;
    }

    public void setDccCic(String dccCic) {
        this.dccCic = dccCic;
    }

    public String getDccCorreo() {
        return this.dccCorreo;
    }

    public void setDccCorreo(String dccCorreo) {
        this.dccCorreo = dccCorreo;
    }

    public String getDccEstadoCorreo() {
        return this.dccEstadoCorreo;
    }

    public void setDccEstadoCorreo(String dccEstadoCorreo) {
        this.dccEstadoCorreo = dccEstadoCorreo;
    }

    public String getDccTipoCorreoId() {
        return this.dccTipoCorreoId;
    }

    public void setDccTipoCorreoId(String dccTipoCorreoId) {
        this.dccTipoCorreoId = dccTipoCorreoId;
    }

    public int getDccPrioridad() {
        return this.dccPrioridad;
    }

    public void setDccPrioridad(int dccPrioridad) {
        this.dccPrioridad = dccPrioridad;
    }

    public DccEntity correoKeyIdbc(String correoKeyIdbc) {
        setDccCic(correoKeyIdbc);
        return this;
    }

    public DccEntity correo(String correo) {
        setDccCorreo(correo);
        return this;
    }

    public DccEntity correoEstado(String correoEstado) {
        setDccEstadoCorreo(correoEstado);
        return this;
    }

    public DccEntity tipoCorreoId(String tipoCorreoId) {
        setDccTipoCorreoId(tipoCorreoId);
        return this;
    }

    public DccEntity correoPrioridad(int correoPrioridad) {
        setDccPrioridad(correoPrioridad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DccEntity)) {
            return false;
        }
        DccEntity dccEntity = (DccEntity) o;
        return Objects.equals(dccCic, dccEntity.dccCic) && Objects.equals(dccCorreo, dccEntity.dccCorreo) && Objects.equals(dccEstadoCorreo, dccEntity.dccEstadoCorreo) && Objects.equals(dccTipoCorreoId, dccEntity.dccTipoCorreoId) && dccPrioridad == dccEntity.dccPrioridad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dccCic, dccCorreo, dccEstadoCorreo, dccTipoCorreoId, dccPrioridad);
    }

    @Override
    public String toString() {
        return "{" +
                " dccCic='" + getDccCic() + "'" +
                ", dccCorreo='" + getDccCorreo() + "'" +
                ", dccEstadoCorreo='" + getDccEstadoCorreo() + "'" +
                ", dccTipoCorreoId='" + getDccTipoCorreoId() + "'" +
                ", dccPrioridad='" + getDccPrioridad() + "'" +
                "}";
    }


}
