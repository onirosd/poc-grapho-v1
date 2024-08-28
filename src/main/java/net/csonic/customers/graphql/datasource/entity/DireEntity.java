package net.csonic.customers.graphql.datasource.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DIRE")
public class DireEntity {
    @Id
    @Column(name = "DIRE_KEY_IREG")
    private String direKeyIreg;

    @Column(name = "DIRE_NUM_DIRE")
    private String direNumDire;

    @Column(name = "DIRE_MSC_TDIR")
    private String direMscTdir;

    @Column(name = "DIRE_COD_TVIA")
    private String direCodTvia;

    @Column(name = "DIRE_MSC_BVIA")
    private String direMscBvia;

    @Column(name = "DIRE_NUMERACION")
    private String direNumeracion;

    @Column(name = "DIRE_MSC_LOTE")
    private String direMscLote;

    @Column(name = "DIRE_COD_TCHB")
    private String direCodTchb;

    @Column(name = "DIRE_MSC_CJHB")
    private String direMscCjhb;

    @Column(name = "DIRE_COD_SEZN")
    private String direCodSezn;

    @Column(name = "DIRE_MSC_SEZN")
    private String direMscSezn;

    @Column(name = "DIRE_GLS_DIRE")
    private String direGlsDire;

    @Column(name = "DIRE_MSC_DPIR")
    private String direMscDpir;

    @Column(name = "DIRE_NUM_DPIR")
    private String direNumDpir;

    @Column(name = "DIRE_MSC_MNZA")
    private String direMscMnza;

    @Column(name = "DIRE_COD_LUGA")
    private String direCodLuga;

    @Column(name = "DIRE_MSC_SDIR")
    private String direMscSdir;

    @Column(name = "DIRE_GLS_REFE")
    private String direGlsRefe;

    @Column(name = "PRIORIDAD_DIRE")
    private int prioridadDire;

    public DireEntity() {
    }

    public DireEntity(String direKeyIreg, String direNumDire, String direMscTdir, String direCodTvia, String direMscBvia, String direNumeracion, String direMscLote, String direCodTchb, String direMscCjhb, String direCodSezn, String direMscSezn, String direGlsDire, String direMscDpir, String direNumDpir, String direMscMnza, String direCodLuga, String direMscSdir, String direGlsRefe, int prioridadDire) {
        this.direKeyIreg = direKeyIreg;
        this.direNumDire = direNumDire;
        this.direMscTdir = direMscTdir;
        this.direCodTvia = direCodTvia;
        this.direMscBvia = direMscBvia;
        this.direNumeracion = direNumeracion;
        this.direMscLote = direMscLote;
        this.direCodTchb = direCodTchb;
        this.direMscCjhb = direMscCjhb;
        this.direCodSezn = direCodSezn;
        this.direMscSezn = direMscSezn;
        this.direGlsDire = direGlsDire;
        this.direMscDpir = direMscDpir;
        this.direNumDpir = direNumDpir;
        this.direMscMnza = direMscMnza;
        this.direCodLuga = direCodLuga;
        this.direMscSdir = direMscSdir;
        this.direGlsRefe = direGlsRefe;
        this.prioridadDire = prioridadDire;
    }

    public String getDireKeyIreg() {
        return this.direKeyIreg;
    }

    public void setDireKeyIreg(String direKeyIreg) {
        this.direKeyIreg = direKeyIreg;
    }

    public String getDireNumDire() {
        return this.direNumDire;
    }

    public void setDireNumDire(String direNumDire) {
        this.direNumDire = direNumDire;
    }

    public String getDireMscTdir() {
        return this.direMscTdir;
    }

    public void setDireMscTdir(String direMscTdir) {
        this.direMscTdir = direMscTdir;
    }

    public String getDireCodTvia() {
        return this.direCodTvia;
    }

    public void setDireCodTvia(String direCodTvia) {
        this.direCodTvia = direCodTvia;
    }

    public String getDireMscBvia() {
        return this.direMscBvia;
    }

    public void setDireMscBvia(String direMscBvia) {
        this.direMscBvia = direMscBvia;
    }

