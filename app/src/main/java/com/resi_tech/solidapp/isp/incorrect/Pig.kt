package com.resi_tech.solidapp.isp.incorrect

class Pig: Animatable {
  override fun fly() {
    // This is unnecessary code, which requires from the interface user (programmer) to handle it
    throw UnsupportedOperationException("Pig can't fly")
  }

  override fun swim() {
    // This is unnecessary code, which requires from the interface user (programmer) to handle it
    throw UnsupportedOperationException("Pig can't swim")
  }

  override fun walk() {
    println("Pig walks")
  }

}