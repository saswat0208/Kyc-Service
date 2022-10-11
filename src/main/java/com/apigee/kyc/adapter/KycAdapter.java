package com.apigee.kyc.adapter;

import com.apigee.kyc.entity.KycEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.awt.*;

@Component
public class KycAdapter {


    public static KycEntity kycEntityObj;

    @PostConstruct
    void initialize()
    {
        kycEntityObj = new KycEntity();
        kycEntityObj.setAadharNumber("Sas1234");
        kycEntityObj.setDob("02/10/1995");
        kycEntityObj.setId(122254);
        kycEntityObj.setKycName("SaswatSingh");
        kycEntityObj.setPan("PSPS1234");
    }
    public static KycEntity findAll() {

        return kycEntityObj;
    }
}
