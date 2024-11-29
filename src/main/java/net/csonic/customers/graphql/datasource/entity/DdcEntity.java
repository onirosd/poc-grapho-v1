package net.csonic.customers.graphql.datasource.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DDC")
public class DdcEntity {
    @Id
    @Column(name = "DDC_CIC")
    private String ddcCic;

    @Column(name = "DDC_NUM_DIRE")
    private String ddcNumDire;

    @Column(name = "DDC_MSC_TDIR")
    private String ddcMscTdir;

    @Column(name = "DDC_COD_TVIA")
    private String ddcCodTvia;

    @Column(name = "DDC_MSC_BVIA")
    private String ddcMscBvia;

    @Column(name = "DDC_NUMERACION")
    private String ddcNumeracion;

    @Column(name = "DDC_MSC_LOTE")
    private String ddcMscLote;

    @Column(name = "DDC_COD_TCHB")
    private String ddcCodTchb;

    @Column(name = "DDC_MSC_CJHB")
    private String ddcMscCjhb;

    @Column(name = "DDC_COD_SEZN")
    private String ddcCodSezn;

    @Column(name = "DDC_MSC_SEZN")
    private String ddcMscSezn;

    @Column(name = "DDC_GLS_COM_DIRE")
    private String ddcGlsComDire;

    @Column(name = "DDC_MSC_DPIR")
    private String ddcMscDpir;

    @Column(name = "DDC_NUM_DPIR")
    private String ddcNumDpir;

    @Column(name = "DDC_MSC_MNZA")
    private String ddcMscMnza;

    @Column(name = "DDC_COD_LUGA")
    private String ddcCodLuga;

    @Column(name = "DDC_MSC_SDIR")
    private String ddcMscSdir;

    @Column(name = "DDC_GLS_REFE")
    private String ddcGlsRefe;

    @Column(name = "DDC_PRIORIDAD")
    private int ddcPrioridad;

    public DdcEntity() {
    }

    public DdcEntity(String ddcCic, String ddcNumDire, String ddcMscTdir, String ddcCodTvia, String ddcMscBvia, String ddcNumeracion, String ddcMscLote, String ddcCodTchb, String ddcMscCjhb, String ddcCodSezn, String ddcMscSezn, String ddcGlsComDire, String ddcMscDpir, String ddcNumDpir, String ddcMscMnza, String ddcCodLuga, String ddcMscSdir, String ddcGlsRefe, int ddcPrioridad) {
        this.ddcCic = ddcCic;
        this.ddcNumDire = ddcNumDire;
        this.ddcMscTdir = ddcMscTdir;
        this.ddcCodTvia = ddcCodTvia;
        this.ddcMscBvia = ddcMscBvia;
        this.ddcNumeracion = ddcNumeracion;
        this.ddcMscLote = ddcMscLote;
        this.ddcCodTchb = ddcCodTchb;
        this.ddcMscCjhb = ddcMscCjhb;
        this.ddcCodSezn = ddcCodSezn;
        this.ddcMscSezn = ddcMscSezn;
        this.ddcGlsComDire = ddcGlsComDire;
        this.ddcMscDpir = ddcMscDpir;
        this.ddcNumDpir = ddcNumDpir;
        this.ddcMscMnza = ddcMscMnza;
        this.ddcCodLuga = ddcCodLuga;
        this.ddcMscSdir = ddcMscSdir;
        this.ddcGlsRefe = ddcGlsRefe;
        this.ddcPrioridad = ddcPrioridad;
    }

    public String getDdcCic() {
        return this.ddcCic;
    }

    public void setDdcCic(String ddcCic) {
        this.ddcCic = ddcCic;
    }

    public String getDdcNumDire() {
        return this.ddcNumDire;
    }

    public void setDdcNumDire(String ddcNumDire) {
        this.ddcNumDire = ddcNumDire;
    }

    public String getDdcMscTdir() {
        return this.ddcMscTdir;
    }

    public void setDdcMscTdir(String ddcMscTdir) {
        this.ddcMscTdir = ddcMscTdir;
    }

    public String getDdcCodTvia() {
        return this.ddcCodTvia;
    }

    public void setDdcCodTvia(String ddcCodTvia) {
        this.ddcCodTvia = ddcCodTvia;
    }

    public String getDdcMscBvia() {
        return this.ddcMscBvia;
    }

    public void setDdcMscBvia(String ddcMscBvia) {
        this.ddcMscBvia = ddcMscBvia;
    }

    public String getDdcNumeracion() {
        return this.ddcNumeracion;
    }

    public void setDdcNumeracion(String ddcNumeracion) {
        this.ddcNumeracion = ddcNumeracion;
    }

