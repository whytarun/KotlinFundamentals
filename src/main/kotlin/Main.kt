import java.util.Date

fun main(args: Array<String>) {
    println("Hello World!")
   val sp = Sample()
}

class Sample{
    // define variable which can hold anything
    fun f1(){
        var myData :Any =10
        myData ="string"
        myData = Date.parse("29-10-22")
    }

    // define a variable which can hold function
    fun f2(){
        val fn :(Int,Int) -> Unit = fun(a :Int,b :Int){}
        val lambda :(String,Date) -> Int   = {str,dt -> 10}
        val myFn =::sum
    }

    fun sum(a :Int, b:Int) :Int{
        return a+b
    }


    // declare a function which accepts function as a parameter

    fun f3(){
        fun myFn(fn:(a:Int, b:Int)->Int){

        }
    }

    // declare a function which returns another function which returns current data


}