package dom;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by peter on 31-May-16.
 */
@Entity
@Table(name = "afspraak", schema = "funda", catalog = "")
public class AfspraakEntity {
    private int afspraakId;
    private Integer mkmdwid;
    private Integer woid;
    private Date afspraakDateTime;

    @Id
    @Column(name = "afspraak_id", nullable = false)
    public int getAfspraakId() {
        return afspraakId;
    }

    public void setAfspraakId(int afspraakId) {
        this.afspraakId = afspraakId;
    }

    @Basic
    @Column(name = "MKMDWID", nullable = true)
    public Integer getMkmdwid() {
        return mkmdwid;
    }

    public void setMkmdwid(Integer mkmdwid) {
        this.mkmdwid = mkmdwid;
    }

    @Basic
    @Column(name = "WOID", nullable = true)
    public Integer getWoid() {
        return woid;
    }

    public void setWoid(Integer woid) {
        this.woid = woid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AfspraakEntity that = (AfspraakEntity) o;

        if (afspraakId != that.afspraakId) return false;
        if (mkmdwid != null ? !mkmdwid.equals(that.mkmdwid) : that.mkmdwid != null) return false;
        if (woid != null ? !woid.equals(that.woid) : that.woid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = afspraakId;
        result = 31 * result + (mkmdwid != null ? mkmdwid.hashCode() : 0);
        result = 31 * result + (woid != null ? woid.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "afspraak_date_time", nullable = false)
    public Date getAfspraakDateTime() {
        return afspraakDateTime;
    }

    public void setAfspraakDateTime(Date afspraakDateTime) {
        this.afspraakDateTime = afspraakDateTime;
    }
}
