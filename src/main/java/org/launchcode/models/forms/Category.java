package org.launchcode.models.forms;

/**
 * Created by LaunchCode
 */
public enum Category {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake");

    private final String name;

    Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