    public String getDireNumeracion() {
        return this.direNumeracion;
    }

    public void setDireNumeracion(String direNumeracion) {
        this.direNumeracion = direNumeracion;
    }

    public String getDireMscLote() {
        return this.direMscLote;
    }

    public void setDireMscLote(String direMscLote) {
        this.direMscLote = direMscLote;
    }

    public String getDireCodTchb() {
        return this.direCodTchb;
    }

    public void setDireCodTchb(String direCodTchb) {
        this.direCodTchb = direCodTchb;
    }

    public String getDireMscCjhb() {
        return this.direMscCjhb;
    }

    public void setDireMscCjhb(String direMscCjhb) {
        this.direMscCjhb = direMscCjhb;
    }

    public String getDireCodSezn() {
        return this.direCodSezn;
    }

    public void setDireCodSezn(String direCodSezn) {
        this.direCodSezn = direCodSezn;
    }

    public String getDireMscSezn() {
        return this.direMscSezn;
    }

    public void setDireMscSezn(String direMscSezn) {
        this.direMscSezn = direMscSezn;
    }

    public String getDireGlsDire() {
        return this.direGlsDire;
    }

    public void setDireGlsDire(String direGlsDire) {
        this.direGlsDire = direGlsDire;
    }

    public String getDireMscDpir() {
        return this.direMscDpir;
    }

    public void setDireMscDpir(String direMscDpir) {
        this.direMscDpir = direMscDpir;
    }

    public String getDireNumDpir() {
        return this.direNumDpir;
    }

    public void setDireNumDpir(String direNumDpir) {
        this.direNumDpir = direNumDpir;
    }

    public String getDireMscMnza() {
        return this.direMscMnza;
    }

    public void setDireMscMnza(String direMscMnza) {
        this.direMscMnza = direMscMnza;
    }

    public String getDireCodLuga() {
        return this.direCodLuga;
    }

    public void setDireCodLuga(String direCodLuga) {
        this.direCodLuga = direCodLuga;
    }

    public String getDireMscSdir() {
        return this.direMscSdir;
    }

    public void setDireMscSdir(String direMscSdir) {
        this.direMscSdir = direMscSdir;
    }

    public String getDireGlsRefe() {
        return this.direGlsRefe;
    }

    public void setDireGlsRefe(String direGlsRefe) {
        this.direGlsRefe = direGlsRefe;
    }

    public int getPrioridadDire() {
        return this.prioridadDire;
    }

    public void setPrioridadDire(int prioridadDire) {
        this.prioridadDire = prioridadDire;
    }

    public DireEntity direKeyIreg(String direKeyIreg) {
        setDireKeyIreg(direKeyIreg);
        return this;
    }

    public DireEntity direNumDire(String direNumDire) {
        setDireNumDire(direNumDire);
        return this;
    }

    public DireEntity direMscTdir(String direMscTdir) {
        setDireMscTdir(direMscTdir);
        return this;
    }

    public DireEntity direCodTvia(String direCodTvia) {
        setDireCodTvia(direCodTvia);
        return this;
    }

    public DireEntity direMscBvia(String direMscBvia) {
        setDireMscBvia(direMscBvia);
        return this;
    }

    public DireEntity direNumeracion(String direNumeracion) {
        setDireNumeracion(direNumeracion);
        return this;
    }

    public DireEntity direMscLote(String direMscLote) {
        setDireMscLote(direMscLote);
        return this;
    }

    public DireEntity direCodTchb(String direCodTchb) {
        setDireCodTchb(direCodTchb);
        return this;
    }

    public DireEntity direMscCjhb(String direMscCjhb) {
        setDireMscCjhb(direMscCjhb);
        return this;
    }

    public DireEntity direCodSezn(String direCodSezn) {
        setDireCodSezn(direCodSezn);
        return this;
    }

    public DireEntity direMscSezn(String direMscSezn) {
        setDireMscSezn(direMscSezn);
        return this;
    }

    public DireEntity direGlsDire(String direGlsDire) {
        setDireGlsDire(direGlsDire);
        return this;
    }

