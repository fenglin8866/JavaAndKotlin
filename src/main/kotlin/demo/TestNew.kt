package demo

import java.lang.Thread.sleep
import java.lang.Thread.yield


/*suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }
    println("Hello")
}*/

/*fun main(args: Array<String>) {

    GlobalScope.launch {

    }*/


//    var f = 0
/*val mainThread= Thread.currentThread()
println("current = ${mainThread.name}")*/
/*val t1=thread { run() }
thread (name = "myThread"){ run() }*/
/*
 val t1 = thread {
     for (i in 0..20) {
         println("第${i}次执行-${Thread.currentThread().name}")
         f++
         sleep(100)
     }
 }
 t1.join(1000)
 println("${Thread.currentThread().name}  f = $f")*/
/*val t2 = thread(block=fun ():Unit{
    for (i in 0..20) {
        println("第${i}次执行-${Thread.currentThread().name}")
        f++
        sleep(100)
    }
})*/
/*add(10, 20) { a, b ->
    a + b
}*/


//}

fun run() {
    for (i in 0..9) {
        println("第${i}次执行-${Thread.currentThread().name}")
        val sleepTime = 1000L
        sleep(sleepTime)
        yield()
    }
    println("执行完成 ${Thread.currentThread().name}")
}

fun add(a: Int, b: Int, gz: (a: Int, b: Int) -> Int): Int {
    return gz(a, b)
}


/*fun main() = runBlocking<Unit> {
    launch {
        for (i in 0..9) {
            println("第${i}次执行-${Thread.currentThread().name}")
        }
        println("执行完成 ${Thread.currentThread().name}")
    }
}*/

const val ni: String = "android"

object TestNew {
    const val aa: Double = 0.0
    fun fa() {
//        aa="2.3"
        val a: Int = 0
        var b: String = ""
    }

    var r: String? = null
    val result = if (true) "及格" else "不及格"

    val score = try {
    val niq="\t jn \" "
        var t:Char='\u0041'
    } catch (e: Exception) {

    }


}