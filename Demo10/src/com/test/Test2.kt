package com.test

interface Named {
    val name: String
}

interface Person1 : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
        // 不必实现“name”
        override val firstName: String,
        override val lastName: String,
        val position: Person1
) : Person1