    public DireEntity direMscDpir(String direMscDpir) {
        setDireMscDpir(direMscDpir);
        return this;
    }

    public DireEntity direNumDpir(String direNumDpir) {
        setDireNumDpir(direNumDpir);
        return this;
    }

    public DireEntity direMscMnza(String direMscMnza) {
        setDireMscMnza(direMscMnza);
        return this;
    }

    public DireEntity direCodLuga(String direCodLuga) {
        setDireCodLuga(direCodLuga);
        return this;
    }

    public DireEntity direMscSdir(String direMscSdir) {
        setDireMscSdir(direMscSdir);
        return this;
    }

    public DireEntity direGlsRefe(String direGlsRefe) {
        setDireGlsRefe(direGlsRefe);
        return this;
    }

    public DireEntity prioridadDire(int prioridadDire) {
        setPrioridadDire(prioridadDire);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DireEntity)) {
            return false;
        }
        DireEntity direEntity = (DireEntity) o;
        return Objects.equals(direKeyIreg, direEntity.direKeyIreg) && Objects.equals(direNumDire, direEntity.direNumDire) && Objects.equals(direMscTdir, direEntity.direMscTdir) && Objects.equals(direCodTvia, direEntity.direCodTvia) && Objects.equals(direMscBvia, direEntity.direMscBvia) && Objects.equals(direNumeracion, direEntity.direNumeracion) && Objects.equals(direMscLote, direEntity.direMscLote) && Objects.equals(direCodTchb, direEntity.direCodTchb) && Objects.equals(direMscCjhb, direEntity.direMscCjhb) && Objects.equals(direCodSezn, direEntity.direCodSezn) && Objects.equals(direMscSezn, direEntity.direMscSezn) && Objects.equals(direGlsDire, direEntity.direGlsDire) && Objects.equals(direMscDpir, direEntity.direMscDpir) && Objects.equals(direNumDpir, direEntity.direNumDpir) && Objects.equals(direMscMnza, direEntity.direMscMnza) && Objects.equals(direCodLuga, direEntity.direCodLuga) && Objects.equals(direMscSdir, direEntity.direMscSdir) && Objects.equals(direGlsRefe, direEntity.direGlsRefe) && prioridadDire == direEntity.prioridadDire;
    }

    @Override
    public int hashCode() {
        return Objects.hash(direKeyIreg, direNumDire, direMscTdir, direCodTvia, direMscBvia, direNumeracion, direMscLote, direCodTchb, direMscCjhb, direCodSezn, direMscSezn, direGlsDire, direMscDpir, direNumDpir, direMscMnza, direCodLuga, direMscSdir, direGlsRefe, prioridadDire);
    }

    @Override
    public String toString() {
        return "{" +
            " direKeyIreg='" + getDireKeyIreg() + "'" +
            ", direNumDire='" + getDireNumDire() + "'" +
            ", direMscTdir='" + getDireMscTdir() + "'" +
            ", direCodTvia='" + getDireCodTvia() + "'" +
            ", direMscBvia='" + getDireMscBvia() + "'" +
            ", direNumeracion='" + getDireNumeracion() + "'" +
            ", direMscLote='" + getDireMscLote() + "'" +
            ", direCodTchb='" + getDireCodTchb() + "'" +
            ", direMscCjhb='" + getDireMscCjhb() + "'" +
            ", direCodSezn='" + getDireCodSezn() + "'" +
            ", direMscSezn='" + getDireMscSezn() + "'" +
            ", direGlsDire='" + getDireGlsDire() + "'" +
            ", direMscDpir='" + getDireMscDpir() + "'" +
            ", direNumDpir='" + getDireNumDpir() + "'" +
            ", direMscMnza='" + getDireMscMnza() + "'" +
            ", direCodLuga='" + getDireCodLuga() + "'" +
            ", direMscSdir='" + getDireMscSdir() + "'" +
            ", direGlsRefe='" + getDireGlsRefe() + "'" +
            ", prioridadDire='" + getPrioridadDire() + "'" +
            "}";
    }

    
}
