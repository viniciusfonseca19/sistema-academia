package br.com.vini.sistema_academia.exception;

public class BadRequestException extends Exception{

    public BadRequestException(String message) {
        super(message);
    }
}