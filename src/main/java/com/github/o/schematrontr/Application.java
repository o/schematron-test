package com.github.o.schematrontr;

import com.helger.commons.io.resource.ClassPathResource;
import com.helger.schematron.pure.SchematronResourcePure;

public class Application
{

  public static void main (final String [] args)
  {
    new SchematronResourcePure (new ClassPathResource ("schematron/UBL-TR_Main_Schematron.xml")).isValidSchematron ();
  }

}
