package com.resi_tech.solidapp.isp.incorrect

class Dog: Animatable {
  override fun fly() {
    // This is unnecessary code, which requires from the interface user (programmer) to handle it
    throw UnsupportedOperationException("Dog can't fly")
  }

  override fun swim() {
    println("Dog swims")
  }

  override fun walk() {
    println("Dog walks")
  }

}