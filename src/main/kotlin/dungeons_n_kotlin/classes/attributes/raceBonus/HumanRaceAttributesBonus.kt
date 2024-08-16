package dungeons_n_kotlin.classes.attributes.raceBonus

import dungeons_n_kotlin.interfaces.attributes.AttributesBonus

class HumanRaceAttributesBonus(
    override var strength: Int,
    override var dexterity: Int,
    override var endurance: Int,
    override var faith: Int,
    override var intelligence: Int,
    override var wisdom: Int
) : AttributesBonus