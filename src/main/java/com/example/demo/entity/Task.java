package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "taskse")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id",nullable = false, updatable = false)
    private UUID  id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", length =1000)
    private String description;
    @Column(name ="due_datr")
    private LocalDate duedate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TaskestaTUS state;
    @Column(name = "priorty",nullable = false)
    private Taskpriorty priorty;
    @Column(name ="created",updatable = false,nullable = false)
    private Instant created;
    @Column(name = "updated", nullable = false)
    private Instant updated;

    public Task(Object o, String title, String description, LocalDate localDate, TaskestaTUS taskestaTUS, Instant instant, Instant instant1) {

    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duedate=" + duedate +
                ", state=" + state +
                ", priorty=" + priorty +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
