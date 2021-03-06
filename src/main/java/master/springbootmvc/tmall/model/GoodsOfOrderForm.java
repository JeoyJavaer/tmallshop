package master.springbootmvc.tmall.model;

import java.io.Serializable;
import java.util.Date;

/**
 * goodsoforderform
 * @author 
 */
public class GoodsOfOrderForm implements Serializable {
    private Integer id;

    private Integer ofid;

    private Integer sid;

    private Date modified;

    private Integer quantity;

    private Integer display;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOfid() {
        return ofid;
    }

    public void setOfid(Integer ofid) {
        this.ofid = ofid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GoodsOfOrderForm other = (GoodsOfOrderForm) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOfid() == null ? other.getOfid() == null : this.getOfid().equals(other.getOfid()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getModified() == null ? other.getModified() == null : this.getModified().equals(other.getModified()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getDisplay() == null ? other.getDisplay() == null : this.getDisplay().equals(other.getDisplay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOfid() == null) ? 0 : getOfid().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getModified() == null) ? 0 : getModified().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getDisplay() == null) ? 0 : getDisplay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ofid=").append(ofid);
        sb.append(", sid=").append(sid);
        sb.append(", modified=").append(modified);
        sb.append(", quantity=").append(quantity);
        sb.append(", display=").append(display);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}