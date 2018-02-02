import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PhoneDBTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void findAndPrint001() {
        PhoneDB phoneDB = new PhoneDB();
        phoneDB.findAndPrint("Петров П.П.");
        assertEquals("1. +8 800 2000 700\n", outContent.toString());
    }

    @Test
    public void findAndPrint002() {
        PhoneDB phoneDB = new PhoneDB();
        phoneDB.findAndPrint("Сидоров С.С.");
        assertEquals("1. +8 800 2000 800\n2. +8 800 2000 900\n3. +8 800 2000 000\n", outContent.toString());
    }

    @Test
    public void findAndPrint003() {
        PhoneDB phoneDB = new PhoneDB();
        phoneDB.findAndPrint("Иванов И.И.");
        assertEquals("1. +8 800 2000 500\n2. +8 800 200 600\n", outContent.toString());
    }

    @Test
    public void findAndPrint004() {
        PhoneDB phoneDB = new PhoneDB();
        phoneDB.findAndPrint("Ошибочная фамилия");
        assertEquals("Такого ФИО в БД нет\n", outContent.toString());
    }
}