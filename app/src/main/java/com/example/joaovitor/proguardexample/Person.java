package com.example.joaovitor.proguardexample;

/**
 * Created by joaovitor on 09/11/17.
 */

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " of age of" + getAge() + " years old" + divideByZero();
    }

    private String divideByZero() {
        int a = 12/0;
        return "olar" + a;
    }
}
