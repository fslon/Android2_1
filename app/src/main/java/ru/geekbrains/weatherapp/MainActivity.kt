package ru.geekbrains.weatherapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButton()

        showDataClass()

        showObject()

        cycleTest()

    }


    fun addButton() {
        val button: Button = findViewById(R.id.testButton)
        button.text = "test 1"
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "таыова", Toast.LENGTH_LONG).show()
        })
    }

    fun showDataClass() {

        var dataclass = DataClass("александр", 1, true)

        val linear = findViewById<LinearLayout>(R.id.linearLayout)

        val textView1 = TextView(this)
        textView1.text = "Имя: " + dataclass.name + "\n " +
                "Возраст: " + dataclass.age + "\n " +
                "Жив: " + dataclass.isAlive

        linear.addView(textView1)
    }


    fun showObject() {
        val objectForPrint = ObjectForCopy.showCopy()
        val linear = findViewById<LinearLayout>(R.id.linearLayout)

        val textView1 = TextView(this)
        textView1.text = "COPY:" + "\n" +
                "Имя: " + objectForPrint.name + "\n " +
                "Возраст: " + objectForPrint.age + "\n " +
                "Жив: " + objectForPrint.isAlive

        linear.addView(textView1)
    }

    private fun cycleTest(){

        val listPeoples = mutableListOf<DataClass>()

        for (i  in 1..20){
            listPeoples.add(DataClass("name"+i, isAlive = true, age = i))
            println("11111: " + listPeoples[i-1])
        }


        var result = if (listPeoples.contains(DataClass("name2", 2, true) ))"ЕСТЬ" else "НЕТ"
        println("22222: " + result)


        for (i in 1..listPeoples.size step 2) listPeoples[i].isAlive = false


        for (dataClass in listPeoples){
            println("33333: " + dataClass)
        }

    }


}
























