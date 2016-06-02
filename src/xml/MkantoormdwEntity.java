package xml;

import javax.persistence.*;

/**
 * Created by peter on 31-May-16.
 */
@Entity
@Table(name = "mkantoormdw", schema = "funda", catalog = "")
public class MkantoormdwEntity {
    private int mkmdwid;
    private Integer mkid;
    private String name;
    private String user;
    private String pwd;

    @Id
    @Column(name = "MKMDWID", nullable = false)
    public int getMkmdwid() {
        return mkmdwid;
    }

    public void setMkmdwid(int mkmdwid) {
        this.mkmdwid = mkmdwid;
    }

    @Basic
    @Column(name = "MKID", nullable = true)
    public Integer getMkid() {
        return mkid;
    }

    public void setMkid(Integer mkid) {
        this.mkid = mkid;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "User")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "Pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MkantoormdwEntity that = (MkantoormdwEntity) o;

        if (mkmdwid != that.mkmdwid) return false;
        if (mkid != null ? !mkid.equals(that.mkid) : that.mkid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (user != null ? !user.equals(that.user) : that.user != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mkmdwid;
        result = 31 * result + (mkid != null ? mkid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }
}
