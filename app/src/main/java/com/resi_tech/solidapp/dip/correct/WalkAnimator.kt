package com.resi_tech.solidapp.dip.correct

/**
 * This class follows the Dependency Inversion Principle
 * because it is not directly dependent on the Human or Horse classes.
 */
class WalkAnimator {
  fun animateWalk(walkable: Walkable) {
    walkable.walk()
  }
}