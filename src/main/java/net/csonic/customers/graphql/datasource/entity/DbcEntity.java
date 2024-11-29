package net.csonic.customers.graphql.datasource.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "DBC")
public class DbcEntity {
    @Id
    @Column(name = "DBC_KEY_IDBC")
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
    @Column(name = "DBC_IND_TICL")
    private String dbcIndTicl;
    // @Column(name = "DBC_COD_VDNI")
    // private String dbcCodVdni;
    @Column(name = "DBC_GLS_NOMC")
    private String dbcGlsNomc;
    // @Column(name = "DBC_GLS_NOM_PRIMER")
    // private String dbcGlsNomPrimer;
    // @Column(name = "DBC_GLS_NOM_SEGUNDO")
    // private String dbcGlsNomSegundo;
    @Column(name = "DBC_GLS_NOMBRE")
    private String dbcGlsNombre;
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
    @JoinColumn(name = "DBC_KEY_IDBC", referencedColumnName = "DCE_KEY_IDCE", insertable = false, updatable = false)
    private DceEntity dceEntity;

    @OneToOne
    @JoinColumn(name = "DBC_KEY_IDBC", referencedColumnName = "DCP_KEY_IDCP", insertable = false, updatable = false)
    private DcpEntity dcpEntity;

    public String getDbcKeyIreg() {
        return dbcKeyIreg;
    }

    public void setDbcKeyIreg(String dbcKeyIreg) {
        this.dbcKeyIreg = dbcKeyIreg;
    }

    public String getDbcIdcIcli() {
        return dbcIdcIcli;
    }

    public void setDbcIdcIcli(String dbcIdcIcli) {
        this.dbcIdcIcli = dbcIdcIcli;
    }

    public String getDbcCodActi() {
        return dbcCodActi;
    }

    public void setDbcCodActi(String dbcCodActi) {
        this.dbcCodActi = dbcCodActi;
    }

    public String getDbcCodEjec() {
        return dbcCodEjec;
    }

    public void setDbcCodEjec(String dbcCodEjec) {
        this.dbcCodEjec = dbcCodEjec;
    }

    public String getDbcCodOfic() {
        return dbcCodOfic;
    }

    public void setDbcCodOfic(String dbcCodOfic) {
        this.dbcCodOfic = dbcCodOfic;
    }

    public String getDbcCodTicl() {
        return dbcCodTicl;
    }

    public void setDbcCodTicl(String dbcCodTicl) {
        this.dbcCodTicl = dbcCodTicl;
    }

    public String getDbcIndTicl() {
        return dbcIndTicl;
    }

    public void setDbcIndTicl(String dbcIndTicl) {
        this.dbcIndTicl = dbcIndTicl;
    }

    public String getDbcGlsNomc() {
        return dbcGlsNomc;
    }

    public void setDbcGlsNomc(String dbcGlsNomc) {
        this.dbcGlsNomc = dbcGlsNomc;
    }

    public String getDbcGlsNombre() {
        return dbcGlsNombre;
    }

    public void setDbcGlsNombre(String dbcGlsNombre) {
        this.dbcGlsNombre = dbcGlsNombre;
    }

    public String getDbcGlsApat() {
        return dbcGlsApat;
    }

    public void setDbcGlsApat(String dbcGlsApat) {
        this.dbcGlsApat = dbcGlsApat;
    }

    public String getDbcGlsAmat() {
        return dbcGlsAmat;
    }

    public void setDbcGlsAmat(String dbcGlsAmat) {
        this.dbcGlsAmat = dbcGlsAmat;
    }

    public String getDbcIndResi() {
        return dbcIndResi;
    }

    public void setDbcIndResi(String dbcIndResi) {
        this.dbcIndResi = dbcIndResi;
    }

    public String getDbcCodTbca() {
        return dbcCodTbca;
    }

    public void setDbcCodTbca(String dbcCodTbca) {
        this.dbcCodTbca = dbcCodTbca;
    }

    public String getDbcNumSsbs() {
        return dbcNumSsbs;
    }

    public void setDbcNumSsbs(String dbcNumSsbs) {
        this.dbcNumSsbs = dbcNumSsbs;
    }

    public String getDbcIndMubc() {
        return dbcIndMubc;
    }

    public void setDbcIndMubc(String dbcIndMubc) {
        this.dbcIndMubc = dbcIndMubc;
    }

    public String getDbcCodOdse() {
        return dbcCodOdse;
    }

    public void setDbcCodOdse(String dbcCodOdse) {
        this.dbcCodOdse = dbcCodOdse;
    }

    public String getDbcIndMemp() {
        return dbcIndMemp;
    }

    public void setDbcIndMemp(String dbcIndMemp) {
        this.dbcIndMemp = dbcIndMemp;
    }

    public String getDbcNumRmer() {
        return dbcNumRmer;
    }

    public void setDbcNumRmer(String dbcNumRmer) {
        this.dbcNumRmer = dbcNumRmer;
    }

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



}
