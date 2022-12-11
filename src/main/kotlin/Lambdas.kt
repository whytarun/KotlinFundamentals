import java.util.Date

fun main(){
    // storing function in a variable
    val fn =::sum
    val fn1:(Int , Int) ->Int = {a, b -> 10}
    val fn2 :(String, Date) ->Unit = fun (a:String,b:Date){}
    println(fn(1,2))
    println()
    myHighOrder(2,3,::sum)
    myHighOrder(2,3,{a,b ->10})
    val lamdas ={x :Int -> x*x}
    val lambdas1  = { "hello"}

}

fun sum(a:Int, b :Int) :Int{
    return a+b
}

val sum1 ={a :Int , b: Int -> a+b}

// higher order function which take input as function or return as a function

fun myHighOrder(a:Int, b:Int, hfn:(Int, Int) -> Int){
    val result = hfn(a,b)
    println(result)
}
