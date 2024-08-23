package dungeons_n_kotlin.classes.entities

import dungeons_n_kotlin.classes.attributes.Attributes
import dungeons_n_kotlin.interfaces.breed.IBreed

class Character(var name: String, var breed: IBreed, var attributes: Attributes) {
    init {
        addAttributesBonus()
    }

    private fun addAttributesBonus() {
        this.attributes.strength += this.breed.getStrength()
        this.attributes.dexterity += this.breed.getDexterity()
        this.attributes.constitution += this.breed.getConstitution()
        this.attributes.intelligence += this.breed.getIntelligence()
        this.attributes.wisdom += this.breed.getWisdom()
        this.attributes.charisma += this.breed.getCharisma()
    }

    fun listAttributes(): String {
        return """
            Name: $name
            Strength: ${attributes.strength}
            Dexterity: ${attributes.dexterity}
            Constitution: ${attributes.constitution}
            Intelligence: ${attributes.intelligence}
            Wisdom: ${attributes.wisdom}
            Charisma: ${attributes.charisma}
        """.trimIndent()
    }
}