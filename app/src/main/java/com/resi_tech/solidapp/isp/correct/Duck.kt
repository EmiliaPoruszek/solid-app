package com.resi_tech.solidapp.isp.correct

class Duck: Walkable, Swimable, Flyable {
  override fun walk() {
    println("Duck walks")
  }

  override fun swim() {
    println("Duck swims")
  }

  override fun fly() {
    println("Duck flies")
  }
}