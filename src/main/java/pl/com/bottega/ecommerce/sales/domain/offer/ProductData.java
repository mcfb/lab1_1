package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class ProductData {

    private BigDecimal price;
    private String id;
    private String name;
    private String type;
    private Date snapshotDate;

    public ProductData(BigDecimal price, String id, String name, String type, Date snapshotDate) {
        this.price = price;
        this.id = id;
        this.name = name;
        this.type = type;
        this.snapshotDate = snapshotDate;
    }

    public BigDecimal getProductPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        ProductData that = (ProductData) o;

        if (price != null ? !price.equals(that.price) : that.price != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null)
            return false;
        return snapshotDate != null ? snapshotDate.equals(that.snapshotDate) : that.snapshotDate == null;
    }

    @Override public int hashCode() {
        int result = price != null ? price.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (snapshotDate != null ? snapshotDate.hashCode() : 0);
        return result;
    }
}
