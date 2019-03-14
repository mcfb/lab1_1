package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money implements Comparable<Money> {

    private String currency;
    private BigDecimal value;

    public Money(String currency, BigDecimal value) {
        this.currency = currency;
        this.value = value;
    }

    public void setValue(BigDecimal subtract) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override public int compareTo(Money o) {
        if(this.value.compareTo(o.getValue()) < 0) {
            return -1;
        } else if (this.value.compareTo(o.getValue()) > 0)
        return 1;
        else{
            return 0;
        }
    }
}
