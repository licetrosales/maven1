package de.neuefische;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NameSleifeTest {
    @Test
    void when_no_input_return_string(){
    //GIVEN

    String expected_result = "Lis";
    //WHEN
    String result1 = NameSleife.writename1();

    //THEN
    assertEquals(result1, expected_result);
}
}
