package dungeons_n_kotlin.classes.entities

import dungeons_n_kotlin.classes.attributes.Attributes
import dungeons_n_kotlin.interfaces.breed.Breed

class Player(
    var name: String,
    var breed: Breed,
    var attributes: Attributes
) {
    fun addAttributesBonus() {
        this.attributes.strength += this.breed.attributesBonus.strength
        this.attributes.dexterity += this.breed.attributesBonus.dexterity
        this.attributes.constitution += this.breed.attributesBonus.constitution
        this.attributes.intelligence += this.breed.attributesBonus.intelligence
        this.attributes.wisdom += this.breed.attributesBonus.wisdom
        this.attributes.charisma += this.breed.attributesBonus.charisma
    }
}