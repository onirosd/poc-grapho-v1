package net.csonic.customers.graphql.datasource.entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REC")
public class RecEntity {

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


    public RecEntity() {
    }

    public RecEntity(String recCicIcli, String recCodTrec, String recCodArec, String recCicIrel, String recSgvArec, String recFecFval, String recFecFini, String recFecFter, String recFecFvrf) {
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

    public RecEntity recCicIcli(String recCicIcli) {
        setRecCicIcli(recCicIcli);
        return this;
    }

    public RecEntity recCodTrec(String recCodTrec) {
        setRecCodTrec(recCodTrec);
        return this;
    }

    public RecEntity recCodArec(String recCodArec) {
        setRecCodArec(recCodArec);
        return this;
    }

    public RecEntity recCicIrel(String recCicIrel) {
        setRecCicIrel(recCicIrel);
        return this;
    }

    public RecEntity recSgvArec(String recSgvArec) {
        setRecSgvArec(recSgvArec);
        return this;
    }

    public RecEntity recFecFval(String recFecFval) {
        setRecFecFval(recFecFval);
        return this;
    }

    public RecEntity recFecFini(String recFecFini) {
        setRecFecFini(recFecFini);
        return this;
    }

    public RecEntity recFecFter(String recFecFter) {
        setRecFecFter(recFecFter);
        return this;
    }

    public RecEntity recFecFvrf(String recFecFvrf) {
        setRecFecFvrf(recFecFvrf);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RecEntity)) {
            return false;
        }
        RecEntity recEntity = (RecEntity) o;
        return Objects.equals(recCicIcli, recEntity.recCicIcli) && Objects.equals(recCodTrec, recEntity.recCodTrec) && Objects.equals(recCodArec, recEntity.recCodArec) && Objects.equals(recCicIrel, recEntity.recCicIrel) && Objects.equals(recSgvArec, recEntity.recSgvArec) && Objects.equals(recFecFval, recEntity.recFecFval) && Objects.equals(recFecFini, recEntity.recFecFini) && Objects.equals(recFecFter, recEntity.recFecFter) && Objects.equals(recFecFvrf, recEntity.recFecFvrf);
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
