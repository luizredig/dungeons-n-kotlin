package dungeons_n_kotlin

import dungeons_n_kotlin.classes.attributes.Attributes
import dungeons_n_kotlin.classes.entities.Character
import dungeons_n_kotlin.classes.modifiers.AttributesModifier
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
class DungeonsNKotlinApplicationTests {
    private val characterTester = Character()

    @Test
    fun `ensure that the minimum attribute value is 8`() {
        characterTester.attributes = Attributes()

        assertEquals(8, characterTester.attributes.strength)
        assertEquals(8, characterTester.attributes.dexterity)
        assertEquals(8, characterTester.attributes.constitution)
        assertEquals(8, characterTester.attributes.intelligence)
        assertEquals(8, characterTester.attributes.wisdom)
        assertEquals(8, characterTester.attributes.charisma)
    }

    @Test
    fun `ensure attribute costs calculation is correct`() {
        characterTester.attributes = Attributes()
        var attributeValue = characterTester.attributes.strength

        assertEquals(0, AttributesModifier.calculateAttributeCost(attributeValue))

        attributeValue += 1

        assertEquals(1, AttributesModifier.calculateAttributeCost(attributeValue))

        attributeValue += 1

        assertEquals(2, AttributesModifier.calculateAttributeCost(attributeValue))
    }

    @Test
    fun `ensure attribute modifiers calculation is correct`() {
        characterTester.attributes = Attributes()
        var attributeValue = characterTester.attributes.strength

        assertEquals(-1, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(-1, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(0, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(0, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(1, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(1, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(2, AttributesModifier.calculateAttributeModifier(attributeValue))

        attributeValue += 1

        assertEquals(2, AttributesModifier.calculateAttributeModifier(attributeValue))
    }

    @Test
    fun `ensure character's initial health points are 10`() {
        val hp = characterTester.healthPoints
        assertEquals(10, hp)
    }
}
