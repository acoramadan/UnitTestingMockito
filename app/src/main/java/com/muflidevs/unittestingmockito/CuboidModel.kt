package com.muflidevs.unittestingmockito

class CuboidModel {

    private var height = 0.0
    private var width = 0.0
    private var length = 0.0

    fun getVolume() : Double = width * length * height

    fun getSurfaceArea(): Double{
        val wh = width * height
        val hl = height * length
        val wl = width * length

        return 2 * (wl + hl + wh)
    }

    fun getCircumReference() : Double = 4 * (width + length + height)

    fun save(width : Double, height : Double, length : Double) {
        this.width = width
        this.height = height
        this.length = length
    }
}