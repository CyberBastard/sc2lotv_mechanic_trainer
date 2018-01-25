package com.cyberdev

import javafx.application.Application
import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.scene.input.KeyCode
import javafx.scene.layout.StackPane
import javafx.scene.layout.TilePane
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
        val scene = Scene(root)
        primaryStage.scene = scene
        primaryStage.icons.add(Image(Trainer::class.java.getResource("/sc2icon.png").toExternalForm()))
        primaryStage.title = "Mechanic Trainer"
        val tiles = TilePane(Orientation.HORIZONTAL)
        with(tiles) {
            padding = Insets(10.0, 10.0, 10.0, 10.0)
            prefColumns = 5
            hgap = 2.0
            vgap = 2.0
        }
        tiles.children.addAll(context.structuresIcons.values.shuffled())
        root.children.add(tiles)
        primaryStage.show()

        scene.setOnKeyPressed {
            if (it.code == KeyCode.SPACE) {
                tiles.children.clear()
                tiles.children.addAll(context.structuresIcons.values.shuffled())
            }
        }
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Trainer::class.java)
        }
    }
}
