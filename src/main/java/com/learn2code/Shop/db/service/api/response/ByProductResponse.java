package com.learn2code.Shop.db.service.api.response;

import org.springframework.lang.Nullable;

import java.util.Objects;

// This is response contains information about a purchase is successful or not
public class ByProductResponse {
    private boolean success;
    @Nullable
    private String errorMessage;

    public ByProductResponse(boolean success){
        this.success = success;
    }

    public ByProductResponse(boolean success, String errorMessage){
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    @Nullable
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ByProductResponse that = (ByProductResponse) o;
        return success == that.success && Objects.equals(errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, errorMessage);
    }
}
