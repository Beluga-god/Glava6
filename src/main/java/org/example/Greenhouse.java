package org.example;

import java.util.ArrayList;
import java.util.List;

public class Greenhouse {
    private List<Plant> plants;

    public Greenhouse() {
        plants = new ArrayList<>();
    }

    // Метод для получения списка всех растений
    public List<Plant> getPlants() {
        return plants;
    }

    // Добавление нового растения в оранжерею
    public void addPlant(Plant plant) {
        plants.add(plant);
        System.out.println(plant.getName() + " был(а) добавлен(а) в оранжерею.");
    }

    // Получение информации о всех растениях
    public void showAllPlants() {
        for (Plant plant : plants) {
            plant.showInfo();
            System.out.println();
        }
    }

    // Закупка нового растения (добавление в оранжерею)
    public void buyNewPlant(String name, String originPlace, String type) {
        Plant newPlant;
        switch (type.toLowerCase()) {
            case "bush":
                newPlant = new BushPlant(name, originPlace);
                break;
            case "flowering":
                newPlant = new FloweringPlant(name, originPlace);
                break;
            case "indoor":
                newPlant = new IndoorPlant(name, originPlace);
                break;
            default:
                System.out.println("Некорректный тип растения.");
                return;
        }
        addPlant(newPlant);
    }

    // Полив всех растений
    public void waterAllPlants() {
        for (Plant plant : plants) {
            plant.water();
        }
    }
}
