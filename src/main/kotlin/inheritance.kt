open class Animal{
    var age = 2
    var gender = "Male"
}

class Dog : Animal(){
    fun bark(){
        println("Woof")
    }
}

class Cat{
    fun meow(){
        println("Meow! Meow!")

    }
}

fun main() {
    var a = Animal()

    var b = Dog()

    var c = Cat()
}