    public String getDdcMscLote() {
        return this.ddcMscLote;
    }

    public void setDdcMscLote(String ddcMscLote) {
        this.ddcMscLote = ddcMscLote;
    }

    public String getDdcCodTchb() {
        return this.ddcCodTchb;
    }

    public void setDdcCodTchb(String ddcCodTchb) {
        this.ddcCodTchb = ddcCodTchb;
    }

    public String getDdcMscCjhb() {
        return this.ddcMscCjhb;
    }

    public void setDdcMscCjhb(String ddcMscCjhb) {
        this.ddcMscCjhb = ddcMscCjhb;
    }

    public String getDdcCodSezn() {
        return this.ddcCodSezn;
    }

    public void setDdcCodSezn(String ddcCodSezn) {
        this.ddcCodSezn = ddcCodSezn;
    }

    public String getDdcMscSezn() {
        return this.ddcMscSezn;
    }

    public void setDdcMscSezn(String ddcMscSezn) {
        this.ddcMscSezn = ddcMscSezn;
    }

    public String getDdcGlsComDire() {
        return this.ddcGlsComDire;
    }

    public void setDdcGlsComDire(String ddcGlsComDire) {
        this.ddcGlsComDire = ddcGlsComDire;
    }

    public String getDdcMscDpir() {
        return this.ddcMscDpir;
    }

    public void setDdcMscDpir(String ddcMscDpir) {
        this.ddcMscDpir = ddcMscDpir;
    }

    public String getDdcNumDpir() {
        return this.ddcNumDpir;
    }

    public void setDdcNumDpir(String ddcNumDpir) {
        this.ddcNumDpir = ddcNumDpir;
    }

    public String getDdcMscMnza() {
        return this.ddcMscMnza;
    }

    public void setDdcMscMnza(String ddcMscMnza) {
        this.ddcMscMnza = ddcMscMnza;
    }

    public String getDdcCodLuga() {
        return this.ddcCodLuga;
    }

    public void setDdcCodLuga(String ddcCodLuga) {
        this.ddcCodLuga = ddcCodLuga;
    }

    public String getDdcMscSdir() {
        return this.ddcMscSdir;
    }

    public void setDdcMscSdir(String ddcMscSdir) {
        this.ddcMscSdir = ddcMscSdir;
    }

    public String getDdcGlsRefe() {
        return this.ddcGlsRefe;
    }

    public void setDdcGlsRefe(String ddcGlsRefe) {
        this.ddcGlsRefe = ddcGlsRefe;
    }

    public int getDdcPrioridad() {
        return this.ddcPrioridad;
    }

    public void setDdcPrioridad(int ddcPrioridad) {
        this.ddcPrioridad = ddcPrioridad;
    }



    @Override
    public int hashCode() {
        return Objects.hash(ddcCic, ddcNumDire, ddcMscTdir, ddcCodTvia, ddcMscBvia, ddcNumeracion, ddcMscLote, ddcCodTchb, ddcMscCjhb, ddcCodSezn, ddcMscSezn, ddcGlsComDire, ddcMscDpir, ddcNumDpir, ddcMscMnza, ddcCodLuga, ddcMscSdir, ddcGlsRefe, ddcPrioridad);
    }

    @Override
    public String toString() {
        return "{" +
                " direKeyIreg='" + getDdcCic() + "'" +
                ", ddcNumDire='" + getDdcNumDire() + "'" +
                ", ddcMscTdir='" + getDdcMscTdir() + "'" +
                ", ddcCodTvia='" + getDdcCodTvia() + "'" +
                ", ddcMscBvia='" + getDdcMscBvia() + "'" +
                ", ddcNumeracion='" + getDdcNumeracion() + "'" +
                ", ddcMscLote='" + getDdcMscLote() + "'" +
                ", ddcCodTchb='" + getDdcCodTchb() + "'" +
                ", ddcMscCjhb='" + getDdcMscCjhb() + "'" +
                ", ddcCodSezn='" + getDdcCodSezn() + "'" +
                ", ddcMscSezn='" + getDdcMscSezn() + "'" +
                ", ddcGlsComDire='" + getDdcGlsComDire() + "'" +
                ", ddcMscDpir='" + getDdcMscDpir() + "'" +
                ", ddcNumDpir='" + getDdcNumDpir() + "'" +
                ", ddcMscMnza='" + getDdcMscMnza() + "'" +
                ", ddcCodLuga='" + getDdcCodLuga() + "'" +
                ", ddcMscSdir='" + getDdcMscSdir() + "'" +
                ", ddcGlsRefe='" + getDdcGlsRefe() + "'" +
                ", ddcPrioridad='" + getDdcPrioridad() + "'" +
                "}";
    }


}
