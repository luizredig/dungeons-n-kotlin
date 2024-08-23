package dungeons_n_kotlin.classes.breeds

import dungeons_n_kotlin.interfaces.breed.IBreed

class Human : IBreed {
    override fun getStrength(): Int {
        return 1
    }

    override fun getDexterity(): Int {
        return 1
    }

    override fun getConstitution(): Int {
        return 1
    }

    override fun getIntelligence(): Int {
        return 1
    }

    override fun getWisdom(): Int {
        return 1
    }

    override fun getCharisma(): Int {
        return 1
    }

}