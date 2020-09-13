package io.reflectoring.argumentresolver;

import lombok.Value;

public class User {
    public User(String name1, int age1) {
        this.name1 = name1;
        this.age1 = age1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name) {
        this.name1 = name;
    }

    public int getAge1() {
        return age1;
    }

    public void setAge1(int age) {
        this.age1 = age;
    }

    private String name1;
    private int age1;
}
