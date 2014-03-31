package com.clean.code.functions;

public class AbstractionLevel {


    public String rentalsSummary(String name, Double totalCharge) {
        SummaryReport summary = new SummaryReport();

        summary.add("Rental Record for " + name + "\n");
        summary.add(reportBody());
        summary.add("Amount owed is " + totalCharge + "\n");

        return summary.asString();
    }


    private String reportBody() {
        return "some stuff";
    }

    public class SummaryReport {

        StringBuilder reportContent = new StringBuilder();

        public void add(String reportPart) {
            reportContent.append(reportPart);
        }
        public String asString() {
            return reportContent.toString();
        }
    }

}
