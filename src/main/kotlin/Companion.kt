
fun main(){

    Xyz.M1.f1() // to call f1 we need to call M1 object
    Xyz.f2()// directly we can the f2 method
}

class Xyz {

    public object M1 {
        fun f1(){
            println("M1 object")
        }
    }

    companion object{
        fun f2(){
            println("print f2")
        }
        @JvmStatic // this will tell the java class these are static method
        fun f3(){

        }
    }

}