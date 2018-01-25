package com.cyberdev

enum class Structures(val property: String, val parentAction: Actions, val race: Races) {

    NOT_SELECTED("common.structures.not_selected", Actions.NOT_SELECTED, Races.NO_RACE),

    NEXUS("protoss.structures.nexus", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    ASSIMILATOR("protoss.structures.assimilator", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    PYLON("protoss.structures.pylon", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    GATEWAY("protoss.structures.gateway", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    FORGE("protoss.structures.forge", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    CYBERNATICS_CORE("protoss.structures.cybernatics_core", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    PHOTON_CANNON("protoss.structures.photon_cannon", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),
    SHIELD_BATTERY("protoss.structures.shield_battery", Actions.WARP_IN_STRUCTURE, Races.PROTOSS),

    TWILIGHT_COUNCIL("protoss.structures.twilight_council", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS),
    STARGATE("protoss.structures.stargate", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS),
    ROBOTICS_FACILITY("protoss.structures.robotics_facility", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS),
    TEMPLAR_ARCHIVES("protoss.structures.templar_archives", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS),
    FLEET_BEACON("protoss.structures.fleet_beacon", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS),
    ROBOTICS_BAY("protoss.structures.robotics_bay", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS),
    DARK_SHRINE("protoss.structures.dark_shrine", Actions.WARP_IN_ADVANCED_STRUCTURE, Races.PROTOSS)
}