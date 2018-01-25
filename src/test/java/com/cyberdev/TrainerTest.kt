package com.cyberdev

import javafx.scene.input.KeyCode
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations.initMocks

@DisplayName("Trainer")
class TrainerTest {

    @Mock
    private lateinit var context: Context

    @InjectMocks
    private lateinit var trainer: Trainer

    init {
        `initMocks`(this)
    }

    @Nested
    @DisplayName("for protoss")
    inner class ForProtoss {

        @BeforeEach
        fun setUpProtossRace() {
            trainer.selectedRace = Races.PROTOSS
        }

        @BeforeEach
        fun setUpStructures() {
            `when`(context.structuresHotkeys).thenReturn(mapOf(
                    Structures.SHIELD_BATTERY to KeyCode.C,
                    Structures.ROBOTICS_BAY to KeyCode.C
            ))
        }

        @Nested
        @DisplayName("should return list with")
        inner class ResultList {

            @Test
            @DisplayName("single shield battery when selected action is \"Warp In Structure\" and argument is KeyCode.C")
            fun shouldReturnListWithOnlyShieldBattery_whenSelectedActionIsWarpInStructure_andArgumentIsKeyCodeC() {
                trainer.selectedAction = Actions.WARP_IN_STRUCTURE

                val actualList = trainer.getStructure(KeyCode.C)

                assert(actualList.size == 1)
                assert(actualList.get(0) == Structures.SHIELD_BATTERY)
            }

            @Test
            @DisplayName("single robotics bay when selected action is \"Warp In Advanced Structure\" and argument is KeyCode.C")
            fun shouldReturnListWithOnlyRoboticsBay_whenSelectedActionIsWarpInAdvancedStructure_andArgumentIsKeyCodeC() {
                trainer.selectedAction = Actions.WARP_IN_ADVANCED_STRUCTURE

                val actualList = trainer.getStructure(KeyCode.C)

                assert(actualList.size == 1)
                assert(actualList.get(0) == Structures.ROBOTICS_BAY)
            }

            @Test
            @DisplayName("no elements in it when no matching structures were found")
            fun shouldReturnEmptyList_whenNoMatchingStructuresFound() {
                trainer.selectedRace = Races.NO_RACE

                val actualList = trainer.getStructure(KeyCode.K)

                assert(actualList.size == 0)
            }
        }
    }
}
