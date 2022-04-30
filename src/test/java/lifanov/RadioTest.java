package lifanov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testOverMinSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(3);

        int expected = 3;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testOverMaxSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testMaxNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.nextStation();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(4);

        rad.nextStation();

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownLimitPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prevStation();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpLimitPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);

        rad.prevStation();

        int expected = 8;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpOverLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.upVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testUpVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.upVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownOverLimitVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.downVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void testDownVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);

        rad.downVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}