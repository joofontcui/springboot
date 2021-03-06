package com.joofont.springboot.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author cui jun on 2018/11/4.
 * @version 1.0
 */
public class User implements Serializable {

    private Integer id ;

    private String name ;

    private Integer age ;

    private String password ;

    private String description ;

    private Integer amount;

    private Integer version;

    /**
     * 额外字段
     */
    private LocalDate createDate;

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", version=" + version +
                ", createDate=" + createDate +
                '}';
    }
}
