package dom;

import javax.persistence.*;

/**
 * Created by peter on 31-May-16.
 */
@Entity
@Table(name = "wo_details", schema = "funda", catalog = "")
public class WoDetailsEntity {
    private int woDetailsId;
    private Integer woid;
    private Integer woonOppervlakte;
    private Integer inhoud;
    private Integer aantalkamers;
    private Integer aantalbadkamers;
    private Integer aantalwoonlagen;
    private Integer perceelOppervlakte;
    private Integer tuinOppervlakte;

    @Id
    @Column(name = "wo_details_id", nullable = false)
    public int getWoDetailsId() {
        return woDetailsId;
    }

    public void setWoDetailsId(int woDetailsId) {
        this.woDetailsId = woDetailsId;
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
    @Column(name = "Woon_oppervlakte", nullable = true)
    public Integer getWoonOppervlakte() {
        return woonOppervlakte;
    }

    public void setWoonOppervlakte(Integer woonOppervlakte) {
        this.woonOppervlakte = woonOppervlakte;
    }

    @Basic
    @Column(name = "Inhoud", nullable = true)
    public Integer getInhoud() {
        return inhoud;
    }

    public void setInhoud(Integer inhoud) {
        this.inhoud = inhoud;
    }

    @Basic
    @Column(name = "Aantalkamers", nullable = true)
    public Integer getAantalkamers() {
        return aantalkamers;
    }

    public void setAantalkamers(Integer aantalkamers) {
        this.aantalkamers = aantalkamers;
    }

    @Basic
    @Column(name = "Aantalbadkamers", nullable = true)
    public Integer getAantalbadkamers() {
        return aantalbadkamers;
    }

    public void setAantalbadkamers(Integer aantalbadkamers) {
        this.aantalbadkamers = aantalbadkamers;
    }

    @Basic
    @Column(name = "Aantalwoonlagen", nullable = true)
    public Integer getAantalwoonlagen() {
        return aantalwoonlagen;
    }

    public void setAantalwoonlagen(Integer aantalwoonlagen) {
        this.aantalwoonlagen = aantalwoonlagen;
    }

    @Basic
    @Column(name = "Perceel_oppervlakte", nullable = true)
    public Integer getPerceelOppervlakte() {
        return perceelOppervlakte;
    }

    public void setPerceelOppervlakte(Integer perceelOppervlakte) {
        this.perceelOppervlakte = perceelOppervlakte;
    }

    @Basic
    @Column(name = "Tuin_oppervlakte", nullable = true)
    public Integer getTuinOppervlakte() {
        return tuinOppervlakte;
    }

    public void setTuinOppervlakte(Integer tuinOppervlakte) {
        this.tuinOppervlakte = tuinOppervlakte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WoDetailsEntity that = (WoDetailsEntity) o;

        if (woDetailsId != that.woDetailsId) return false;
        if (woid != null ? !woid.equals(that.woid) : that.woid != null) return false;
        if (woonOppervlakte != null ? !woonOppervlakte.equals(that.woonOppervlakte) : that.woonOppervlakte != null)
            return false;
        if (inhoud != null ? !inhoud.equals(that.inhoud) : that.inhoud != null) return false;
        if (aantalkamers != null ? !aantalkamers.equals(that.aantalkamers) : that.aantalkamers != null) return false;
        if (aantalbadkamers != null ? !aantalbadkamers.equals(that.aantalbadkamers) : that.aantalbadkamers != null)
            return false;
        if (aantalwoonlagen != null ? !aantalwoonlagen.equals(that.aantalwoonlagen) : that.aantalwoonlagen != null)
            return false;
        if (perceelOppervlakte != null ? !perceelOppervlakte.equals(that.perceelOppervlakte) : that.perceelOppervlakte != null)
            return false;
        if (tuinOppervlakte != null ? !tuinOppervlakte.equals(that.tuinOppervlakte) : that.tuinOppervlakte != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = woDetailsId;
        result = 31 * result + (woid != null ? woid.hashCode() : 0);
        result = 31 * result + (woonOppervlakte != null ? woonOppervlakte.hashCode() : 0);
        result = 31 * result + (inhoud != null ? inhoud.hashCode() : 0);
        result = 31 * result + (aantalkamers != null ? aantalkamers.hashCode() : 0);
        result = 31 * result + (aantalbadkamers != null ? aantalbadkamers.hashCode() : 0);
        result = 31 * result + (aantalwoonlagen != null ? aantalwoonlagen.hashCode() : 0);
        result = 31 * result + (perceelOppervlakte != null ? perceelOppervlakte.hashCode() : 0);
        result = 31 * result + (tuinOppervlakte != null ? tuinOppervlakte.hashCode() : 0);
        return result;
    }
}
