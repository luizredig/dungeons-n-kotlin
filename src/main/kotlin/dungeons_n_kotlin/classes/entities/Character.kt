package dungeons_n_kotlin.classes.entities

import dungeons_n_kotlin.classes.attributes.Attributes
import dungeons_n_kotlin.classes.modifiers.AttributesModifier
import dungeons_n_kotlin.interfaces.breed.IBreed

class Character {
    lateinit var name: String

    lateinit var breed: IBreed

    lateinit var attributes: Attributes

//    private fun addAttributesBonus() {
//        attributes.strength += breed.getStrength()
//        attributes.dexterity += breed.getDexterity()
//        attributes.constitution += breed.getConstitution()
//        attributes.intelligence += breed.getIntelligence()
//        attributes.wisdom += breed.getWisdom()
//        attributes.charisma += breed.getCharisma()
//    }

    fun listAttributes(): String {
        return """
            Name: $name
            Breed: ${breed.javaClass.simpleName}
            
            VALUE // BREED BONUS // MODIFIER
            
            Strength: ${attributes.strength} (+${breed.getStrength()}) (+${AttributesModifier.calculateAttributeModifier(attributes.strength)})
            Dexterity: ${attributes.dexterity} (+${breed.getDexterity()}) (+${AttributesModifier.calculateAttributeModifier(attributes.dexterity)})
            Constitution: ${attributes.constitution} (+${breed.getConstitution()}) (+${AttributesModifier.calculateAttributeModifier(attributes.constitution)})
            Intelligence: ${attributes.intelligence} (+${breed.getIntelligence()}) (+${AttributesModifier.calculateAttributeModifier(attributes.intelligence)})
            Wisdom: ${attributes.wisdom} (+${breed.getWisdom()}) (+${AttributesModifier.calculateAttributeModifier(attributes.wisdom)})
            Charisma: ${attributes.charisma} (+${breed.getCharisma()}) (+${AttributesModifier.calculateAttributeModifier(attributes.charisma)})
        """.trimIndent()
    }
}