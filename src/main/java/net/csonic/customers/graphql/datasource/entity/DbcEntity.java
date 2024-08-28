package net.csonic.customers.graphql.datasource.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "DBC")
public class DbcEntity {
    @Id
    @Column(name = "DBC_KEY_IREG")
    private String dbcKeyIreg;
    @Column(name = "DBC_IDC_ICLI")
    private String dbcIdcIcli;
    @Column(name = "DBC_COD_ACTI")
    private String dbcCodActi;
    @Column(name = "DBC_COD_EJEC")
    private String dbcCodEjec;
    @Column(name = "DBC_COD_OFIC")
    private String dbcCodOfic;
    @Column(name = "DBC_COD_TICL")
    private String dbcCodTicl;
    @Column(name = "DBC_NUM_DAMP")
    private String dbcNumDamp;
    @Column(name = "DBC_COD_VDNI")
    private String dbcCodVdni;
    @Column(name = "DBC_GLS_NOMC")
    private String dbcGlsNomc;
    @Column(name = "DBC_GLS_NOM_PRIMER")
    private String dbcGlsNomPrimer;
    @Column(name = "DBC_GLS_NOM_SEGUNDO")
    private String dbcGlsNomSegundo;
    @Column(name = "DBC_GLS_APAT")
    private String dbcGlsApat;
    @Column(name = "DBC_GLS_AMAT")
    private String dbcGlsAmat;

    @Column(name = "DBC_IND_RESI")
    private String dbcIndResi;

    @Column(name = "DBC_COD_TBCA")
    private String dbcCodTbca;

    @Column(name = "DBC_NUM_SSBS")
    private String dbcNumSsbs;

    @Column(name = "DBC_IND_MUBC")
    private String dbcIndMubc;

    @Column(name = "DBC_COD_ODSE")
    private String dbcCodOdse;

    @Column(name = " DBC_IND_MEMP")
    private String dbcIndMemp;
    
    @Column(name = "DBC_NUM_RMER")
    private String dbcNumRmer;


    @OneToOne
    @JoinColumn(name = "DBC_KEY_IREG", referencedColumnName = "DCE_KEY_IDCE", insertable = false, updatable = false)
    private DceEntity dceEntity;

    @OneToOne
    @JoinColumn(name = "DBC_KEY_IREG", referencedColumnName = "DCP_KEY_IDCP", insertable = false, updatable = false)
    private DcpEntity dcpEntity;


    
    public DceEntity getDceEntity() {
        return dceEntity;
    }

    public void setDceEntity(DceEntity dceEntity) {
        this.dceEntity = dceEntity;
    }

    public DcpEntity getDcpEntity() {
        return dcpEntity;
    }

    public void setDcpEntity(DcpEntity dcpEntity) {
        this.dcpEntity = dcpEntity;
    }



    public DbcEntity() {
    }

    public DbcEntity(String dbcKeyIreg, String dbcIdcIcli, String dbcCodActi, String dbcCodEjec, String dbcCodOfic, String dbcCodTicl, String dbcNumDamp, String dbcCodVdni, String dbcGlsNomc, String dbcGlsNomPrimer, String dbcGlsNomSegundo, String dbcGlsApat, String dbcGlsAmat, String dbcIndResi, String dbcCodTbca, String dbcNumSsbs, String dbcIndMubc, String dbcCodOdse, String dbcIndMemp, String dbcNumRmer) {
        this.dbcKeyIreg = dbcKeyIreg;
        this.dbcIdcIcli = dbcIdcIcli;
        this.dbcCodActi = dbcCodActi;
        this.dbcCodEjec = dbcCodEjec;
        this.dbcCodOfic = dbcCodOfic;
        this.dbcCodTicl = dbcCodTicl;
        this.dbcNumDamp = dbcNumDamp;
        this.dbcCodVdni = dbcCodVdni;
        this.dbcGlsNomc = dbcGlsNomc;
        this.dbcGlsNomPrimer = dbcGlsNomPrimer;
        this.dbcGlsNomSegundo = dbcGlsNomSegundo;
        this.dbcGlsApat = dbcGlsApat;
        this.dbcGlsAmat = dbcGlsAmat;
        this.dbcIndResi = dbcIndResi;
        this.dbcCodTbca = dbcCodTbca;
        this.dbcNumSsbs = dbcNumSsbs;
        this.dbcIndMubc = dbcIndMubc;
        this.dbcCodOdse = dbcCodOdse;
        this.dbcIndMemp = dbcIndMemp;
        this.dbcNumRmer = dbcNumRmer;
    }

