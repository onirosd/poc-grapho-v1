package net.csonic.customers.graphql.datasource.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DCP")
public class DcpEntity {
    @Id
    @Column(name = "DCP_KEY_IDCP")
    private String dcpKeyIdcp;

    @Column(name = "DCP_FEC_FNAC")
    private String dcpFecFnac;

    @Column(name = "DCP_COD_PNAC")
    private String dcpCodPnac;

    @Column(name = "DCP_IND_SEXO")
    private String dcpIndSexo;

    @Column(name = "DCP_IND_ECIV")
    private String dcpIndEciv;

    @Column(name = "DCP_IND_NEDU")
    private String dcpIndNedu;

    @Column(name = "DCP_ING_PROM")
    private String dcpIngProm;

    @Column(name = "DCP_COD_ACTS")
    private String dcpCodActs;

    @Column(name = "DCP_DCO_PEPS")
    private String dcpDcoPeps;

    @Column(name = "DCP_IND_LAVDIN")
    private String dcpIndLavdin;

    @Column(name = "DCP_LUG_NACI")
    private String dcpLugNaci;

    @Column(name = "DCP_IND_CASA")
    private String dcpIndCasa;

    @Column(name = "DCP_IND_SLAB")
    private String dcpIndSlab;

    @Column(name = "DCP_COD_PROF")
    private String dcpCodProf;

    @Column(name = "DCP_IND_UCTA")
    private String dcpIndUcta;

    public DcpEntity() {
    }

    public DcpEntity(String dcpKeyIdcp, String dcpFecFnac, String dcpCodPnac, String dcpIndSexo, String dcpIndEciv, String dcpIndNedu, String dcpIngProm, String dcpCodActs, String dcpDcoPeps, String dcpIndLavdin, String dcpLugNaci, String dcpIndCasa, String dcpIndSlab, String dcpCodProf, String dcpIndUcta) {
        this.dcpKeyIdcp = dcpKeyIdcp;
        this.dcpFecFnac = dcpFecFnac;
        this.dcpCodPnac = dcpCodPnac;
        this.dcpIndSexo = dcpIndSexo;
        this.dcpIndEciv = dcpIndEciv;
        this.dcpIndNedu = dcpIndNedu;
        this.dcpIngProm = dcpIngProm;
        this.dcpCodActs = dcpCodActs;
        this.dcpDcoPeps = dcpDcoPeps;
        this.dcpIndLavdin = dcpIndLavdin;
        this.dcpLugNaci = dcpLugNaci;
        this.dcpIndCasa = dcpIndCasa;
        this.dcpIndSlab = dcpIndSlab;
        this.dcpCodProf = dcpCodProf;
        this.dcpIndUcta = dcpIndUcta;
    }

    public String getDcpKeyIdcp() {
        return this.dcpKeyIdcp;
    }

    public void setDcpKeyIdcp(String dcpKeyIdcp) {
        this.dcpKeyIdcp = dcpKeyIdcp;
    }

    public String getDcpFecFnac() {
        return this.dcpFecFnac;
    }

    public void setDcpFecFnac(String dcpFecFnac) {
        this.dcpFecFnac = dcpFecFnac;
    }

    public String getDcpCodPnac() {
        return this.dcpCodPnac;
    }

    public void setDcpCodPnac(String dcpCodPnac) {
        this.dcpCodPnac = dcpCodPnac;
    }

    public String getDcpIndSexo() {
        return this.dcpIndSexo;
    }

    public void setDcpIndSexo(String dcpIndSexo) {
        this.dcpIndSexo = dcpIndSexo;
    }

    public String getDcpIndEciv() {
        return this.dcpIndEciv;
    }

    public void setDcpIndEciv(String dcpIndEciv) {
        this.dcpIndEciv = dcpIndEciv;
    }

    public String getDcpIndNedu() {
        return this.dcpIndNedu;
    }

    public void setDcpIndNedu(String dcpIndNedu) {
        this.dcpIndNedu = dcpIndNedu;
    }

    public String getDcpIngProm() {
        return this.dcpIngProm;
    }

    public void setDcpIngProm(String dcpIngProm) {
        this.dcpIngProm = dcpIngProm;
    }

    public String getDcpCodActs() {
        return this.dcpCodActs;
    }

    public void setDcpCodActs(String dcpCodActs) {
        this.dcpCodActs = dcpCodActs;
    }

    public String getDcpDcoPeps() {
        return this.dcpDcoPeps;
    }

    public void setDcpDcoPeps(String dcpDcoPeps) {
        this.dcpDcoPeps = dcpDcoPeps;
    }

    public String getDcpIndLavdin() {
        return this.dcpIndLavdin;
    }

    public void setDcpIndLavdin(String dcpIndLavdin) {
        this.dcpIndLavdin = dcpIndLavdin;
    }

    public String getDcpLugNaci() {
        return this.dcpLugNaci;
    }

    public void setDcpLugNaci(String dcpLugNaci) {
        this.dcpLugNaci = dcpLugNaci;
    }

    public String getDcpIndCasa() {
        return this.dcpIndCasa;
    }

    public void setDcpIndCasa(String dcpIndCasa) {
        this.dcpIndCasa = dcpIndCasa;
    }

    public String getDcpIndSlab() {
        return this.dcpIndSlab;
    }

    public void setDcpIndSlab(String dcpIndSlab) {
        this.dcpIndSlab = dcpIndSlab;
    }

