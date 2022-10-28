package ru.geekbrains.weatherapp

object ObjectForCopy {

    fun showCopy(): DataClass {

        return DataClass("фва", isAlive = false).copy(age = 777)
    }

}