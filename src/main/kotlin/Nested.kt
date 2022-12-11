fun main(){

    // we accessed outer class her
    val obj = Outer()
    obj.i

    // to call nested class
    val nestedObj =Outer.Internal()
    nestedObj.test()

    // to call Inner class
    val innerObj =Outer1().Internal1()
    innerObj.test()
    
}

class Outer {

    var i =0
    class Internal {
        fun test(){
            println(" Inside inner class")
        }
    }
}

class Outer1 {

    var i =0
    // to access outer class variable we use inner keyword to the nested classes
    inner class Internal1 {
        fun test(){
            println(" Inside inner class" +i)
        }
    }
}