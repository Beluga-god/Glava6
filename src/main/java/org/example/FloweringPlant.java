package org.example;

public class FloweringPlant extends Plant {
    public FloweringPlant(String name, String originPlace) {
        super(name, originPlace);
    }

    @Override
    public void digUp() {
        System.out.println(getName() + " был(а) выкопан(а) из оранжереи.");
    }
}
