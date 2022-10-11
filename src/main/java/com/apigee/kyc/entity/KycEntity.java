package com.apigee.kyc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class KycEntity {

    private int id ;
    private String kycName;
    private String aadharNumber;
    private String panNumber;
    private String dob;

//    public KycEntity(){
////
////    }
    public void setId(int id){
        this.id = id;
    }
    public void setAadharNumber(String aadharNumber){
        this.aadharNumber = aadharNumber;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setKycName(String kycName){
        this.kycName = kycName;
    }
    public void setPan(String panNumber){
        this.panNumber = panNumber;
    }

}
