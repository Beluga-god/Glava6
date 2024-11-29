package org.example;

public abstract class Plant {
    private String name;
    private String originPlace;
    private double temperature;
    private boolean isWatered;
    private boolean isLit;

    // Геттер для поля isLit
    public boolean isLit() {
        return isLit;
    }

    // Сеттер для поля isLit (если необходимо)
    public void setLit(boolean isLit) {
        this.isLit = isLit;
    }

    public Plant(String name, String originPlace) {
        this.name = name;
        this.originPlace = originPlace;
        this.temperature = 20.0; // начальная температура
        this.isWatered = false;
        this.isLit = false;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isWatered() {
        return isWatered;
    }

    public void water() {
        this.isWatered = true;
        System.out.println(name + " был(а) полит(а).");
    }

    public void setLighting(boolean isLit) {
        this.isLit = isLit;
        System.out.println(name + " освещен(о): " + (isLit ? "включено" : "выключено"));
    }

    // Абстрактный метод для выкапывания растения
    public abstract void digUp();

    // Метод для получения информации о растении
    public void showInfo() {
        System.out.println("Название растения: " + name);
        System.out.println("Место происхождения: " + originPlace);
        System.out.println("Температура: " + temperature + "°C");
        System.out.println("Полив: " + (isWatered ? "Да" : "Нет"));
        System.out.println("Освещение: " + (isLit ? "Включено" : "Выключено"));
    }
}
