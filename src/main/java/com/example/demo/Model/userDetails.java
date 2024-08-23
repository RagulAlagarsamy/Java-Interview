package com.example.demo.Model;

//import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class userDetails {

    String id;
    @NonNull
    String userName;

    String userPassword;
    String emailId;

    Date dateofBirth;
}
