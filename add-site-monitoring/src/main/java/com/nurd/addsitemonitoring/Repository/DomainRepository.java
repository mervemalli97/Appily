package com.nurd.addsitemonitoring.Repository;

import com.nurd.addsitemonitoring.Models.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface DomainRepository extends JpaRepository<Domain, Long> {

}