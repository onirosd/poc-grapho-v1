package net.csonic.customers.graphql.datasource.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DTC")
public class DtcEntity {

    @Id
    @Column(name = "DTC_CIC")
    private String dtcCic;

    @Column(name = "DTC_NUMERO")
    private String dtcNumero;

    @Column(name = "DTC_TIPO_TELEFONO_ID")
    private String dtcTipoTelefonoId;

    @Column(name = "DTC_ESTADO")
    private String dtcEstado;

    @Column(name = "DTC_CLASIFICACION_ID")
    private String dtcClasificacionId;

    @Column(name = "DTC_ANEXO")
    private String dtcAnexo;

    @Column(name = "DTC_COD_PAIS")
    private String dtcCodPais;

    @Column(name = "DTC_COD_AREA")
    private String dtcCodArea;

    @Column(name = "DTC_PRIORIDAD")
    private int dtcPrioridad;

    public DtcEntity() {
    }

    public DtcEntity(String dtcCic, String dtcNumero, String dtcTipoTelefonoId, String dtcEstado, String dtcClasificacionId, String dtcAnexo, String dtcCodPais, String dtcCodArea, int dtcPrioridad) {
        this.dtcCic = dtcCic;
        this.dtcNumero = dtcNumero;
        this.dtcTipoTelefonoId = dtcTipoTelefonoId;
        this.dtcEstado = dtcEstado;
        this.dtcClasificacionId = dtcClasificacionId;
        this.dtcAnexo = dtcAnexo;
        this.dtcCodPais = dtcCodPais;
        this.dtcCodArea = dtcCodArea;
        this.dtcPrioridad = dtcPrioridad;
    }

    public String getDtcCic() {
        return this.dtcCic;
    }

    public void setDtcCic(String dtcCic) {
        this.dtcCic = dtcCic;
    }

    public String getDtcNumero() {
        return this.dtcNumero;
    }

    public void setDtcNumero(String dtcNumero) {
        this.dtcNumero = dtcNumero;
    }

    public String getDtcTipoTelefonoId() {
        return this.dtcTipoTelefonoId;
    }

    public void setDtcTipoTelefonoId(String dtcTipoTelefonoId) {
        this.dtcTipoTelefonoId = dtcTipoTelefonoId;
    }

    public String getDtcEstado() {
        return this.dtcEstado;
    }

    public void setDtcEstado(String dtcEstado) {
        this.dtcEstado = dtcEstado;
    }

    public String getDtcClasificacionId() {
        return this.dtcClasificacionId;
    }

    public void setDtcClasificacionId(String dtcClasificacionId) {
        this.dtcClasificacionId = dtcClasificacionId;
    }

    public String getDtcAnexo() {
        return this.dtcAnexo;
    }

    public void setDtcAnexo(String dtcAnexo) {
        this.dtcAnexo = dtcAnexo;
    }

    public String getDtcCodPais() {
        return this.dtcCodPais;
    }

    public void setDtcCodPais(String dtcCodPais) {
        this.dtcCodPais = dtcCodPais;
    }

    public String getDtcCodArea() {
        return this.dtcCodArea;
    }

    public void setDtcCodArea(String dtcCodArea) {
        this.dtcCodArea = dtcCodArea;
    }

    public int getDtcPrioridad() {
        return this.dtcPrioridad;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DtcEntity)) {
            return false;
        }
        DtcEntity dtcEntity = (DtcEntity) o;
        return Objects.equals(dtcCic, dtcEntity.dtcCic) && Objects.equals(dtcNumero, dtcEntity.dtcNumero) && Objects.equals(dtcTipoTelefonoId, dtcEntity.dtcTipoTelefonoId) && Objects.equals(dtcEstado, dtcEntity.dtcEstado) && Objects.equals(dtcClasificacionId, dtcEntity.dtcClasificacionId) && Objects.equals(dtcAnexo, dtcEntity.dtcAnexo) && Objects.equals(dtcCodPais, dtcEntity.dtcCodPais) && Objects.equals(dtcCodArea, dtcEntity.dtcCodArea) && dtcPrioridad == dtcEntity.dtcPrioridad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtcCic, dtcNumero, dtcTipoTelefonoId, dtcEstado, dtcClasificacionId, dtcAnexo, dtcCodPais, dtcCodArea, dtcPrioridad);
    }

    @Override
    public String toString() {
        return "{" +
                " dtcCic='" + getDtcCic() + "'" +
                ", dtcNumero='" + getDtcNumero() + "'" +
                ", dtcTipoTelefonoId='" + getDtcTipoTelefonoId() + "'" +
                ", dtcEstado='" + getDtcEstado() + "'" +
                ", dtcClasificacionId='" + getDtcClasificacionId() + "'" +
                ", dtcAnexo='" + getDtcAnexo() + "'" +
                ", dtcCodPais='" + getDtcCodPais() + "'" +
                ", dtcCodArea='" + getDtcCodArea() + "'" +
                ", dtcPrioridad='" + getDtcPrioridad() + "'" +
                "}";
    }



}
