package dungeons_n_kotlin

import dungeons_n_kotlin.classes.attributes.Attributes
import dungeons_n_kotlin.classes.breeds.*
import dungeons_n_kotlin.classes.entities.Character
import dungeons_n_kotlin.classes.modifiers.AttributesModifier
import dungeons_n_kotlin.interfaces.breed.IBreed
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberProperties

@SpringBootApplication
class DungeonsNKotlinApplication

fun main(args: Array<String>) {
    runApplication<DungeonsNKotlinApplication>(*args)
    println()

    var isGameRunning = true

    do {
        println("MENU")
        println("[1] Create character")
        println("[2] Exit program")

        val option = readlnOrNull()
        println()

        when (option) {
            "1" -> {
                val c = createCharacter()
                c.listAttributes()
            }

            "2" -> isGameRunning = false
        }
    } while (isGameRunning)

    println("Program just finished.")
}

fun createCharacter(): Character {
    val character = Character()

    println("Enter the name for the character:")
    character.name = readln()
    println()

    val breed: IBreed

    do {
        println("Select the breed for the character:")

        val breeds = arrayOf(
            "Dragonborn",
            "DwarfHill",
            "DwarfMountain",
            "ElfDrow",
            "ElfForest",
            "ElfHigh",
            "Gnome",
            "GnomeForest",
            "GnomeRock",
            "HalfElf",
            "Halfling",
            "HalflingLightfoot",
            "HalflingStout",
            "HalfOrc",
            "Human",
            "Tiefling"
        )

        breeds.forEachIndexed { index, b ->
            println("[${index + 1}] - $b")
        }

        val breedInput = readln()
        println()

        when (breedInput) {
            "1" -> {
                breed = Dragonborn()
                break
            }

            "2" -> {
                breed = DwarfHill()
                break
            }

            "3" -> {
                breed = DwarfMountain()
                break
            }

            "4" -> {
                breed = ElfDrow()
                break
            }

            "5" -> {
                breed = ElfForest()
                break
            }

            "6" -> {
                breed = ElfHigh()
                break
            }

            "7" -> {
                breed = Gnome()
                break
            }

            "8" -> {
                breed = GnomeForest()
                break
            }

            "9" -> {
                breed = GnomeRock()
                break
            }

            "10" -> {
                breed = HalfElf()
                break
            }

            "11" -> {
                breed = Halfling()
                break
            }

            "12" -> {
                breed = HalflingLightfoot()
                break
            }

            "13" -> {
                breed = HalflingStout()
                break
            }

            "14" -> {
                breed = HalfOrc()
                break
            }

            "15" -> {
                breed = Human()
                break
            }

            "16" -> {
                breed = Tiefling()
                break
            }

            else -> continue
        }
    } while (true)

    character.breed = breed

    character.attributes = Attributes()

    var availablePoints = 27

    do {
        println("Distribute the points")
        println("Points available: $availablePoints")

        println(character.listAttributes())
        println()

        val attributesArray = arrayOf(
            "Strength",
            "Dexterity",
            "Constitution",
            "Intelligence",
            "Wisdom",
            "Charisma",
        )

        attributesArray.forEachIndexed { index, attribute ->
            println("[${index + 1}] - $attribute")
        }

        println("Enter to exit.")

        var selectedAttribute: String

        val attributeInput = readln().toInt()
        println()

        when (attributeInput) {
            1 -> {
                selectedAttribute = "strength"
            }

            2 -> {
                selectedAttribute = "dexterity"
            }

            3 -> {
                selectedAttribute = "constitution"
            }

            4 -> {
                selectedAttribute = "intelligence"
            }

            5 -> {
                selectedAttribute = "wisdom"
            }

            6 -> {
                selectedAttribute = "charisma"
            }

            else -> break
        }

        val property = Attributes::class.memberProperties.find { it.name == selectedAttribute }

        if (property != null) {
            @Suppress("UNCHECKED_CAST")
            val mutableProperty = property as? KMutableProperty1<Attributes, Int>

            if (mutableProperty != null) {
                println("Enter how many points you want to add in ${mutableProperty.name}:")
                val pointsToAdd = readln().toInt()
                println()

                val value = mutableProperty.get(character.attributes)

                if (value + pointsToAdd <= 15) {
                    if (pointsToAdd > 0) {
                        for (i in 1..pointsToAdd) {
                            val cost =
                                AttributesModifier.calculateAttributeCost(mutableProperty.get(character.attributes) + 1)

                            if (availablePoints > 0 && (availablePoints - cost) >= 0) {
                                availablePoints -= cost
                                mutableProperty.set(character.attributes, mutableProperty.get(character.attributes) + 1)
                            }
                        }
                    }
                } else {
                    println("You can't add more points to ${mutableProperty.name}")
                }
            }
        }
    } while (true)

    println(character.listAttributes())

    return character
}
