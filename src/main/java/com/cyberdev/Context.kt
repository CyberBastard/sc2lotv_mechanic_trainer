package com.cyberdev

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
}