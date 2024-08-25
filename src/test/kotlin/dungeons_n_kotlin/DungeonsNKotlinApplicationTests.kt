package dungeons_n_kotlin

import dungeons_n_kotlin.classes.attributes.Attributes
import dungeons_n_kotlin.classes.entities.Character
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
}
