//package com.example.demo.models;
//
//import com.example.demo.enums.UserRoles;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Data
//@NoArgsConstructor
//@Entity
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String login;
//    private String password;
//
//    public User(String login, String password) {
//        this.login = login;
//        this.password = password;
//    }
//    @ElementCollection(targetClass = UserRoles.class, fetch = FetchType.EAGER)
//    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
//    private Set<UserRoles> roles;
//}
