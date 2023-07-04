package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    // lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnAlert.setOnClickListener {
            val intent = Intent(this,Activity2::class.java)
            startActivity(intent)
        }

        binding.btnFragment1.setOnClickListener {
            replaceFragment(FirstFragment())
        }

        binding.btnFragment2.setOnClickListener {
            replaceFragment(SecondFragment())
        }

        // button=findViewById(R.id.btnIntentActivity)
        //val button: Button = findViewById(R.id.btnIntentActivity)
        binding.btnIntentActivity.setOnClickListener {
            val intent = Intent(this, IntentActivity::class.java)
            startActivity(intent)
        }

    }


    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragments, fragment)
        fragmentTransaction.commit()
    }
}

fun main() {

    println( sum(7, 8, 4, 5, 9, 2))
}

fun sum(vararg number: Int): Int {
    var ressult = 0
    for (numbers in number) {
        ressult += numbers
    }
    number.forEach { i-> println(i) }
    return ressult
}

fun getMessage(name: String = " ", message: String = sendText()) {

    println("Name = $name and Message = $message")

}

fun sendText(): String = "Some Text"


fun getMax(a: Int, b: Int, c: Int): Int {
    if (a > b) a else b
    if (a >= b && a >= c) {
        return a
    } else if (b >= a && b >= c) {
        return b
    } else {
        return c
    }

}
/*
fun sayHello(name : String, age:Int) {
    println("Hello, $name! Your Age is $age")
}

fun  getData(data : String){
    println("Your data is $data")
}

fun showMessage(){
    println("No internate Connection")
}*/

/* //nullable
 var text: String? = "Not null value"
 var text2 = ""
 if (text != null) {
     text2 = text
 } else {
    // text2 = "This value is null"
 }
 println(text2)*/


/* //Pattern
val row =4
var number =1

for (i in 1..row){
    for(j in 1..i){
        print("$number")
        ++number
    }
    println()
}

val r = 5

for (i in 1..r) {
    for (j in 1..i) {
        print("*")

    }
println()
}
*/


/* val nasa:Any = 20
 println("Println")
 when (nasa) {
    is Int -> println("Type is Int")
    is String -> println("Type is String")
     Float -> println("Type is Float")
 }

 val alarm = 7
 when (alarm) {
     in 1..10 -> println("The time is 1..10")
     12, 7, 8 -> {
         println("The time is $alarm")
     }

     else -> println("The time is $alarm")

 }*/
/* when  {

     alarm ==10 -> println("The time is 1..10")
     alarm==8 || alarm==7->
         println("The time is $alarm")


     else -> println("The time is $alarm")

 }*/


/* val isPlaying = false
 val score = 100
 val text = if (isPlaying || score == 100) "This is 1 Text" else "This is 2 Text"

 println("$text")*/


/*val isPlaying = true
 val score =100
 if (isPlaying && score==100)
 {
     println("Next level is open")
 }
 else
     println("Still at the same level ")*/

/*val nyNumbers = 67

if (nyNumbers==160)
{
    println("no is Greater than 160")
}
else if (nyNumbers<90)
{
    println("No is less than 90")
}*/
//Increase or Decrease
/* var d=0
 println("${d++}")
 println("${++d}")
 println("${d--}")
 println("${--d}")
 println("3+3*4 =${(3+3)*4}")
 println("ok")*/

/*var x=2
val y=78
var addition=x+y
addition =addition+2
println(addition)

addition-=2
println(addition)

addition+=2
println(addition)

addition*=2
println(addition)

addition/=2
println("subtraction = $addition")
*/


/* var number=78L
 val b:Byte=number.toByte()
 val f=8F
 val maxIntvalue1=true
 val maxIntvalue=Int.MAX_VALUE
 val minIntvalue1:Boolean=false
 val minIntvalue=Int.MIN_VALUE

  println("Max $maxIntvalue min $minIntvalue")
  number= 9223372036854775807*/





