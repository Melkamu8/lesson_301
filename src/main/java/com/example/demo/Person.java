package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity

     public class Person {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String firtName;
        private String lastName;

        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }

        public String getFirtName() {
            return firtName;
        }

        public void setFirtName(String firtName) {
            this.firtName = firtName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

