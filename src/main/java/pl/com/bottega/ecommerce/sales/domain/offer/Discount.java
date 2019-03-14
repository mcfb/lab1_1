package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {
    private String cause;
    private Money amount;

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
