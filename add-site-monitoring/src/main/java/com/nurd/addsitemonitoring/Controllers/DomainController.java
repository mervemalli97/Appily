package com.nurd.addsitemonitoring.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nurd.addsitemonitoring.DAO.DomainDAO;
import com.nurd.addsitemonitoring.Models.Domain;

@RestController
@RequestMapping("/domain")
public class DomainController {

    @Autowired
    DomainDAO domainDAO;

    @GetMapping
    public List<Domain> getAllDomains(){
        return domainDAO.findAll();
    }


}