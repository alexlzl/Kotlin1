package com.test

import kotlin.reflect.KClass

fun getKClass(o: Any): KClass<Any> = o.javaClass.kotlin