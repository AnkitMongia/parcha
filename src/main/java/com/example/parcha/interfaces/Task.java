package com.example.parcha.interfaces;

// Implement a worker that will decrement the counter every day.
// Do a publish/Subscribe thing. The worker will publish events name when
// the counter goes to zero.
public interface Task {

    private String name;
    private Integer counter;
    private String description;
    private String comment;

}
