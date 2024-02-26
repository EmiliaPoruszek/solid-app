package com.resi_tech.solidapp.isp.correct

class Dog: Swimable, Walkable {
  override fun swim() {
    println("Dog swims")
  }

  override fun walk() {
    println("Dog walks")
  }
}