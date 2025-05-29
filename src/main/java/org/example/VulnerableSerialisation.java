package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

public class VulnerableSerialisation {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Person person = new Person("Alice", 30);

            String jsonString = mapper.writeValueAsString(person);
            System.out.println("Serialized JSON: " + jsonString);

            Person deserializedPerson = mapper.readValue(jsonString, Person.class);
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
