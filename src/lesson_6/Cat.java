package lesson_6;

public class Cat {
    // field - поле класса
    private String name;
    private int age;
    private String breed;
    private String color;

    // constructor - конструктор
    public Cat(){
    }

    public Cat(String name){
        this.name = name;

    }
    public Cat (int age){
        this.age = age;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // геттеры и сеттеры

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
    public void printName(){
        System.out.println("My name is " + this.name);
    }

}
