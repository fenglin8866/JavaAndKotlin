package demo

class Employee {
    var ddd="xxx"


    var id = 0
    var job: String? = null
    var firstName = "a"
    var lastName = "b"
    var fullName: String
        get() = "$firstName.$lastName"
        set(value) {
            val name = value.split(".")
            firstName = name[0]
            lastName = name[1]
        }
    var salary: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }
//    lateinit var department: Department

//    var name:String by Delegate()

    val age: Int by lazy { id + 10 }

    fun aa(opr: String): (Int, Int) -> Int {
        fun add(a: Int, b: Int): Int {
            return a + b
        }

        return when (opr) {
            "+" -> ::add
            "-" -> {
                fun(a: Int, b: Int): Int {
                    return a - b
                }
            }
            "/" ->
                label@{ a, b ->
                    return@label 10
                }

            else -> { a, b -> a * b }

        }
    }

    fun sum(vararg num: Int): Int {
        var total: Int = 0
        num.forEach {
            //if(it==10) return -1
            if (it == 10) return@forEach
            total += it
        }
        return total
    }


}

val result7: () -> Int =
    {
        -> 10
    }


val result2: () -> Int = label@{
    val a = 1
    val b = 2
    return@label 10
    // a + b
}

val result4: () -> Int = label@{
    val a = 1
    val b = 2
    return@label 10
}


val result3 = fun(vararg num: Int): Int {
    var total: Int = 0
    num.forEach {
        //if(it==10) return -1
        if (it == 10) return@forEach
        total += it
    }
    return total
}

fun main(args: Array<String>) {
//    println("你好 :"+result3(intArrayOf(1,2,3,10,23)))
    println(result7())
}

/*
class Delegate{
    operator fun getValue(employee: Employee, property: KProperty<*>): String {
//        TODO("Not yet implemented")
        return property.name
    }

    operator fun setValue(employee: Employee, property: KProperty<*>, s: String) {
//        TODO("Not yet implemented")
        println(s)
    }
}*/





class Queue<T> {
    private var a: T? = null;
}


