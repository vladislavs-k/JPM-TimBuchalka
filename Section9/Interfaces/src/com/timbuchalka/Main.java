package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        ITelephone vladsPhone;
        vladsPhone = new DeskPhone(12345678);
        vladsPhone.powerOn();
        vladsPhone.callPhone(12345678);
        vladsPhone.answer();
        
    }
}
