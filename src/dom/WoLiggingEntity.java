package dom;

import javax.persistence.*;

/**
 * Created by peter on 31-May-16.
 */
@Entity
@Table(name = "wo_ligging", schema = "funda", catalog = "")
public class WoLiggingEntity {
    private int woLiggingId;
    private Integer woid;
    private Integer liggingId;

    @Id
    @Column(name = "wo_ligging_id", nullable = false)
    public int getWoLiggingId() {
        return woLiggingId;
    }

    public void setWoLiggingId(int woLiggingId) {
        this.woLiggingId = woLiggingId;
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
    @Column(name = "ligging_id", nullable = true)
    public Integer getLiggingId() {
        return liggingId;
    }

    public void setLiggingId(Integer liggingId) {
        this.liggingId = liggingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WoLiggingEntity that = (WoLiggingEntity) o;

        if (woLiggingId != that.woLiggingId) return false;
        if (woid != null ? !woid.equals(that.woid) : that.woid != null) return false;
        if (liggingId != null ? !liggingId.equals(that.liggingId) : that.liggingId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = woLiggingId;
        result = 31 * result + (woid != null ? woid.hashCode() : 0);
        result = 31 * result + (liggingId != null ? liggingId.hashCode() : 0);
        return result;
    }
}
