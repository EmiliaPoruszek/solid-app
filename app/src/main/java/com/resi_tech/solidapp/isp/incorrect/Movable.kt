package com.resi_tech.solidapp.isp.incorrect

/**
 * This interface is not following the Interface Segregation Principle
 * because it contains unnecessary methods for some of its implementors.
 */
interface Movable {
  fun fly()
  fun swim()
  fun walk()
}