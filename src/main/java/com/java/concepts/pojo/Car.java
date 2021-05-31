package com.java.concepts.pojo;

import java.util.Objects;

public class Car {
    String name;
    int model;
    String color;
    int milage;

    public Car(String name, int model, String color, int milage) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.milage = milage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model == car.model && milage == car.milage && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, color, milage);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("name='").append(name).append('\'');
        sb.append(", model=").append(model);
        sb.append(", color='").append(color).append('\'');
        sb.append(", milage=").append(milage);
        sb.append('}');
        return sb.toString();
    }
}
