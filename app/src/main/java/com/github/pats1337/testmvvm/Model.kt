package com.github.pats1337.testmvvm

import java.util.*

class Model(private val textCallback: TextCallback) {

    private var timer: Timer? = null

    private var count = 0

    fun start() {
        timer?.cancel()
        timer = Timer()
        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                count++
                textCallback.updateText(count.toString())
            }
        }, 1000, 1000)
    }
}
