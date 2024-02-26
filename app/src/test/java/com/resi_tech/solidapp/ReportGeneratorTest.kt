package com.resi_tech.solidapp

import com.resi_tech.solidapp.ocp.correct.ReportGenerator
import com.resi_tech.solidapp.ocp.correct.ReportStrategy
import org.junit.Test
import org.mockito.Mockito

class ReportGeneratorTest {
  val reportGenerator = ReportGenerator()

  @Test
  fun `ReportGenerator work fine with any strategy`() {
    val mock = Mockito.mock(ReportStrategy::class.java)
    reportGenerator.generate(mock)
    Mockito.verify(mock, Mockito.times(1)).generate()
  }

  @Test
  fun `PDF generation should work`() {
    assert(reportGenerator.generate(ReportStrategy.PDFReport))
  }

  @Test
  fun `CSV generation should work`() {
    assert(reportGenerator.generate(ReportStrategy.CSVReport))
  }

  @Test
  fun `HTML generation should throw exception`() {
    try {
      reportGenerator.generate(ReportStrategy.HTMLReport)
    } catch (e: UnsupportedOperationException) {
      assert(true)
    }
  }
}