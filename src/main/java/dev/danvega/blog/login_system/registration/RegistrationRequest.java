package dev.danvega.blog.login_system.registration;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;

    // Konstruktor, Getter und andere Methoden
}
