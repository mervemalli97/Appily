package com.nurd.addsitemonitoring.DAO;

import java.util.List;

import com.nurd.addsitemonitoring.Models.Domain;
import com.nurd.addsitemonitoring.Repository.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainDAO {

    @Autowired
    DomainRepository domainRepository;

    public List<Domain> findAll(){
        return domainRepository.findAll();
    }


}