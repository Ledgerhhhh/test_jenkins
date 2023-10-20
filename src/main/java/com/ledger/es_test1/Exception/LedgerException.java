package com.ledger.es_test1.Exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class LedgerException extends RuntimeException{
    private String message;
    public LedgerException(String message) {
        this.message = message;
    }
}

