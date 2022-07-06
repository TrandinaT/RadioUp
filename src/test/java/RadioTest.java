import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void stationTest() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }
    @Test
    public void stationTest1() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @Test
    public void stationTest2() {
        Radio radio = new Radio();
        radio.setStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }
    @Test
    public void stationTest3() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }
    @Test
    public void stationTest4() {
        Radio radio = new Radio();
        radio.setStation(15);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }
    @Test
    public void stationTest5() {
        Radio radio = new Radio();
        radio.setStation(-3);
        radio.next();
        int expected = 1;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }
    @Test
    public void maxStation() {
        Radio radio = new Radio(15);
        radio.setStation(11);
        radio.next();
        int expected = 12;
        int actual = radio.getStation();
        assertEquals(expected, actual);
    }
    @Test
    public void soundTest() {
        Radio radio = new Radio();
        radio.setSound(6);
        radio.increaseSound();
        int expected = 7;
        int actual = radio.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void soundTest1() {
        Radio radio = new Radio();
        radio.setSound(10);
        radio.increaseSound();
        int expected = 0;
        int actual = radio.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void soundTest2() {
        Radio radio = new Radio();
        radio.setSound(0);
        radio.turnDownTheSound();
        int expected = 10;
        int actual = radio.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void soundTest3() {
        Radio radio = new Radio();
        radio.setSound(1);
        radio.turnDownTheSound();
        int expected = 0;
        int actual = radio.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void soundTest4() {
        Radio radio = new Radio();
        radio.setSound(54);
        radio.turnDownTheSound();
        int expected = 10;
        int actual = radio.getSound();
        assertEquals(expected, actual);
    }
    @Test
    public void soundTest5() {
        Radio radio = new Radio();
        radio.setSound(-9);
        radio.increaseSound();
        int expected = 1;
        int actual = radio.getSound();
        assertEquals(expected, actual);
    }

}
