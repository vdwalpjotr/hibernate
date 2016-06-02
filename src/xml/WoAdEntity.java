package xml;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by peter on 31-May-16.
 */
@Entity
@Table(name = "wo_ad", schema = "funda", catalog = "")
public class WoAdEntity {
    private int woAdId;
    private Integer woid;
    private Double vraagprijs;
    private Integer vraagprijsSoort;
    private String omschrijving;
    private Integer statusId;
    private Date plaatsingsDatum;

    @Id
    @Column(name = "wo_ad_id", nullable = false)
    public int getWoAdId() {
        return woAdId;
    }

    public void setWoAdId(int woAdId) {
        this.woAdId = woAdId;
    }

    @Basic
    @Column(name = "WOID", nullable = true)
    public Integer getWoid() {
        return woid;
    }

    public void setWoid(Integer woid) {
        this.woid = woid;
    }

    @Basic
    @Column(name = "vraagprijs", nullable = true, precision = 0)
    public Double getVraagprijs() {
        return vraagprijs;
    }

    public void setVraagprijs(Double vraagprijs) {
        this.vraagprijs = vraagprijs;
    }

    @Basic
    @Column(name = "vraagprijs_soort", nullable = true)
    public Integer getVraagprijsSoort() {
        return vraagprijsSoort;
    }

    public void setVraagprijsSoort(Integer vraagprijsSoort) {
        this.vraagprijsSoort = vraagprijsSoort;
    }

    @Basic
    @Column(name = "omschrijving", nullable = true, length = -1)
    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Basic
    @Column(name = "status_id", nullable = true)
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Basic
    @Column(name = "plaatsings_datum", nullable = true)
    public Date getPlaatsingsDatum() {
        return plaatsingsDatum;
    }

    public void setPlaatsingsDatum(Date plaatsingsDatum) {
        this.plaatsingsDatum = plaatsingsDatum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WoAdEntity that = (WoAdEntity) o;

        if (woAdId != that.woAdId) return false;
        if (woid != null ? !woid.equals(that.woid) : that.woid != null) return false;
        if (vraagprijs != null ? !vraagprijs.equals(that.vraagprijs) : that.vraagprijs != null) return false;
        if (vraagprijsSoort != null ? !vraagprijsSoort.equals(that.vraagprijsSoort) : that.vraagprijsSoort != null)
            return false;
        if (omschrijving != null ? !omschrijving.equals(that.omschrijving) : that.omschrijving != null) return false;
        if (statusId != null ? !statusId.equals(that.statusId) : that.statusId != null) return false;
        if (plaatsingsDatum != null ? !plaatsingsDatum.equals(that.plaatsingsDatum) : that.plaatsingsDatum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = woAdId;
        result = 31 * result + (woid != null ? woid.hashCode() : 0);
        result = 31 * result + (vraagprijs != null ? vraagprijs.hashCode() : 0);
        result = 31 * result + (vraagprijsSoort != null ? vraagprijsSoort.hashCode() : 0);
        result = 31 * result + (omschrijving != null ? omschrijving.hashCode() : 0);
        result = 31 * result + (statusId != null ? statusId.hashCode() : 0);
        result = 31 * result + (plaatsingsDatum != null ? plaatsingsDatum.hashCode() : 0);
        return result;
    }
}
