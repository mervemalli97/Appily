package com.nurd.addsitemonitoring.Repository;

import com.nurd.addsitemonitoring.Models.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface DomainRepository extends JpaRepository<Domain, Long> {

}