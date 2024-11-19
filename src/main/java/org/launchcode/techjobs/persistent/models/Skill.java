package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.launchcode.techjobs.persistent.models.data.SkillRepository;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=300, message = "Description must not exceed 300 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }

    public Skill(){}

    public String getDescription() {
        return description;
    }


    public void setDescription (String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
