package com.example

fun main(args: Array<String>) {
    val white: Int = 0xffffff
    val black: Int = 0x000000
    val blue: Int = 0x0000ff
    val red: Int = 0xff0000
    val green: Int = 0x00ff00

    val color: Int = blue

    val colorString = when (color) {
        0xffffff -> "Белый цвет"
        0x000000 -> "Чёрный цвет"
        0x0000ff -> "Синий цвет"
        0xff0000 -> "Красный цвет"
        0x00ff00 -> "Зелёный цвет"
        else -> "Неверный цвет"
    }
    println(colorString)
}