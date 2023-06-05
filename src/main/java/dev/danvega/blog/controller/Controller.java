package dev.danvega.blog.controller;

import dev.danvega.blog.model.Customer;
import dev.danvega.blog.model.Feedback;
import dev.danvega.blog.service.CustomerService;
import dev.danvega.blog.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {


    private final  CustomerService customerService ;

    private final FeedbackService feedbackService;
    @Autowired
    public Controller(FeedbackService feedbackService, CustomerService customerService) {
        this.customerService=customerService;
        this.feedbackService=feedbackService;

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
    @GetMapping("/customer-list")
    public String showCustomerList(Model model) {

        List<Feedback> Feedbacks = feedbackService.getAllFeedbacks();

        model.addAttribute("feedbacks", Feedbacks);
        System.out.println("showProjects sucess ");
        return "customer-list";

    }

    @PostMapping("/submit-form")
    public String submitContactForm(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        try {
            customerService.saveCustomer(customer);
            redirectAttributes.addFlashAttribute("successMessage", "Your form has been successfully submitted!");
            System.out.println("pushed");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while submitting the form. Please try again later.");
            System.out.println("pushed field");
            e.getMessage();
        }
        return "redirect:/index";
    }
    @PostMapping("/feedback-form")
    public String submitFeedbackForm(@ModelAttribute Feedback feedback, RedirectAttributes redirectAttributes) {
        try {
            feedbackService.saveFeedback(feedback);
            redirectAttributes.addFlashAttribute("successMessage", "Your form has been successfully submitted!");
            System.out.println("pushed");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while submitting the form. Please try again later."+e.getMessage());
            System.out.println("not pushed");
            e.getMessage();
        }

        return "redirect:/index";
    }

}
