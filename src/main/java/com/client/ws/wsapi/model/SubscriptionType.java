package com.client.ws.wsapi.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {

    @Serial
    private static final long serialVersionUID = -5061388535287389232L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;

    private String name;

    @Column(name = "access_months")
    private Long accessMonth;
    private BigDecimal price;

    @Column(name = "product_key")
    private String productKey;

    public SubscriptionType() {
    }

    public SubscriptionType(Long id, String name, Long accessMonth, BigDecimal price, String productKey) {
        this.id = id;
        this.name = name;
        this.accessMonth = accessMonth;
        this.price = price;
        this.productKey = productKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAccessMonth() {
        return accessMonth;
    }

    public void setAccessMonth(Long accessMonth) {
        this.accessMonth = accessMonth;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    @Override
    public String toString() {
        return "subscription_type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accessMonth=" + accessMonth +
                ", price=" + price +
                ", productKey='" + productKey + '\'' +
                '}';
    }
}
