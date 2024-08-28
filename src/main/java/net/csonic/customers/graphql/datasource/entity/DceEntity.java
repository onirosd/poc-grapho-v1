package net.csonic.customers.graphql.datasource.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DCE")
public class DceEntity {
    @Id
    @Column(name = "DCE_KEY_IDCE")
    private String dceKeyIdce;

    @Column(name = "DCE_IND_CATE")
    private String dceIndCate;

    @Column(name = "DCE_COD_TSOC")
    private String dceCodTsoc;

    @Column(name = "DCE_IND_TEMP")
    private String dceIndTemp;

    @Column(name = "DCE_GLS_NFAN")
    private String dceGlsNfan;

    @Column(name = "DCE_FEC_FCTT")
    private String dceFecFctt;

    @Column(name = "DCE_IND_CMOS")
    private String dceIndCmos;
    
    @Column(name = "DCE_REL_BANC")
    private String dceRelBanc;


    public DceEntity() {
    }

    public DceEntity(String dceKeyIdce, String dceIndCate, String dceCodTsoc, String dceIndTemp, String dceGlsNfan, String dceFecFctt, String dceIndCmos, String dceRelBanc) {
        this.dceKeyIdce = dceKeyIdce;
        this.dceIndCate = dceIndCate;
        this.dceCodTsoc = dceCodTsoc;
        this.dceIndTemp = dceIndTemp;
        this.dceGlsNfan = dceGlsNfan;
        this.dceFecFctt = dceFecFctt;
        this.dceIndCmos = dceIndCmos;
        this.dceRelBanc = dceRelBanc;
    }

    public String getDceKeyIdce() {
        return this.dceKeyIdce;
    }

    public void setDceKeyIdce(String dceKeyIdce) {
        this.dceKeyIdce = dceKeyIdce;
    }

    public String getDceIndCate() {
        return this.dceIndCate;
    }

    public void setDceIndCate(String dceIndCate) {
        this.dceIndCate = dceIndCate;
    }

    public String getDceCodTsoc() {
        return this.dceCodTsoc;
    }

    public void setDceCodTsoc(String dceCodTsoc) {
        this.dceCodTsoc = dceCodTsoc;
    }

    public String getDceIndTemp() {
        return this.dceIndTemp;
    }

    public void setDceIndTemp(String dceIndTemp) {
        this.dceIndTemp = dceIndTemp;
    }

    public String getDceGlsNfan() {
        return this.dceGlsNfan;
    }

    public void setDceGlsNfan(String dceGlsNfan) {
        this.dceGlsNfan = dceGlsNfan;
    }

    public String getDceFecFctt() {
        return this.dceFecFctt;
    }

    public void setDceFecFctt(String dceFecFctt) {
        this.dceFecFctt = dceFecFctt;
    }

    public String getDceIndCmos() {
        return this.dceIndCmos;
    }

    public void setDceIndCmos(String dceIndCmos) {
        this.dceIndCmos = dceIndCmos;
    }

    public String getDceRelBanc() {
        return this.dceRelBanc;
    }

    public void setDceRelBanc(String dceRelBanc) {
        this.dceRelBanc = dceRelBanc;
    }

    public DceEntity dceKeyIdce(String dceKeyIdce) {
        setDceKeyIdce(dceKeyIdce);
        return this;
    }

    public DceEntity dceIndCate(String dceIndCate) {
        setDceIndCate(dceIndCate);
        return this;
    }

    public DceEntity dceCodTsoc(String dceCodTsoc) {
        setDceCodTsoc(dceCodTsoc);
        return this;
    }

    public DceEntity dceIndTemp(String dceIndTemp) {
        setDceIndTemp(dceIndTemp);
        return this;
    }

    public DceEntity dceGlsNfan(String dceGlsNfan) {
        setDceGlsNfan(dceGlsNfan);
        return this;
    }

    public DceEntity dceFecFctt(String dceFecFctt) {
        setDceFecFctt(dceFecFctt);
        return this;
    }

    public DceEntity dceIndCmos(String dceIndCmos) {
        setDceIndCmos(dceIndCmos);
        return this;
    }

    public DceEntity dceRelBanc(String dceRelBanc) {
        setDceRelBanc(dceRelBanc);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DceEntity)) {
            return false;
        }
        DceEntity dceEntity = (DceEntity) o;
        return Objects.equals(dceKeyIdce, dceEntity.dceKeyIdce) && Objects.equals(dceIndCate, dceEntity.dceIndCate) && Objects.equals(dceCodTsoc, dceEntity.dceCodTsoc) && Objects.equals(dceIndTemp, dceEntity.dceIndTemp) && Objects.equals(dceGlsNfan, dceEntity.dceGlsNfan) && Objects.equals(dceFecFctt, dceEntity.dceFecFctt) && Objects.equals(dceIndCmos, dceEntity.dceIndCmos) && Objects.equals(dceRelBanc, dceEntity.dceRelBanc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dceKeyIdce, dceIndCate, dceCodTsoc, dceIndTemp, dceGlsNfan, dceFecFctt, dceIndCmos, dceRelBanc);
    }

    @Override
    public String toString() {
        return "{" +
            " dceKeyIdce='" + getDceKeyIdce() + "'" +
            ", dceIndCate='" + getDceIndCate() + "'" +
            ", dceCodTsoc='" + getDceCodTsoc() + "'" +
            ", dceIndTemp='" + getDceIndTemp() + "'" +
            ", dceGlsNfan='" + getDceGlsNfan() + "'" +
            ", dceFecFctt='" + getDceFecFctt() + "'" +
            ", dceIndCmos='" + getDceIndCmos() + "'" +
            ", dceRelBanc='" + getDceRelBanc() + "'" +
            "}";
    }
    


}
