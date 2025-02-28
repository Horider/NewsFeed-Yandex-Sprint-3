package ru.yandex.practicum.news.feed.model;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private boolean active;

    public User() {}

    public User(Long id, String firstName, String lastName, int age, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.active = active;
    }

    private Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private boolean isActive() {
        return active;
    }

    private void setActive(boolean active) {
        this.active = active;
    }
}
