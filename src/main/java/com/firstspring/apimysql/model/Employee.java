package com.firstspring.apimysql.model;

import lombok.Data;

import javax.persistence.*;


    @Data
    @Entity
    @Table(name = "employees")
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name="FIRST_NAME")
        private String firstName;

        @Column(name="LAST_NAME")
        private String lastName;

        private String mail;

        private String password;

    }