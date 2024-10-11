package com.muflidevs.unittestingmockito

class MainViewModel(private val cuboidModel: CuboidModel) {

    fun getCircumReference() = cuboidModel.getCircumReference()
    fun getSurfaceArea() = cuboidModel.getSurfaceArea()
    fun getVolume() = cuboidModel.getVolume()

    fun save(w : Double, l : Double, h : Double) {
        cuboidModel.save(w,l,h)
    }
}