    public String getDbcKeyIreg() {
        return this.dbcKeyIreg;
    }

    public void setDbcKeyIreg(String dbcKeyIreg) {
        this.dbcKeyIreg = dbcKeyIreg;
    }

    public String getDbcIdcIcli() {
        return this.dbcIdcIcli;
    }

    public void setDbcIdcIcli(String dbcIdcIcli) {
        this.dbcIdcIcli = dbcIdcIcli;
    }

    public String getDbcCodActi() {
        return this.dbcCodActi;
    }

    public void setDbcCodActi(String dbcCodActi) {
        this.dbcCodActi = dbcCodActi;
    }

    public String getDbcCodEjec() {
        return this.dbcCodEjec;
    }

    public void setDbcCodEjec(String dbcCodEjec) {
        this.dbcCodEjec = dbcCodEjec;
    }

    public String getDbcCodOfic() {
        return this.dbcCodOfic;
    }

    public void setDbcCodOfic(String dbcCodOfic) {
        this.dbcCodOfic = dbcCodOfic;
    }

    public String getDbcCodTicl() {
        return this.dbcCodTicl;
    }

    public void setDbcCodTicl(String dbcCodTicl) {
        this.dbcCodTicl = dbcCodTicl;
    }

    public String getDbcNumDamp() {
        return this.dbcNumDamp;
    }

    public void setDbcNumDamp(String dbcNumDamp) {
        this.dbcNumDamp = dbcNumDamp;
    }

    public String getDbcCodVdni() {
        return this.dbcCodVdni;
    }

    public void setDbcCodVdni(String dbcCodVdni) {
        this.dbcCodVdni = dbcCodVdni;
    }

    public String getDbcGlsNomc() {
        return this.dbcGlsNomc;
    }

    public void setDbcGlsNomc(String dbcGlsNomc) {
        this.dbcGlsNomc = dbcGlsNomc;
    }

    public String getDbcGlsNomPrimer() {
        return this.dbcGlsNomPrimer;
    }

    public void setDbcGlsNomPrimer(String dbcGlsNomPrimer) {
        this.dbcGlsNomPrimer = dbcGlsNomPrimer;
    }

    public String getDbcGlsNomSegundo() {
        return this.dbcGlsNomSegundo;
    }

    public void setDbcGlsNomSegundo(String dbcGlsNomSegundo) {
        this.dbcGlsNomSegundo = dbcGlsNomSegundo;
    }

    public String getDbcGlsApat() {
        return this.dbcGlsApat;
    }

    public void setDbcGlsApat(String dbcGlsApat) {
        this.dbcGlsApat = dbcGlsApat;
    }

    public String getDbcGlsAmat() {
        return this.dbcGlsAmat;
    }

    public void setDbcGlsAmat(String dbcGlsAmat) {
        this.dbcGlsAmat = dbcGlsAmat;
    }

    public String getDbcIndResi() {
        return this.dbcIndResi;
    }

    public void setDbcIndResi(String dbcIndResi) {
        this.dbcIndResi = dbcIndResi;
    }

    public String getDbcCodTbca() {
        return this.dbcCodTbca;
    }

    public void setDbcCodTbca(String dbcCodTbca) {
        this.dbcCodTbca = dbcCodTbca;
    }

    public String getDbcNumSsbs() {
        return this.dbcNumSsbs;
    }

