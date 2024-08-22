package dungeons_n_kotlin.interfaces.breed

import dungeons_n_kotlin.interfaces.attributes.AttributesBonus

interface Breed {
    var name: String
    var attributesBonus: AttributesBonus?
}