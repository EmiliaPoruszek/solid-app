package com.resi_tech.solidapp
import com.resi_tech.solidapp.lsp.Shape
import com.resi_tech.solidapp.lsp.incorrect.Rectangle as BadRectangle
import com.resi_tech.solidapp.lsp.correct.Rectangle as GoodRectangle
import org.junit.Test
import java.lang.AssertionError
import com.resi_tech.solidapp.lsp.incorrect.Square as BadSquare
import com.resi_tech.solidapp.lsp.correct.Square as GoodSquare

class LSPTest {

  private fun testBadRectangle(rectangle: BadRectangle) {
    rectangle.b = 10
    rectangle.a = 5
    assert(rectangle.getArea() == 50)
  }

  @Test
  fun `Bad Squere is not substitutable for Rectangle`() {
    val rectangle = BadRectangle()
    testBadRectangle(rectangle) // this is expected behavior of the function

    val squere = BadSquare()
    try {
      testBadRectangle(squere) // but the squere can't be used in this function as expected
      assert(false)
    } catch (e: AssertionError) {
      assert(true)
    }
  }

  @Test
  fun `iteration on BadRectangles might bring unexpected behaviour`() {
    val rectangles = arrayListOf<BadRectangle>(BadRectangle().apply { a = 10; b = 4 }, BadSquare().apply { a = 10 })
    for (rectangle in rectangles) {
      try {
        testBadRectangle(rectangle)
      } catch (e: AssertionError) {
        assert(true)
      }
    }
  }

  private fun testShape(shape: Shape, expectedArea: Int) {
    assert(shape.getArea() == expectedArea)
  }

  @Test
  fun `Good Squere is substitutable for Rectangle`() {
    val rectangle = GoodRectangle(5, 10)
    testShape(rectangle, 50) // this is expected behavior of the function

    val squere = GoodSquare(5)
    testShape(squere, 25) // this is expected behavior of the function
  }

  @Test
  fun `iteration on different shapes should be possible`() {
    val shapes = arrayListOf<Shape>(GoodRectangle(5, 10), GoodSquare(5))
    val expectedAreas = arrayListOf(50, 25)
    for (shape in shapes) {
      assert(expectedAreas[shapes.indexOf(shape)] == shape.getArea())
    }
  }

}