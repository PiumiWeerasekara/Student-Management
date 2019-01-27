package lk.ijse.studentmanagement.controller;

import lk.ijse.studentmanagement.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
}
