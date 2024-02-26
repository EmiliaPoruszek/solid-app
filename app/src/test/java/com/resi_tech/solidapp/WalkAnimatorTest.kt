package com.resi_tech.solidapp

import com.resi_tech.solidapp.dip.correct.Horse
import com.resi_tech.solidapp.dip.correct.Human
import com.resi_tech.solidapp.dip.correct.WalkAnimator
import com.resi_tech.solidapp.dip.correct.Walkable
import com.resi_tech.solidapp.dip.correct.Zebra
import org.junit.Test
import org.mockito.Mockito

class WalkAnimatorTest {

  @Test
  fun `WalkingAnimator is reusable, because we applied DIP`() {
    val horse = Horse()
    val zebra = Zebra()
    val human = Human()
    val walkables = listOf(horse, zebra, human)
    val walkAnimator = WalkAnimator()
    // WalkAnimator user (programmer) can reuse the same instance on different objects
    walkables.forEach { walkable ->
      walkAnimator.animateWalk(walkable)
    }
    assert(true)
  }

  @Test
  fun `WalkingAnimator actually calls walk() method one time`() {
    val mock = Mockito.mock(Walkable::class.java)
    val walkAnimator = WalkAnimator()
    walkAnimator.animateWalk(mock)
    Mockito.verify(mock, Mockito.times(1)).walk()
  }
}