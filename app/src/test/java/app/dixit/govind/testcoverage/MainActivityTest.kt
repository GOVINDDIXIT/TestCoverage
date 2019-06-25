package app.dixit.govind.testcoverage

import org.junit.Assert.*
import org.junit.Test

class MainActivityTest {

    private var mainActivity= MainActivity()

    @Test
    fun checkValidMailAddress(){
        assertTrue(mainActivity.isValidMail("abc@gmail.com"))
    }

    @Test
    fun checkInValidMailAddress(){
        assertFalse(mainActivity.isValidMail("gmail.com"))
    }

}