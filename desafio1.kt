open class Animal {
    open val name: String

    constructor(name: String) {
        this.name = name
    }
    
    open fun makeSound(){
        println("Som do animal")
    }
}

class Dog : Animal {
    constructor(name: String) : super(name)
    
    override fun makeSound(){
        println("Woof!")
    }
}


class Cat : Animal {
    constructor(name: String) : super(name)
    
    override fun makeSound(){
        println("Meow!")
    }
}

fun animalSounds(Lista:Array<Animal>){
    for (i in Lista){
        i.makeSound()
    }
}

