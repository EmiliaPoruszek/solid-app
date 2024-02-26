package com.resi_tech.solidapp

import com.resi_tech.solidapp.isp.correct.Flyable
import com.resi_tech.solidapp.isp.correct.Swimable
import com.resi_tech.solidapp.isp.correct.Walkable
import com.resi_tech.solidapp.isp.incorrect.Animatable
import com.resi_tech.solidapp.isp.incorrect.Duck as BadDuck
import com.resi_tech.solidapp.isp.correct.Duck as GoodDuck

import com.resi_tech.solidapp.isp.incorrect.Dog as BadDog
import com.resi_tech.solidapp.isp.correct.Dog as GoodDog

import com.resi_tech.solidapp.isp.incorrect.Pig as BadPig
import com.resi_tech.solidapp.isp.correct.Pig as GoodPig

import org.junit.Test

class ISPTest {

  private fun testAnimatable(animal: Animatable) {
    // after reading Animatable implementation programmer might expect all of this to work fine
    animal.walk()
    animal.fly()
    animal.swim()
  }

  @Test
  fun `iteration on Animatable objects might bring unexpected errors`() {
    val duck = BadDuck()
    val dog = BadDog()
    val pig = BadPig()
    val animals = listOf(duck, dog, pig)
    try {
      animals.forEach { testAnimatable(it) }
      assert(false)
    } catch (e: UnsupportedOperationException) {
      println(e.message)
      assert(true)
    }
  }

  private fun testAnimal(animal: Any) {
    // programmer might expect that not all of the animals have to be able to do all of the actions
    if (animal is Walkable) animal.walk()
    if (animal is Flyable) animal.fly()
    if (animal is Swimable) animal.swim()
  }

  @Test
  fun `iteration on animals should work fine with correct interfaces`() {
    val duck = GoodDuck()
    val dog = GoodDog()
    val pig = GoodPig()
    val animals = listOf(duck, dog, pig)
    // handling errors is not needed anymore
    animals.forEach { testAnimal(it) }
  }

}