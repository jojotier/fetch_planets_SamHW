package org.launchcode.codingevents.Models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class EventDetails extends AbstractEntity {
    @Size(max=500, message="Description too long. Please use 500 characters or less.")
    private String description;

    @NotBlank(message="Email is required.")
    @Email(message="Please format this like an actual email.")
    private String contactEmail;

    public EventDetails(String description, String contactEmail) {
        this.description = description;
        this.contactEmail = contactEmail;
    }

    public EventDetails(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

}
