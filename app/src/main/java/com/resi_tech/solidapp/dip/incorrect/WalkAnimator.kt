package com.resi_tech.solidapp.dip.incorrect

/**
 * This class is not following the Dependency Inversion Principle
 * because it is directly dependent on the Horse class.
 * More animals would need separate WalkAnimators for them.
 */
class WalkAnimator() {
  fun animateWalk(horse: Horse) {
    horse.walk()
  }
}