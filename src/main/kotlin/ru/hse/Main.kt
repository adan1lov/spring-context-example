package ru.hse

import org.springframework.context.annotation.AnnotationConfigApplicationContext

class Main

fun main(args: Array<String>) {
    var context = AnnotationConfigApplicationContext("ru.hse")

    var fooBean = context.getBeansOfType(FooInterface::class.java)

    var barBean = context.getBean(Bar::class.java)
    println()
}

