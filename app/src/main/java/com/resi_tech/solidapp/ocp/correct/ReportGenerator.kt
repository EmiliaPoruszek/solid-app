package com.resi_tech.solidapp.ocp.correct

/**
 * This version of ReportGenerator class is open for extension and closed for modification.
 * New type of report doesn't require modification here.
 */
class ReportGenerator {
  fun generate(report: ReportStrategy): Boolean {
    return report.generate()
  }
}