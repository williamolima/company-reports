package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    Report report = new Report();

    public void generateReport(String type) {
        if (type.equals("expense")) {
            report = expenseReport();
        } else {
            report = taxReport();
        }

        return report;
    }

    public abstract class Report {
        protected abstract ExpenseReport expenseReport();
        protected abstract TaxReport taxReport();
    }
    

}
