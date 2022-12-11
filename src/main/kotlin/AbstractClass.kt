fun main(){

val test =Circle()
    test.area()
}

/*
    abstract class are in-complete class which are completed by child class
    abstract methods are declared inside abstract class only & exist without any body
    we cannot make the instance of abstract class
 */

abstract class Shape{
    abstract fun area() : Double
}

class Circle :Shape() {
    // abstract method are completed in child classes
    override fun area(): Double {
        return  0.0
    }

}