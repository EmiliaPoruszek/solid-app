package com.resi_tech.solidapp.ocp.incorrect

/**
 * This class violates the Open/Closed Principle, because
 * it is not open for extension and closed for modification.
 */
class ReportGenerator {
  fun generateReport(reportType: String) {
    when (reportType) {
      "PDF" -> {
        // Generate PDF report
      }
      "CSV" -> {
        // Generate CSV report
      }
      "EXCEL" -> {
        // Generate Excel report
      }
      // New type requires modification here
    }
  }
}