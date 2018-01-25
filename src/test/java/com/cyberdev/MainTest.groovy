package com.cyberdev

import javafx.scene.input.KeyCode
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.DisplayName

class MainTest {

    private Main main = new Main()

    @Before
    void setUp() {
    }

    @Test
    @DisplayName ("Should return list with only shield battery when selected action is \"Warp In Structure\" and selected race is Protoss and argument is KeyCode.B")
    void shouldReturnListWithOnlyShieldBattery_whenSelectedActionIsWarpInStructure_andArgumentIsKeyCodeB() {
        main.selectedAction = Actions.WARP_IN_STRUCTURE
        main.selectedRace = Races.PROTOSS

        def actualList = main.getStructure(KeyCode.B)

        assert(actualList.size == 1)
        assert actualList.get(0) == Structures.SHIELD_BATTERY
    }

    @Test
    @DisplayName ("Should return list with only robotics bay when selected action is \"Warp In Advanced Structure\" and selected race is Protoss and argument is KeyCode.B")
    void shouldReturnListWithOnlyRoboticsBay_whenSelectedActionIsWarpInAdvancedStructure_andArgumentIsKeyCodeB() {
        main.selectedAction = Actions.WARP_IN_ADVANCED_STRUCTURE
        main.selectedRace = Races.PROTOSS

        def actualList = main.getStructure(KeyCode.B)

        assert(actualList.size == 1)
        assert(actualList.get(0) == Structures.ROBOTICS_BAY)
    }
}
