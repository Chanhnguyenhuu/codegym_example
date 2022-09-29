package vn.codegym.case_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.case_1.model.Customer;
import vn.codegym.case_1.service.ICustomerService;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public String listCustomer(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/list";
    }

    @PostMapping("/delete")
    public ResponseEntity<Iterable<Customer>> delete(@RequestParam("id") String id) {
        if (customerService.findById(Long.parseLong(id)) == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        customerService.delete(Long.parseLong(id));
        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }
}
