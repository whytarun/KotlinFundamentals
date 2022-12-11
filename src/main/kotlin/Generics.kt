fun main(){
        // help of generic class we reuse the classes. for different types
        val container =Container<Int>(3)
            container.getValue()

        val container1 =Container<String>("Hello")
            container1.getValue()
    // varag gives you to pass multiple values....
        myValue(1,2,2,3,3,3,3)
}

class Container<T>(var data :T){
    fun getValue() :T{
        return data
    }

    fun setValue(value :T) {
        data =value
    }
}

class IntContainer(var data :Int){

    fun getValue(): Int{
        return data
    }

    fun setValue(value: Int){
        data = value
    }

}

fun myValue(vararg value: Int){
    value.forEach {

    }
}