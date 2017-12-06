package spring_framework.proselyte_net.lesson_12.annotations.required;

import org.springframework.beans.factory.annotation.Required;

public class Developer {
    private String name;
    private Integer experience;
    private String specialty;

    public Developer() {
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    @Required
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Required
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer Info:" +
                "\nName: " + name + ";\n" +
                "Experience: " + experience + " years;\n" +
                "Specialty: " + specialty + ".\n";
    }
}
