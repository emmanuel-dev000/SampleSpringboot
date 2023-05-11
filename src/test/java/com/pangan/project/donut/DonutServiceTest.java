package com.pangan.project.donut;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonutServiceTest {

    @Test
    void Test_IfNewDonutFromDonutControllerIsNull_ShouldNotBeAddedToList() {
        Donut donut = null;
        var donutService = new DonutService();
        assertNull(donutService.addNewDonut(donut));
    }

    @Test
    void Test_IfNewDonutFromDonutControllerIsNotNull_ShouldBeAddedToList() {
        Donut donut = new Donut("rockyDonut", "Rocky Donut");
        var donutService = new DonutService();
        assertNotNull(donutService.addNewDonut(donut));
    }

    @Test
    void Test_IfOldDonutIsUpdated_ShouldReturnTheUpdatedVersion() {
        Donut donut = new Donut("tempDonut", "Temp Donut");
        var donutService = new DonutService();
        donutService.addNewDonut(new Donut("tempDonut", "Old Donut"));
        assertNotNull(donutService.updateDonutById(donut, "tempDonut"));
    }

    @Test
    void Test_IfOldDonutDoesNotExistAndUpdated_ShouldReturnNull() {
        Donut donut = new Donut("tempDonut", "Temp Donut");
        var donutService = new DonutService();
        assertNotNull(donutService.updateDonutById(donut, "tempDonut"));
    }

}