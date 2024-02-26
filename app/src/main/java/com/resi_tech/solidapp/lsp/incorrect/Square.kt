package com.resi_tech.solidapp.lsp.incorrect

/**
 * This version of Squere class violates the Liskov Substitution Principle, because
 * it is not substitutable for its base class.
 */
class Square(): Rectangle() {
  override var a: Int = 0
  set (value) {
    field = value
    b = value
  }
}