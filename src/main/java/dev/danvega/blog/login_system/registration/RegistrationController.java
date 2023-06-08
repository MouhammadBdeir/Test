package dev.danvega.blog.login_system.registration;
/*
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping("/user")
    public String registerUser(@RequestBody RegistrationRequest request) {
        return registrationService.registerUSER(request);
    }
    @PostMapping("/admin")
    public String registerAdmin(@RequestBody RegistrationRequest request) {
        return registrationService.registerADMIN(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}*/