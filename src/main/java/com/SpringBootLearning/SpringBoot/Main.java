package com.SpringBootLearning.SpringBoot;

public class Main {
    int Id ;
    String Name;
    String Competency;

    public Main(int id, String name, String competency) {
        Id = id;
        Name = name;
        Competency = competency;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompetency() {
        return Competency;
    }

    public void setCompetency(String competency) {
        Competency = competency;
    }
}
