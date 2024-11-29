package org.example;

public class Main {
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();

        // Закупаем новые растения
        greenhouse.buyNewPlant("Роза", "Азия", "flowering");
        greenhouse.buyNewPlant("Кактус", "Африка", "bush");
        greenhouse.buyNewPlant("Папоротник", "Южная Америка", "indoor");

        // Покажем все растения в оранжерее
        greenhouse.showAllPlants();

        // Полив всех растений
        greenhouse.waterAllPlants();

        // Устанавливаем освещение для растений
        for (Plant plant : greenhouse.getPlants()) {
            plant.setLighting(true);
        }

        // Выкопаем одно из растений
        greenhouse.getPlants().get(0).digUp();
    }
}

