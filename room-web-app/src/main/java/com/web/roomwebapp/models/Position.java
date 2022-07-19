package com.web.roomwebapp.models;

/**
 * @author Tolik
 * @project Spring
 * @created 7/19/2022 - 11:14 PM
 */
public enum Position {
    FRONT_DESK,
    SECURITY,
    HOUSEKEEPING;

    public String toString() {
        switch (this) {
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
            case HOUSEKEEPING:
                return "Housekeeping";
        }
        return "";
    }
}
