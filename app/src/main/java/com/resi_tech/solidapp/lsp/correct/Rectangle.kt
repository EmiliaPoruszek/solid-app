package com.resi_tech.solidapp.lsp.correct

import com.resi_tech.solidapp.lsp.Shape

class Rectangle(var a: Int, var b: Int): Shape() {
  override fun getArea(): Int {
    return a*b
  }
}