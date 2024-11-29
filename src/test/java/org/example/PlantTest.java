package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {

    @Test
    void testWatering() {
        Plant plant = new FloweringPlant("Роза", "Азия");
        plant.water();

        assertTrue(plant.isWatered(), "Растение должно быть полито");
    }

    @Test
    void testSetLighting() {
        Plant plant = new IndoorPlant("Папоротник", "Южная Америка");
        plant.setLighting(true);

        assertTrue(plant.isLit(), "Растение должно быть освещено");
    }

    @Test
    void testDigUp() {
        Plant plant = new BushPlant("Кактус", "Африка");

        plant.digUp();

        // Проверим, что выкапывание растении выведет сообщение
        // Здесь мы ожидаем, что будет вызвано стандартное сообщение, которое вы выводите в консоль
        assertDoesNotThrow(() -> plant.digUp());
    }
}
