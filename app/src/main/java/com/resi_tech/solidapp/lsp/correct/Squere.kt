package com.resi_tech.solidapp.lsp.correct

import com.resi_tech.solidapp.lsp.Shape

/**
 * This version of Squere class is substitutable for its base class.
 * It does not violate the Liskov Substitution Principle.
 */
class Squere(var a: Int): Shape() {
  override fun getArea(): Int {
    return a*a
  }
}