    public void setDbcNumSsbs(String dbcNumSsbs) {
        this.dbcNumSsbs = dbcNumSsbs;
    }

    public String getDbcIndMubc() {
        return this.dbcIndMubc;
    }

    public void setDbcIndMubc(String dbcIndMubc) {
        this.dbcIndMubc = dbcIndMubc;
    }

    public String getDbcCodOdse() {
        return this.dbcCodOdse;
    }

    public void setDbcCodOdse(String dbcCodOdse) {
        this.dbcCodOdse = dbcCodOdse;
    }

    public String getDbcIndMemp() {
        return this.dbcIndMemp;
    }

    public void setDbcIndMemp(String dbcIndMemp) {
        this.dbcIndMemp = dbcIndMemp;
    }

    public String getDbcNumRmer() {
        return this.dbcNumRmer;
    }

    public void setDbcNumRmer(String dbcNumRmer) {
        this.dbcNumRmer = dbcNumRmer;
    }

    public DbcEntity dbcKeyIreg(String dbcKeyIreg) {
        setDbcKeyIreg(dbcKeyIreg);
        return this;
    }

    public DbcEntity dbcIdcIcli(String dbcIdcIcli) {
        setDbcIdcIcli(dbcIdcIcli);
        return this;
    }

    public DbcEntity dbcCodActi(String dbcCodActi) {
        setDbcCodActi(dbcCodActi);
        return this;
    }

    public DbcEntity dbcCodEjec(String dbcCodEjec) {
        setDbcCodEjec(dbcCodEjec);
        return this;
    }

    public DbcEntity dbcCodOfic(String dbcCodOfic) {
        setDbcCodOfic(dbcCodOfic);
        return this;
    }

    public DbcEntity dbcCodTicl(String dbcCodTicl) {
        setDbcCodTicl(dbcCodTicl);
        return this;
    }

    public DbcEntity dbcNumDamp(String dbcNumDamp) {
        setDbcNumDamp(dbcNumDamp);
        return this;
    }

    public DbcEntity dbcCodVdni(String dbcCodVdni) {
        setDbcCodVdni(dbcCodVdni);
        return this;
    }

    public DbcEntity dbcGlsNomc(String dbcGlsNomc) {
        setDbcGlsNomc(dbcGlsNomc);
        return this;
    }

    public DbcEntity dbcGlsNomPrimer(String dbcGlsNomPrimer) {
        setDbcGlsNomPrimer(dbcGlsNomPrimer);
        return this;
    }

    public DbcEntity dbcGlsNomSegundo(String dbcGlsNomSegundo) {
        setDbcGlsNomSegundo(dbcGlsNomSegundo);
        return this;
    }

    public DbcEntity dbcGlsApat(String dbcGlsApat) {
        setDbcGlsApat(dbcGlsApat);
        return this;
    }

    public DbcEntity dbcGlsAmat(String dbcGlsAmat) {
        setDbcGlsAmat(dbcGlsAmat);
        return this;
    }

    public DbcEntity dbcIndResi(String dbcIndResi) {
        setDbcIndResi(dbcIndResi);
        return this;
    }

    public DbcEntity dbcCodTbca(String dbcCodTbca) {
        setDbcCodTbca(dbcCodTbca);
        return this;
    }

    public DbcEntity dbcNumSsbs(String dbcNumSsbs) {
        setDbcNumSsbs(dbcNumSsbs);
        return this;
    }

    public DbcEntity dbcIndMubc(String dbcIndMubc) {
        setDbcIndMubc(dbcIndMubc);
        return this;
    }

    public DbcEntity dbcCodOdse(String dbcCodOdse) {
        setDbcCodOdse(dbcCodOdse);
        return this;
    }

    public DbcEntity dbcIndMemp(String dbcIndMemp) {
        setDbcIndMemp(dbcIndMemp);
        return this;
    }

