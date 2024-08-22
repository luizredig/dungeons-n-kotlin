package dungeons_n_kotlin.classes.entities

import dungeons_n_kotlin.interfaces.classes.Class
import dungeons_n_kotlin.interfaces.breed.Breed
import dungeons_n_kotlin.interfaces.subclasses.Subclass
import dungeons_n_kotlin.interfaces.subraces.Subrace

class Player(
    private var name: String,
    private var breed: Breed,
    private var subrace: Subrace?,
    private var `class`: Class,
    private var subclass: Subclass?
) {
    private var level: Int = 1;
}