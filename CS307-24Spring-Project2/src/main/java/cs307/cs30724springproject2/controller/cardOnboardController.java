package cs307.cs30724springproject2.controller;

import cs307.cs30724springproject2.service.cardOnboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/cardOnboard")
public class cardOnboardController {
    @Autowired
    private cardOnboardService cardOnboardService;

}
