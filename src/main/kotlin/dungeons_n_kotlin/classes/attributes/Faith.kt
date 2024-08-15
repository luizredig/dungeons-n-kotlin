package dungeons_n_kotlin.classes.attributes

import dungeons_n_kotlin.interfaces.attributes.Attribute

class Faith(
    override var name: String,
    override var value: Int,
    override var raceBonus: Int?,
    override var classBonus: Int?
) : Attribute {
}