package lessons.lesson16.homework

abstract class Animal {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("\u001B[33mBark\u001B[0m")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("\u001B[36mMeow\u001B[0m")
    }
}

class Bird : Animal() {
    override fun makeSound() {
        println("\u001B[32mTweet\u001B[0m")
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Dog(),
        Cat(),
        Bird()
    )

    for (animal in animals) {
        animal.makeSound()
    }
}