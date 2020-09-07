package com.clean.code.functions;


public class Payment {

    public double getPayAmount(Condition condition) {
        if (condition != null) {
            double result;
            if (condition.isDead()) {
                result = deadAmount();
            } else {
                if (condition.isSeparated()) {
                    result = separatedAmount();
                } else {
                    if (condition.isRetired()) {
                        result = retiredAmount();
                    } else {
                        result = normalPayAmount();
                    }
                }
            }
            return result;
        } else {
            return noPayment();
        }
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