    public DbcEntity dbcNumRmer(String dbcNumRmer) {
        setDbcNumRmer(dbcNumRmer);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DbcEntity)) {
            return false;
        }
        DbcEntity dbcEntity = (DbcEntity) o;
        return Objects.equals(dbcKeyIreg, dbcEntity.dbcKeyIreg) && Objects.equals(dbcIdcIcli, dbcEntity.dbcIdcIcli) && Objects.equals(dbcCodActi, dbcEntity.dbcCodActi) && Objects.equals(dbcCodEjec, dbcEntity.dbcCodEjec) && Objects.equals(dbcCodOfic, dbcEntity.dbcCodOfic) && Objects.equals(dbcCodTicl, dbcEntity.dbcCodTicl) && Objects.equals(dbcNumDamp, dbcEntity.dbcNumDamp) && Objects.equals(dbcCodVdni, dbcEntity.dbcCodVdni) && Objects.equals(dbcGlsNomc, dbcEntity.dbcGlsNomc) && Objects.equals(dbcGlsNomPrimer, dbcEntity.dbcGlsNomPrimer) && Objects.equals(dbcGlsNomSegundo, dbcEntity.dbcGlsNomSegundo) && Objects.equals(dbcGlsApat, dbcEntity.dbcGlsApat) && Objects.equals(dbcGlsAmat, dbcEntity.dbcGlsAmat) && Objects.equals(dbcIndResi, dbcEntity.dbcIndResi) && Objects.equals(dbcCodTbca, dbcEntity.dbcCodTbca) && Objects.equals(dbcNumSsbs, dbcEntity.dbcNumSsbs) && Objects.equals(dbcIndMubc, dbcEntity.dbcIndMubc) && Objects.equals(dbcCodOdse, dbcEntity.dbcCodOdse) && Objects.equals(dbcIndMemp, dbcEntity.dbcIndMemp) && Objects.equals(dbcNumRmer, dbcEntity.dbcNumRmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbcKeyIreg, dbcIdcIcli, dbcCodActi, dbcCodEjec, dbcCodOfic, dbcCodTicl, dbcNumDamp, dbcCodVdni, dbcGlsNomc, dbcGlsNomPrimer, dbcGlsNomSegundo, dbcGlsApat, dbcGlsAmat, dbcIndResi, dbcCodTbca, dbcNumSsbs, dbcIndMubc, dbcCodOdse, dbcIndMemp, dbcNumRmer);
    }

    @Override
    public String toString() {
        return "{" +
            " dbcKeyIreg='" + getDbcKeyIreg() + "'" +
            ", dbcIdcIcli='" + getDbcIdcIcli() + "'" +
            ", dbcCodActi='" + getDbcCodActi() + "'" +
            ", dbcCodEjec='" + getDbcCodEjec() + "'" +
            ", dbcCodOfic='" + getDbcCodOfic() + "'" +
            ", dbcCodTicl='" + getDbcCodTicl() + "'" +
            ", dbcNumDamp='" + getDbcNumDamp() + "'" +
            ", dbcCodVdni='" + getDbcCodVdni() + "'" +
            ", dbcGlsNomc='" + getDbcGlsNomc() + "'" +
            ", dbcGlsNomPrimer='" + getDbcGlsNomPrimer() + "'" +
            ", dbcGlsNomSegundo='" + getDbcGlsNomSegundo() + "'" +
            ", dbcGlsApat='" + getDbcGlsApat() + "'" +
            ", dbcGlsAmat='" + getDbcGlsAmat() + "'" +
            ", dbcIndResi='" + getDbcIndResi() + "'" +
            ", dbcCodTbca='" + getDbcCodTbca() + "'" +
            ", dbcNumSsbs='" + getDbcNumSsbs() + "'" +
            ", dbcIndMubc='" + getDbcIndMubc() + "'" +
            ", dbcCodOdse='" + getDbcCodOdse() + "'" +
            ", dbcIndMemp='" + getDbcIndMemp() + "'" +
            ", dbcNumRmer='" + getDbcNumRmer() + "'" +
            "}";
    }


    

}
