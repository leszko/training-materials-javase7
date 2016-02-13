package com.luxoft.java7se.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ProjectDatabase {
    private List<Project> projects = new ArrayList<>();

    public void saveProject(Project project) {
        projects.add(project);
    }

    public List<Project> getProjects() {
        return projects;
    }
}
