package com.clean.code.functions;

public class AbstractionLevel {


    public String rentalsSummary(String name, Double totalCharge) {
        SummaryReport summary = new SummaryReport();

        summary.add(reportHeader(name));
        summary.add(reportBody());
        summary.add(reportFooter(totalCharge));

        return summary.asString();
    }

    private String reportFooter(Double totalCharge) {
        return "Amount owed is " + totalCharge + "\n";
    }

    private String reportHeader(String name) {
        return "Rental Record for " + name + "\n";
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
