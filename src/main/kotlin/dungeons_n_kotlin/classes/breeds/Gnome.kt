package dungeons_n_kotlin.classes.breeds

import dungeons_n_kotlin.interfaces.breed.IBreed

class Gnome () : IBreed {
    override fun getStrength(): Int {
        return 0
    }

    override fun getDexterity(): Int {
        return 1
    }

    override fun getConstitution(): Int {
        return 0
    }

    override fun getIntelligence(): Int {
        return 0
    }

    override fun getWisdom(): Int {
        return 2
    }

    override fun getCharisma(): Int {
        return 0
    }

}