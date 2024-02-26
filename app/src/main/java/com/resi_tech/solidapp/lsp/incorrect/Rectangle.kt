package com.resi_tech.solidapp.lsp.incorrect

import com.resi_tech.solidapp.lsp.Shape

open class Rectangle: Shape() {
  open var a: Int = 0
  var b: Int = 0
  override fun getArea(): Int {
    return a * b
  }
}