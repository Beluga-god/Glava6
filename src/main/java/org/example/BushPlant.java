package org.example;

public class BushPlant extends Plant {
    public BushPlant(String name, String originPlace) {
        super(name, originPlace);
    }

    @Override
    public void digUp() {
        System.out.println(getName() + " был(а) выкопан(а) из оранжереи.");
    }
}

