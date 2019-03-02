package com.nurd.addsitemonitoring.Controllers;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nurd.addsitemonitoring.DAO.DomainDAO;
import com.nurd.addsitemonitoring.Models.Domain;

@RestController
@RequestMapping("/domain")
@CrossOrigin(origins = "http://localhost:4200")
public class DomainController {

    @Autowired
    DomainDAO domainDAO;

    @GetMapping
    public List<Domain> getAllDomains() {
        return domainDAO.findAll();
    }

    @GetMapping("/pro")
    public List<Domain> provisioning() {
        return domainDAO.findAll().stream()
                .filter(this::isPro)
                .collect(Collectors.toList());
    }

    private boolean isPro(Domain d) {
        return d.getStatus().equals("PROVISIONING");
    }

}