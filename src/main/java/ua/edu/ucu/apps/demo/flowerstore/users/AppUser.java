package ua.edu.ucu.apps.demo.flowerstore.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public abstract class AppUser {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private String email;

    private String dob;

    @Transient
    private int age;

    public AppUser(String email, String dob) {
        this.email = email;
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(LocalDate.parse(dob), LocalDate.now()).getYears();
    }
    public abstract void update(Status status);
}
