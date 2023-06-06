package ru.springHibernateCRUD.models;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "age")
    @Range(min = 1, max = 150, message = "введенный возраст человека должен быть от 0 до 150")
    private int age;
    @Column(name = "name")
    @NotEmpty(message = "введенное имя человека не должно быть пустым")
    @Size(min = 3, max = 150, message = "количество символов у имени человека от 3 до 150")
    private String name;
    @Column(name = "email")
    @NotEmpty(message = "введенный почтовый адрес не должно быть пустым")
    @Email(message = "введенный почтовый адрес не валидный")
    private String email;
    @Column(name = "address")
    @NotEmpty(message = "адрес человека не должно быть пустым")
    @Size(min = 3, max = 150, message = "количество символов в адресе человека от 3 до 150")
    private String address;

    public Person() {
    }

    public Person(int age, String name, String email, String address) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