    public String getDcpCodProf() {
        return this.dcpCodProf;
    }

    public void setDcpCodProf(String dcpCodProf) {
        this.dcpCodProf = dcpCodProf;
    }

    public String getDcpIndUcta() {
        return this.dcpIndUcta;
    }

    public void setDcpIndUcta(String dcpIndUcta) {
        this.dcpIndUcta = dcpIndUcta;
    }

    public DcpEntity dcpKeyIdcp(String dcpKeyIdcp) {
        setDcpKeyIdcp(dcpKeyIdcp);
        return this;
    }

    public DcpEntity dcpFecFnac(String dcpFecFnac) {
        setDcpFecFnac(dcpFecFnac);
        return this;
    }

    public DcpEntity dcpCodPnac(String dcpCodPnac) {
        setDcpCodPnac(dcpCodPnac);
        return this;
    }

    public DcpEntity dcpIndSexo(String dcpIndSexo) {
        setDcpIndSexo(dcpIndSexo);
        return this;
    }

    public DcpEntity dcpIndEciv(String dcpIndEciv) {
        setDcpIndEciv(dcpIndEciv);
        return this;
    }

    public DcpEntity dcpIndNedu(String dcpIndNedu) {
        setDcpIndNedu(dcpIndNedu);
        return this;
    }

    public DcpEntity dcpIngProm(String dcpIngProm) {
        setDcpIngProm(dcpIngProm);
        return this;
    }

    public DcpEntity dcpCodActs(String dcpCodActs) {
        setDcpCodActs(dcpCodActs);
        return this;
    }

    public DcpEntity dcpDcoPeps(String dcpDcoPeps) {
        setDcpDcoPeps(dcpDcoPeps);
        return this;
    }

    public DcpEntity dcpIndLavdin(String dcpIndLavdin) {
        setDcpIndLavdin(dcpIndLavdin);
        return this;
    }

    public DcpEntity dcpLugNaci(String dcpLugNaci) {
        setDcpLugNaci(dcpLugNaci);
        return this;
    }

    public DcpEntity dcpIndCasa(String dcpIndCasa) {
        setDcpIndCasa(dcpIndCasa);
        return this;
    }

    public DcpEntity dcpIndSlab(String dcpIndSlab) {
        setDcpIndSlab(dcpIndSlab);
        return this;
    }

    public DcpEntity dcpCodProf(String dcpCodProf) {
        setDcpCodProf(dcpCodProf);
        return this;
    }

    public DcpEntity dcpIndUcta(String dcpIndUcta) {
        setDcpIndUcta(dcpIndUcta);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DcpEntity)) {
            return false;
        }
        DcpEntity dcpEntity = (DcpEntity) o;
        return Objects.equals(dcpKeyIdcp, dcpEntity.dcpKeyIdcp) && Objects.equals(dcpFecFnac, dcpEntity.dcpFecFnac) && Objects.equals(dcpCodPnac, dcpEntity.dcpCodPnac) && Objects.equals(dcpIndSexo, dcpEntity.dcpIndSexo) && Objects.equals(dcpIndEciv, dcpEntity.dcpIndEciv) && Objects.equals(dcpIndNedu, dcpEntity.dcpIndNedu) && Objects.equals(dcpIngProm, dcpEntity.dcpIngProm) && Objects.equals(dcpCodActs, dcpEntity.dcpCodActs) && Objects.equals(dcpDcoPeps, dcpEntity.dcpDcoPeps) && Objects.equals(dcpIndLavdin, dcpEntity.dcpIndLavdin) && Objects.equals(dcpLugNaci, dcpEntity.dcpLugNaci) && Objects.equals(dcpIndCasa, dcpEntity.dcpIndCasa) && Objects.equals(dcpIndSlab, dcpEntity.dcpIndSlab) && Objects.equals(dcpCodProf, dcpEntity.dcpCodProf) && Objects.equals(dcpIndUcta, dcpEntity.dcpIndUcta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcpKeyIdcp, dcpFecFnac, dcpCodPnac, dcpIndSexo, dcpIndEciv, dcpIndNedu, dcpIngProm, dcpCodActs, dcpDcoPeps, dcpIndLavdin, dcpLugNaci, dcpIndCasa, dcpIndSlab, dcpCodProf, dcpIndUcta);
    }

    @Override
    public String toString() {
        return "{" +
            " dcpKeyIdcp='" + getDcpKeyIdcp() + "'" +
            ", dcpFecFnac='" + getDcpFecFnac() + "'" +
            ", dcpCodPnac='" + getDcpCodPnac() + "'" +
            ", dcpIndSexo='" + getDcpIndSexo() + "'" +
            ", dcpIndEciv='" + getDcpIndEciv() + "'" +
            ", dcpIndNedu='" + getDcpIndNedu() + "'" +
            ", dcpIngProm='" + getDcpIngProm() + "'" +
            ", dcpCodActs='" + getDcpCodActs() + "'" +
            ", dcpDcoPeps='" + getDcpDcoPeps() + "'" +
            ", dcpIndLavdin='" + getDcpIndLavdin() + "'" +
            ", dcpLugNaci='" + getDcpLugNaci() + "'" +
            ", dcpIndCasa='" + getDcpIndCasa() + "'" +
            ", dcpIndSlab='" + getDcpIndSlab() + "'" +
            ", dcpCodProf='" + getDcpCodProf() + "'" +
            ", dcpIndUcta='" + getDcpIndUcta() + "'" +
            "}";
    }

    
  


}
