package org.example;

public class IndoorPlant extends Plant {
    public IndoorPlant(String name, String originPlace) {
        super(name, originPlace);
    }

    @Override
    public void digUp() {
        System.out.println(getName() + " был(а) выкопан(а) из оранжереи.");
    }
}
