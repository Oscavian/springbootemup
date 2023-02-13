package com.oscavian.springbootemup.model;

import com.oscavian.springbootemup.repository.UserRepository;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "users")
public class User {

    public User() {

    }
    @Id
    @GeneratedValue
    @Column(name = "uuid")
    private UUID uuid;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private Integer elo;
}

