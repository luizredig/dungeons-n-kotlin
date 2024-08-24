package dungeons_n_kotlin.classes.breeds

import dungeons_n_kotlin.interfaces.breed.IBreed

class Tiefling  : IBreed {
    override fun getStrength(): Int {
        return 0
    }

    override fun getDexterity(): Int {
        return 0
    }

    override fun getConstitution(): Int {
        return 0
    }

    override fun getIntelligence(): Int {
        return 1
    }

    override fun getWisdom(): Int {
        return 0
    }

    override fun getCharisma(): Int {
        return 2
    }

}