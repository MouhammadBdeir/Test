package dev.danvega.blog.controller;

import dev.danvega.blog.model.Customer;
import dev.danvega.blog.repository.AuthorRepository;
import dev.danvega.blog.repository.PostRepository;
import dev.danvega.blog.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class PostController {

    private static final Logger LOG = LoggerFactory.getLogger(PostController.class);

    private final PostRepository posts;
    private final AuthorRepository authors;
    @Autowired
    private CustomerService customerService ;

    public PostController(PostRepository postRepository, AuthorRepository authorRepository) {
        this.posts = postRepository;
        this.authors = authorRepository;
    }
    @GetMapping("/index")
    public String showForm(Model model) {
        System.out.println("showForm sucess ");
        return "index";
    }
    @GetMapping("/projects")
    public String showProjects(Model model) {
        System.out.println("showProjects sucess ");
        return "Projekte";
    }
    @GetMapping("/QuS")
    public String showQuS(Model model) {
        System.out.println("showQuS sucess");
        return "QuS";
    }
    @GetMapping("/Auditierung")
    public String showAuditierung(Model model) {
        System.out.println("showAuditierung sucess");
        return "Auditierung";
    }
    @GetMapping("/Beratung")
    public String showBeratung(Model model) {
        System.out.println("showBeratung sucess");
        return "Beratung";
    }
    @GetMapping("/HuST")
    public String showHuST(Model model) {
        System.out.println("showHuST sucess");
        return "HuST";
    }
    @GetMapping("/Engineering")
    public String showEngineering(Model model) {
        System.out.println("showEngineering sucess");
        return "Engineering";
    }
    @GetMapping("/Programierung")
    public String showProgramierung(Model model) {
        System.out.println("showProgramierung sucess");
        return "Programierung";
    }
    @GetMapping("/Akustik")
    public String showAkustik(Model model) {
        System.out.println("showAkustik sucess");
        return "Akustik";
    }
    @GetMapping("/SHuK")
    public String showSHuK(Model model) {
        System.out.println("showSHuK sucess");
        return "SHuK";
    }
    @GetMapping("/Kontakt")
    public String showKontakt(Model model) {
        System.out.println("showKontakt sucess");
        return "Kontakt";
    }
    @GetMapping("/impressum")
    public String showImpressum(Model model) {
        System.out.println("showImpressum sucess");
        return "impressum";
    }
    @GetMapping("/referenzen")
    public String showReferenzen(Model model) {
        System.out.println("showReferenzen sucess");
        return "referenzen";
    }
    @GetMapping("/test")
    public String showTest(Model model) {
        System.out.println("showTest sucess");
        return "test";
    }
    @PostMapping("/submit-form")
    public String submitContactForm(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        try {
            customerService.saveCustomer(customer);
            redirectAttributes.addFlashAttribute("successMessage", "Your form has been successfully submitted!");
            // create the email message
           /* SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("sender@example.com");
            message.setTo("recipient@example.com");
            message.setSubject("Form Data");
            message.setText("Name: " + customer.getLastName() + "\nEmail: " + customer.getEmail() + "\nMessage: " + customer.getMessage());
            // send the email
            mailSender.send(message);*/
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while submitting the form. Please try again later.");
        }
        return "redirect:/index";
    }
}
