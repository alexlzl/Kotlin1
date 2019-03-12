package com.test

fun main(args: Array<String>) {
    var ites = listOf(MediaItem("e","f"),MediaItem("a", "b"), MediaItem("c", "d"))
    ites
            .sortedBy { it.title }
            .map { it.url }
            .forEach { println(it) }
    println(ites)
}

data class MediaItem(val title: String, val url: String)


