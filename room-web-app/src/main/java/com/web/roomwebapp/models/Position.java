package com.web.roomwebapp.models;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 11:14 PM
 */
public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
        }
        return "";
    }
}
