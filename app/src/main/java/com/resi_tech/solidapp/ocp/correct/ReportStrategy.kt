package com.resi_tech.solidapp.ocp.correct

sealed class ReportStrategy {
  abstract fun generate(): Boolean

  data object PDFReport : ReportStrategy() {
    override fun generate(): Boolean {
      println("Generating PDF report...")
      return true
    }
  }

  data object HTMLReport : ReportStrategy() {
    override fun generate(): Boolean {
      throw UnsupportedOperationException("Not implemented yet")
    }
  }

  data object CSVReport : ReportStrategy() {
    override fun generate(): Boolean {
      println("Generating CSV report...")
      return true
    }
  }
}