package com.codeup.adlister.controllers;

import org.mindrot.jbcrypt.BCrypt;

public class HashTest {
    public static void main(String[] args) {
//Hashing Passwords
        String password = "password123";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(hash);
// Output: $2a$10$TbjLzPRB1MBIQAQbFsmANOumLP0oOEU1b.MvZFkeqIG0D8RqzFbIq

//check password
        boolean passwordsMatch = BCrypt.checkpw("mypassword", hash);
        System.out.println(passwordsMatch); // false

        passwordsMatch = BCrypt.checkpw("password123", hash);
        System.out.println(passwordsMatch); // true
    }
}
