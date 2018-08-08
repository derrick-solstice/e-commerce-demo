package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shipments")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shipmentId;
    private Date shippedDate;
    private Date deliveredDate;

    @OneToOne
    @JoinColumn(name = "accountId")
    private Account account;

    @OneToOne
    @JoinColumn(name = "addressId")
    private Address adddress;

    @OneToMany
    @JoinColumn(name = "lineItemId")
    private List<LineItem> lineItems;

    @ManyToOne
    @JoinColumn(name ="orderNumber")
    private Order order;

    public Shipment() {
    }

    public Shipment(Date shippedDate, Date deliveredDate, Account account, Address adddress, List<LineItem> lineItems, Order order) {
        this.shippedDate = shippedDate;
        this.deliveredDate = deliveredDate;
        this.account = account;
        this.adddress = adddress;
        this.lineItems = lineItems;
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAdddress() {
        return adddress;
    }

    public void setAdddress(Address adddress) {
        this.adddress = adddress;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }
}
