/* CodingNomads (C)2024 */
package com.codingnomads.springsecurity.recipeapi.exceptions;

public class NoSuchReviewException extends Exception {

    public NoSuchReviewException(String message) {
        super(message);
    }

    public NoSuchReviewException() {}
}
