package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    Report reportService = new Report();

    public void generateReport(String type) {
        if (type.equals("expense")) {
            expenseReport();
        } else {
            taxReport();
        }
    }

    protected abstract Report expenseReport();
    protected abstract Report taxReport();

}
