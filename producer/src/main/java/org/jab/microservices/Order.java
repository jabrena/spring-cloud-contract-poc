package org.jab.microservices;

public class Order {

    private final String id;

    public Order(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
