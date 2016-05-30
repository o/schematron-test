package com.github.o.schematrontr;

import com.helger.commons.io.resource.ClassPathResource;
import com.helger.schematron.xslt.SchematronResourceXSLT;

public class Application {


    public static void main(String[] args) {
        new SchematronResourceXSLT(new ClassPathResource("xslt/UBL-TR_Main_Schematron.xslt")).isValidSchematron();
    }

}
