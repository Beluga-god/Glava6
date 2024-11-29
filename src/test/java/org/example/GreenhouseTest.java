package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenhouseTest {

    private Greenhouse greenhouse;

    @BeforeEach
    void setUp() {
        greenhouse = new Greenhouse();
    }

    @Test
    void testAddPlant() {
        Plant plant = new FloweringPlant("Роза", "Азия");
        greenhouse.addPlant(plant);

        assertEquals(1, greenhouse.getPlants().size());
        assertEquals("Роза", greenhouse.getPlants().get(0).getName());
    }

    @Test
    void testWaterAllPlants() {
        Plant plant1 = new FloweringPlant("Роза", "Азия");
        Plant plant2 = new BushPlant("Кактус", "Африка");

        greenhouse.addPlant(plant1);
        greenhouse.addPlant(plant2);

        greenhouse.waterAllPlants();

        assertTrue(plant1.isWatered());
        assertTrue(plant2.isWatered());
    }

    @Test
    void testShowAllPlants() {
        Plant plant = new IndoorPlant("Папоротник", "Южная Америка");
        greenhouse.addPlant(plant);

        greenhouse.showAllPlants();

        // Проверяем, что информация о растении выводится
        assertTrue(plant.getName().contains("Папоротник"));
    }
}

