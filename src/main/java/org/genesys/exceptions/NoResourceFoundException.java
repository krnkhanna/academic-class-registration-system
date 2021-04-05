package org.genesys.exceptions;

public class NoResourceFoundException extends RuntimeException {

    private String resourceId;

    private String resourceType;

    public NoResourceFoundException(String resourceId, String resourceType) {
        super(String.format("No resource found for id: %s and type: %s.", resourceId, resourceType));
        this.resourceId = resourceId;
        this.resourceType = resourceType;
    }
}
