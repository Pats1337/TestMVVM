package com.github.pats1337.testmvvm

interface DataSource {

    fun saveInt(key: String, value: Int)

    fun getInt(key: String) : Int

}