package com.tts;
//3 private instance variables
public class Dog {
    public String name;
    public int age;
    public String type;

//empty constructor
    public Dog(){
        name = "default name";
        age = 0;
        type = "type";
    }
//uses only 2 of your 3 variables
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
// uses all 3 of your instance variables
    public Dog(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
//getter and setter for all 3 variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }


}
