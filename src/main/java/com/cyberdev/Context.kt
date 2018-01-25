package com.cyberdev

import javafx.scene.image.ImageView
import javafx.scene.input.KeyCode

class Context {

    val actionsHotkeys = mapOf(
            Actions.WARP_IN_STRUCTURE to KeyCode.B,
            Actions.WARP_IN_ADVANCED_STRUCTURE to KeyCode.V,
            Actions.NOT_SELECTED to KeyCode.ESCAPE
    )

    val structuresHotkeys = mapOf(
            Structures.NEXUS to KeyCode.N,
            Structures.ASSIMILATOR to KeyCode.A,
            Structures.PYLON to KeyCode.E,
            Structures.GATEWAY to KeyCode.G,
            Structures.FORGE to KeyCode.F,
            Structures.CYBERNATICS_CORE to KeyCode.Y,
            Structures.PHOTON_CANNON to KeyCode.C,
            Structures.SHIELD_BATTERY to KeyCode.B,

            Structures.TWILIGHT_COUNCIL to KeyCode.C,
            Structures.STARGATE to KeyCode.S,
            Structures.ROBOTICS_FACILITY to KeyCode.R,
            Structures.TEMPLAR_ARCHIVES to KeyCode.T,
            Structures.FLEET_BEACON to KeyCode.F,
            Structures.ROBOTICS_BAY to KeyCode.B,
            Structures.DARK_SHRINE to KeyCode.D
    )

    val structuresIcons = mapOf(
            Structures.NEXUS to getImageFromResources("Nexus"),
            Structures.ASSIMILATOR to getImageFromResources("Assimilator"),
            Structures.PYLON to getImageFromResources("Pylon"),
            Structures.GATEWAY to getImageFromResources("Gateway"),
            Structures.FORGE to getImageFromResources("Forge"),
            Structures.CYBERNATICS_CORE to getImageFromResources("Cybernetics_Core"),
            Structures.PHOTON_CANNON to getImageFromResources("Photon_Cannon"),
            Structures.SHIELD_BATTERY to getImageFromResources("Shield_Battery"),
            Structures.TWILIGHT_COUNCIL to getImageFromResources("Twilight_Council"),
            Structures.STARGATE to getImageFromResources("Stargate"),
            Structures.ROBOTICS_FACILITY to getImageFromResources("Robotics_Facility"),
            Structures.TEMPLAR_ARCHIVES to getImageFromResources("Templar_Archives"),
            Structures.FLEET_BEACON to getImageFromResources("Fleet_Beacon"),
            Structures.ROBOTICS_BAY to getImageFromResources("Robotics_Bay"),
            Structures.DARK_SHRINE to getImageFromResources("Dark_Shrine")
    )

    private fun getImageFromResources(building: String): ImageView {
        val imageView =  ImageView(Context::class.java.getResource("/protoss/Icon_Protoss_$building.png").toExternalForm())
        with(imageView) {
            fitHeight = 50.0
            fitWidth = 50.0
        }
        return imageView
    }

}