package dungeons_n_kotlin.interfaces.races

import dungeons_n_kotlin.interfaces.attributes.AttributesBonus

interface Race {
    var name: String
    var attributesBonus: AttributesBonus?
}