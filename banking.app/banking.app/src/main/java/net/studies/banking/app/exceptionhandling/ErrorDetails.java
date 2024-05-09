package net.studies.banking.app.exceptionhandling;

import java.time.LocalDateTime;
public record ErrorDetails(LocalDateTime timestamp,
                           String message,
                           String details,
                           String errorCode) {


}
