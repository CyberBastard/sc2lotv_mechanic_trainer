package com.cyberdev

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.input.KeyCode
import javafx.scene.layout.StackPane
import javafx.stage.Stage
import java.util.stream.Collectors

class Trainer : Application() {

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

    override fun start(primaryStage: Stage) {
        val root = StackPane()
        val scene = Scene(root, 400.0, 400.0)
        primaryStage.scene = scene
        primaryStage.show()
        root.children.addAll(context.structuresIcons.get(Structures.NEXUS))
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Trainer::class.java)
        }
    }
}
