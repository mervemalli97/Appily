package com.nurd.addsitemonitoring.Models;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="domain")
@EntityListeners(AuditingEntityListener.class)

public class Domain {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private Long customer_id;

    @NotBlank
    private String status;

    private Long site_id;
    private String cname;
    private String arecord;
    private String origin_ip;
    private int cname_verified;
    private int arecord_verified;
    private String license_key;
    private Long partner_id;
    private Long malware_scan_settings_id;
    private Long ftp_settings_id;
    private int pp_free_license_usage;

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getStatus() { return status; }
    public Long getSite_id() {
        return site_id;
    }
    public String getCname() {
        return cname;
    }
    public String getArecord() {
        return arecord;
    }
    public String getOrigin_ip() {
        return origin_ip;
    }
    public int getCname_verified() {
        return cname_verified;
    }
    public int getArecord_verified() {
        return arecord_verified;
    }
    public String getLicense_key() {
        return license_key;
    }
    public Long getPartner_id() { return partner_id; }
    public Long getMalware_scan_settings_id() { return malware_scan_settings_id; }
    public Long getFtp_settings_id() { return ftp_settings_id; }
    public int getPp_free_license_usage() {
        return pp_free_license_usage;
    }

}