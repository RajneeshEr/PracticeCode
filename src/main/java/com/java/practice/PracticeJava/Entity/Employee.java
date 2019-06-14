package com.java.practice.PracticeJava.Entity;

import javax.persistence.*;
import java.util.Map;

/*Hash Map Serialization example*/
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "uiid")
    private Long id;

    @ElementCollection
    private Map<String,String> stringMap;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }
}
