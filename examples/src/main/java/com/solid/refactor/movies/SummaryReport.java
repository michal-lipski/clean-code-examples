package com.solid.refactor.movies;

/**
* Created by mlip on 3/27/14.
*/
public class SummaryReport {

    StringBuilder reportContent = new StringBuilder();

    public void add(String reportPart) {
        reportContent.append(reportPart);
    }

    public String asString() {
        return reportContent.toString();
    }
}
