package com.fengming.pojo;

/**
 * 订单
 */
public class Orders {
    private Integer id;
    private String orderNumber;
    private Double orderPrice;

    //关联此订单下的客户信息,多方持有一方的对象
    private Customer customer;

    public Orders(){}

    public Orders(Integer id, String orderNumber, Double orderPrice) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
    }

    public Orders(Integer id, String orderNumber, Double orderPrice, Customer customer) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.orderPrice = orderPrice;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderPrice=" + orderPrice +
                ", customer=" + customer +
                '}';
    }
}
