package com.apigee.kyc.controller;


import com.apigee.kyc.adapter.KycAdapter;
import com.apigee.kyc.entity.KycEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@Validated
@RestController
@RequestMapping("/kyc")

public class kycController {

    @Autowired
    private KycAdapter kycAdapter;

    @GetMapping(value = "/getkyc")
    public ResponseEntity<KycEntity> getKyc(){
        return new ResponseEntity<>(KycAdapter.findAll(), HttpStatus.OK);
    }


}
