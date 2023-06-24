package com.mariem.ebankingbackend.exceptions;

public class BalanceNotSufficientException extends Throwable {
    public BalanceNotSufficientException(String msg) {
        super(msg);
    }
}
