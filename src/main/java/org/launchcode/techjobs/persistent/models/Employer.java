package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location cannot be blank")
    @Size(min =3, max=200, message = "Location must be between 3 and 200 characters")
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }
}
