package com.resi_tech.solidapp

import com.resi_tech.solidapp.ocp.correct.ReportGenerator
import com.resi_tech.solidapp.ocp.correct.ReportStrategy
import org.junit.Test

class ReportGeneratorTest {
  @Test
  fun `PDF generation should work`() {
    val reportGenerator = ReportGenerator()
    assert(reportGenerator.generate(ReportStrategy.PDFReport))
  }

  @Test
  fun `CSV generation should work`() {
    val reportGenerator = ReportGenerator()
    assert(reportGenerator.generate(ReportStrategy.CSVReport))
  }

  @Test
  fun `HTML generation should throw exception`() {
    val reportGenerator = ReportGenerator()
    try {
      reportGenerator.generate(ReportStrategy.HTMLReport)
    } catch (e: UnsupportedOperationException) {
      assert(true)
    }
  }
}