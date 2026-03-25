fun main() {

    //standard Library Functions
    var result = Math.min(34, 89)
    println(result)

    add()
    student("Sylvia", 18)

}

//user defined functions - always outside the main function
fun add (){
    println(45+ 20)
}

fun student(name : String, age : Int){
    println("My name is $name. I am $age years old")

}

