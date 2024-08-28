package net.csonic.customers.graphql.datasource.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TELEFONO")
public class TelefonoEntity {

    @Id
    @Column(name = "TELEFONO_KEY_IDBC")
    private String telefonoKeyIdbc;

    @Column(name = "TELEFONO_NUMERO")
    private String telefonoNumero;

    @Column(name = "TIPO_TELEFONO_ID")
    private String tipoTelefonoId;

    @Column(name = "TELEFONO_ESTADO")
    private String telefonoEstado;

    @Column(name = "TELEFONO_CLASIFICACION_ID")
    private String telefonoClasificacionId;

    @Column(name = "TELEFONO_ANEXO")
    private String telefonoAnexo;

    @Column(name = "TELEFONO_COD_PAIS")
    private String telefonoCodPais;

    @Column(name = "TELEFONO_COD_AREA")
    private String telefonoCodArea;

    @Column(name = "TELEFONO_PRIORIDAD")
    private int telefonoPrioridad;

    public TelefonoEntity() {
    }

    public TelefonoEntity(String telefonoKeyIdbc, String telefonoNumero, String tipoTelefonoId, String telefonoEstado, String telefonoClasificacionId, String telefonoAnexo, String telefonoCodPais, String telefonoCodArea, int telefonoPrioridad) {
        this.telefonoKeyIdbc = telefonoKeyIdbc;
        this.telefonoNumero = telefonoNumero;
        this.tipoTelefonoId = tipoTelefonoId;
        this.telefonoEstado = telefonoEstado;
        this.telefonoClasificacionId = telefonoClasificacionId;
        this.telefonoAnexo = telefonoAnexo;
        this.telefonoCodPais = telefonoCodPais;
        this.telefonoCodArea = telefonoCodArea;
        this.telefonoPrioridad = telefonoPrioridad;
    }

    public String getTelefonoKeyIdbc() {
        return this.telefonoKeyIdbc;
    }

    public void setTelefonoKeyIdbc(String telefonoKeyIdbc) {
        this.telefonoKeyIdbc = telefonoKeyIdbc;
    }

    public String getTelefonoNumero() {
        return this.telefonoNumero;
    }

    public void setTelefonoNumero(String telefonoNumero) {
        this.telefonoNumero = telefonoNumero;
    }

    public String getTipoTelefonoId() {
        return this.tipoTelefonoId;
    }

    public void setTipoTelefonoId(String tipoTelefonoId) {
        this.tipoTelefonoId = tipoTelefonoId;
    }

    public String getTelefonoEstado() {
        return this.telefonoEstado;
    }

    public void setTelefonoEstado(String telefonoEstado) {
        this.telefonoEstado = telefonoEstado;
    }

    public String getTelefonoClasificacionId() {
        return this.telefonoClasificacionId;
    }

    public void setTelefonoClasificacionId(String telefonoClasificacionId) {
        this.telefonoClasificacionId = telefonoClasificacionId;
    }

    public String getTelefonoAnexo() {
        return this.telefonoAnexo;
    }

    public void setTelefonoAnexo(String telefonoAnexo) {
        this.telefonoAnexo = telefonoAnexo;
    }

    public String getTelefonoCodPais() {
        return this.telefonoCodPais;
    }

    public void setTelefonoCodPais(String telefonoCodPais) {
        this.telefonoCodPais = telefonoCodPais;
    }

    public String getTelefonoCodArea() {
        return this.telefonoCodArea;
    }

    public void setTelefonoCodArea(String telefonoCodArea) {
        this.telefonoCodArea = telefonoCodArea;
    }

    public int getTelefonoPrioridad() {
        return this.telefonoPrioridad;
    }

    public void setTelefonoPrioridad(int telefonoPrioridad) {
        this.telefonoPrioridad = telefonoPrioridad;
    }

    public TelefonoEntity telefonoKeyIdbc(String telefonoKeyIdbc) {
        setTelefonoKeyIdbc(telefonoKeyIdbc);
        return this;
    }

    public TelefonoEntity telefonoNumero(String telefonoNumero) {
        setTelefonoNumero(telefonoNumero);
        return this;
    }

    public TelefonoEntity tipoTelefonoId(String tipoTelefonoId) {
        setTipoTelefonoId(tipoTelefonoId);
        return this;
    }

    public TelefonoEntity telefonoEstado(String telefonoEstado) {
        setTelefonoEstado(telefonoEstado);
        return this;
    }

    public TelefonoEntity telefonoClasificacionId(String telefonoClasificacionId) {
        setTelefonoClasificacionId(telefonoClasificacionId);
        return this;
    }

    public TelefonoEntity telefonoAnexo(String telefonoAnexo) {
        setTelefonoAnexo(telefonoAnexo);
        return this;
    }

    public TelefonoEntity telefonoCodPais(String telefonoCodPais) {
        setTelefonoCodPais(telefonoCodPais);
        return this;
    }

    public TelefonoEntity telefonoCodArea(String telefonoCodArea) {
        setTelefonoCodArea(telefonoCodArea);
        return this;
    }

    public TelefonoEntity telefonoPrioridad(int telefonoPrioridad) {
        setTelefonoPrioridad(telefonoPrioridad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TelefonoEntity)) {
            return false;
        }
        TelefonoEntity telefonoEntity = (TelefonoEntity) o;
        return Objects.equals(telefonoKeyIdbc, telefonoEntity.telefonoKeyIdbc) && Objects.equals(telefonoNumero, telefonoEntity.telefonoNumero) && Objects.equals(tipoTelefonoId, telefonoEntity.tipoTelefonoId) && Objects.equals(telefonoEstado, telefonoEntity.telefonoEstado) && Objects.equals(telefonoClasificacionId, telefonoEntity.telefonoClasificacionId) && Objects.equals(telefonoAnexo, telefonoEntity.telefonoAnexo) && Objects.equals(telefonoCodPais, telefonoEntity.telefonoCodPais) && Objects.equals(telefonoCodArea, telefonoEntity.telefonoCodArea) && telefonoPrioridad == telefonoEntity.telefonoPrioridad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefonoKeyIdbc, telefonoNumero, tipoTelefonoId, telefonoEstado, telefonoClasificacionId, telefonoAnexo, telefonoCodPais, telefonoCodArea, telefonoPrioridad);
    }

    @Override
    public String toString() {
        return "{" +
            " telefonoKeyIdbc='" + getTelefonoKeyIdbc() + "'" +
            ", telefonoNumero='" + getTelefonoNumero() + "'" +
            ", tipoTelefonoId='" + getTipoTelefonoId() + "'" +
            ", telefonoEstado='" + getTelefonoEstado() + "'" +
            ", telefonoClasificacionId='" + getTelefonoClasificacionId() + "'" +
            ", telefonoAnexo='" + getTelefonoAnexo() + "'" +
            ", telefonoCodPais='" + getTelefonoCodPais() + "'" +
            ", telefonoCodArea='" + getTelefonoCodArea() + "'" +
            ", telefonoPrioridad='" + getTelefonoPrioridad() + "'" +
            "}";
    }


    
}
