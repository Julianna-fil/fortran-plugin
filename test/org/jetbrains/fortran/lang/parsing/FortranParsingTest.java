package org.jetbrains.fortran.lang.parsing;

import org.jetbrains.fortran.test.FortranTestDataFixture;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@SuppressWarnings("all")
public class FortranParsingTest extends FortranBaseParsingTestCase {

    public void testPrintWrite() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("PrintWrite.f"));
    }

    public void testImplicit() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("Implicit.f"));
    }

    public void testParameterStatement() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("ParameterStatement.f"));
    }

    public void testVariables() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("Variables.f"));
    }

    public void testProgramWithoutName() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("ProgramWithoutName.f"));
    }

    public void testLabels() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("Labels.f"));
    }

    public void testFunction() throws Exception {
        doParsingTest(FortranTestDataFixture.navigationMetadata("Function.f"));
    }

}