package com.pizzahi.model;


import java.util.Objects;

public class Order {
    private int count;
    private String type;
    private String Size;
    private String datetime;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return count == order.count &&
                Objects.equals(type, order.type) &&
                Objects.equals(Size, order.Size) &&
                Objects.equals(datetime, order.datetime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, type, Size, datetime);
    }

    @Override
    public String toString() {
        return "Order{" +
                "count=" + count +
                ", type='" + type + '\'' +
                ", Size='" + Size + '\'' +
                ", datetime='" + datetime + '\'' +
                ", id=" + id +
                '}';
    }
}
