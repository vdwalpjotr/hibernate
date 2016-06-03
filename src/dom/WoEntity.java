package dom;

import javax.persistence.*;

/**
 * Created by peter on 31-May-16.
 */
@Entity
@Table(name = "wo", schema = "funda", catalog = "")
public class WoEntity {
    private int woid;
    private Integer mkid;
    private String address;
    private String pc;
    private String city;
    private Integer soortObject;
    private Integer soortWoning;
    private Integer typeWoning;
    private Integer soortBouw;
    private Integer bouwJaar;
    private Integer mkmdwid;

    @Id
    @Column(name = "WOID", nullable = false)
    public int getWoid() {
        return woid;
    }

    public void setWoid(int woid) {
        this.woid = woid;
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
    @Column(name = "Address", nullable = true, length = 1000)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "PC", nullable = true, length = 7)
    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    @Basic
    @Column(name = "City", nullable = true, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "SoortObject", nullable = true)
    public Integer getSoortObject() {
        return soortObject;
    }

    public void setSoortObject(Integer soortObject) {
        this.soortObject = soortObject;
    }

    @Basic
    @Column(name = "SoortWoning", nullable = true)
    public Integer getSoortWoning() {
        return soortWoning;
    }

    public void setSoortWoning(Integer soortWoning) {
        this.soortWoning = soortWoning;
    }

    @Basic
    @Column(name = "TypeWoning", nullable = true)
    public Integer getTypeWoning() {
        return typeWoning;
    }

    public void setTypeWoning(Integer typeWoning) {
        this.typeWoning = typeWoning;
    }

    @Basic
    @Column(name = "SoortBouw", nullable = true)
    public Integer getSoortBouw() {
        return soortBouw;
    }

    public void setSoortBouw(Integer soortBouw) {
        this.soortBouw = soortBouw;
    }

    @Basic
    @Column(name = "BouwJaar", nullable = true)
    public Integer getBouwJaar() {
        return bouwJaar;
    }

    public void setBouwJaar(Integer bouwJaar) {
        this.bouwJaar = bouwJaar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WoEntity woEntity = (WoEntity) o;

        if (woid != woEntity.woid) return false;
        if (mkid != null ? !mkid.equals(woEntity.mkid) : woEntity.mkid != null) return false;
        if (address != null ? !address.equals(woEntity.address) : woEntity.address != null) return false;
        if (pc != null ? !pc.equals(woEntity.pc) : woEntity.pc != null) return false;
        if (city != null ? !city.equals(woEntity.city) : woEntity.city != null) return false;
        if (soortObject != null ? !soortObject.equals(woEntity.soortObject) : woEntity.soortObject != null)
            return false;
        if (soortWoning != null ? !soortWoning.equals(woEntity.soortWoning) : woEntity.soortWoning != null)
            return false;
        if (typeWoning != null ? !typeWoning.equals(woEntity.typeWoning) : woEntity.typeWoning != null) return false;
        if (soortBouw != null ? !soortBouw.equals(woEntity.soortBouw) : woEntity.soortBouw != null) return false;
        if (bouwJaar != null ? !bouwJaar.equals(woEntity.bouwJaar) : woEntity.bouwJaar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = woid;
        result = 31 * result + (mkid != null ? mkid.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (pc != null ? pc.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (soortObject != null ? soortObject.hashCode() : 0);
        result = 31 * result + (soortWoning != null ? soortWoning.hashCode() : 0);
        result = 31 * result + (typeWoning != null ? typeWoning.hashCode() : 0);
        result = 31 * result + (soortBouw != null ? soortBouw.hashCode() : 0);
        result = 31 * result + (bouwJaar != null ? bouwJaar.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "MKMDWID", nullable = true)
    public Integer getMkmdwid() {
        return mkmdwid;
    }

    public void setMkmdwid(Integer mkmdwid) {
        this.mkmdwid = mkmdwid;
    }
}
