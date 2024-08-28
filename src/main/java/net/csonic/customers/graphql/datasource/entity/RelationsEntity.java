package net.csonic.customers.graphql.datasource.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REC")
public class RelationsEntity {

    @Id
    @Column(name = "REC_CIC_ICLI")
    private String recCicIcli;

    @Column(name = "REC_COD_TREC")
    private String recCodTrec;

    @Column(name = "REC_COD_AREC")
    private String recCodArec;

    @Column(name = "REC_CIC_IREL")
    private String recCicIrel;

    @Column(name = "REC_SGV_AREC")
    private String recSgvArec;

    @Column(name = "REC_FEC_FVAL")
    private String recFecFval;

    @Column(name = "REC_FEC_FINI")
    private String recFecFini;

    @Column(name = "REC_FEC_FTER")
    private String recFecFter;

    @Column(name = "REC_FEC_FVRF")
    private String recFecFvrf;


    public RelationsEntity() {
    }

    public RelationsEntity(String recCicIcli, String recCodTrec, String recCodArec, String recCicIrel, String recSgvArec, String recFecFval, String recFecFini, String recFecFter, String recFecFvrf) {
        this.recCicIcli = recCicIcli;
        this.recCodTrec = recCodTrec;
        this.recCodArec = recCodArec;
        this.recCicIrel = recCicIrel;
        this.recSgvArec = recSgvArec;
        this.recFecFval = recFecFval;
        this.recFecFini = recFecFini;
        this.recFecFter = recFecFter;
        this.recFecFvrf = recFecFvrf;
    }

    public String getRecCicIcli() {
        return this.recCicIcli;
    }

    public void setRecCicIcli(String recCicIcli) {
        this.recCicIcli = recCicIcli;
    }

    public String getRecCodTrec() {
        return this.recCodTrec;
    }

    public void setRecCodTrec(String recCodTrec) {
        this.recCodTrec = recCodTrec;
    }

    public String getRecCodArec() {
        return this.recCodArec;
    }

    public void setRecCodArec(String recCodArec) {
        this.recCodArec = recCodArec;
    }

    public String getRecCicIrel() {
        return this.recCicIrel;
    }

    public void setRecCicIrel(String recCicIrel) {
        this.recCicIrel = recCicIrel;
    }

    public String getRecSgvArec() {
        return this.recSgvArec;
    }

    public void setRecSgvArec(String recSgvArec) {
        this.recSgvArec = recSgvArec;
    }

    public String getRecFecFval() {
        return this.recFecFval;
    }

    public void setRecFecFval(String recFecFval) {
        this.recFecFval = recFecFval;
    }

    public String getRecFecFini() {
        return this.recFecFini;
    }

    public void setRecFecFini(String recFecFini) {
        this.recFecFini = recFecFini;
    }

    public String getRecFecFter() {
        return this.recFecFter;
    }

    public void setRecFecFter(String recFecFter) {
        this.recFecFter = recFecFter;
    }

    public String getRecFecFvrf() {
        return this.recFecFvrf;
    }

    public void setRecFecFvrf(String recFecFvrf) {
        this.recFecFvrf = recFecFvrf;
    }

    public RelationsEntity recCicIcli(String recCicIcli) {
        setRecCicIcli(recCicIcli);
        return this;
    }

    public RelationsEntity recCodTrec(String recCodTrec) {
        setRecCodTrec(recCodTrec);
        return this;
    }

    public RelationsEntity recCodArec(String recCodArec) {
        setRecCodArec(recCodArec);
        return this;
    }

    public RelationsEntity recCicIrel(String recCicIrel) {
        setRecCicIrel(recCicIrel);
        return this;
    }

    public RelationsEntity recSgvArec(String recSgvArec) {
        setRecSgvArec(recSgvArec);
        return this;
    }

    public RelationsEntity recFecFval(String recFecFval) {
        setRecFecFval(recFecFval);
        return this;
    }

    public RelationsEntity recFecFini(String recFecFini) {
        setRecFecFini(recFecFini);
        return this;
    }

    public RelationsEntity recFecFter(String recFecFter) {
        setRecFecFter(recFecFter);
        return this;
    }

    public RelationsEntity recFecFvrf(String recFecFvrf) {
        setRecFecFvrf(recFecFvrf);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RelationsEntity)) {
            return false;
        }
        RelationsEntity relationsEntity = (RelationsEntity) o;
        return Objects.equals(recCicIcli, relationsEntity.recCicIcli) && Objects.equals(recCodTrec, relationsEntity.recCodTrec) && Objects.equals(recCodArec, relationsEntity.recCodArec) && Objects.equals(recCicIrel, relationsEntity.recCicIrel) && Objects.equals(recSgvArec, relationsEntity.recSgvArec) && Objects.equals(recFecFval, relationsEntity.recFecFval) && Objects.equals(recFecFini, relationsEntity.recFecFini) && Objects.equals(recFecFter, relationsEntity.recFecFter) && Objects.equals(recFecFvrf, relationsEntity.recFecFvrf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recCicIcli, recCodTrec, recCodArec, recCicIrel, recSgvArec, recFecFval, recFecFini, recFecFter, recFecFvrf);
    }

    @Override
    public String toString() {
        return "{" +
            " recCicIcli='" + getRecCicIcli() + "'" +
            ", recCodTrec='" + getRecCodTrec() + "'" +
            ", recCodArec='" + getRecCodArec() + "'" +
            ", recCicIrel='" + getRecCicIrel() + "'" +
            ", recSgvArec='" + getRecSgvArec() + "'" +
            ", recFecFval='" + getRecFecFval() + "'" +
            ", recFecFini='" + getRecFecFini() + "'" +
            ", recFecFter='" + getRecFecFter() + "'" +
            ", recFecFvrf='" + getRecFecFvrf() + "'" +
            "}";
    }

    
}
