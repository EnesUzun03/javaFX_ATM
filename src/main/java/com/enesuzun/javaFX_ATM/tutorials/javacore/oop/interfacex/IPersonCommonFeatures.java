package com.enesuzun.javaFX_ATM.tutorials.javacore.oop.interfacex;

public interface IPersonCommonFeatures {

    public void getUp();
    public void eat();
    public void goToSchool();
    public void comeFromSchool();

    // Gövdeli metot
    default void interfaceGovdeliMethod(){
        System.out.println("interface Govdeli Method");
    }
}
