package com.test

import java.util.*
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.declaredMemberProperties

class AnnotationExpression(val obj: Any) {
    fun expression() {
        val clazz = obj::class
        clazz.declaredMemberProperties.forEach { prop ->
            val mutableProp = try {
                prop as KMutableProperty<*>
            } catch (e: Exception) {
                null
            } ?: return@forEach

            mutableProp.annotations.forEach { annotation ->
                val propClassName = mutableProp.returnType.toString().removePrefix("kotlin.")
                when (propClassName) {

                    "String" -> mutableProp.setter.call(obj,
                            (readProp(annotation as Value) as kotlin.String))
                    "Boolean" -> mutableProp.setter.call(obj,
                            (readProp(annotation as Value) as kotlin.String).toBoolean())
                }
            }
        }
    }
}

private fun readProp(value: Value): Any? {
    val prop = Properties()
    prop.load(AnnotationExpression::class.java.getResource("app.properties").openStream())
    return prop.get(value.value)
}

@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME) //这一行也可以省略
annotation class Value(val value: String)

class User {
    @Value(value = "name")
    lateinit var name: String

    @Value(value = "age")
    var age: Int = 0

    @Value(value = "money")
    var money: Double = 0.0

    @Value(value = "gender")
    var gender: Boolean = false

    override fun toString(): String {
        return "(name:$name; age:$age; money:$money; gender:${if (gender) "man" else "woman"})"
    }
}

fun main(args: Array<String>) {
    val user = User()

    AnnotationExpression(user).expression()

    println(user.toString())
}