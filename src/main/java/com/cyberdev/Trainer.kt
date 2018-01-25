package com.cyberdev

import javafx.scene.input.KeyCode
import java.util.stream.Collectors

class Trainer {

    var context = Context()
    var selectedAction: Actions = Actions.NOT_SELECTED
    var selectedRace: Races = Races.NO_RACE
    var selectedStructure: Structures = Structures.NOT_SELECTED

    fun getStructure(keyCode: KeyCode): List<Structures> {
        return context.structuresHotkeys.entries.stream()
                .filter { it.value == keyCode }
                .filter { it.key.parentAction == selectedAction }
                .filter { it.key.race == selectedRace }
                .map { it.key }
                .collect(Collectors.toList())
    }
}