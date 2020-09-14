package com.clean.code.functions;


public class Payment {

    public double getPayAmount(Condition condition) {
        if (condition == null) {
            return noPayment();
        }
        if (condition.isDead()) {
            return deadAmount();
        }
        if (condition.isSeparated()) {
            return separatedAmount();
        }
        if (condition.isRetired()) {
            return retiredAmount();
        }
        return normalPayAmount();
    }

    private double noPayment() {
        return 0;
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }

    private class Condition {
        public boolean isDead() {
            return false;
        }

        public boolean isSeparated() {
            return false;
        }

        public boolean isRetired() {
            return false;
        }
    }
}
