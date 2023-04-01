package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio(0, 9);

        Assertions.assertEquals(0, rad.getMinRadioStation());
        Assertions.assertEquals(9, rad.getMaxRadioStation());
        Assertions.assertEquals(0, rad.getCurrentRadioStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio vol = new Radio(0, 9);

        vol.currentVolume = 50;

        int expected = 50;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio rad = new Radio(0, 9);

        rad.setToMaxRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio vol = new Radio(0, 9);

        vol.setToMaxVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(5);

        rad.nextRadioStation();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationIf9() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(9);

        rad.nextRadioStation();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();
    }

    @Test
    public void shouldSetSizeRadioStation() {
        Radio rad = new Radio(9);

        Assertions.assertEquals(0, rad.getMinRadioStation());
        Assertions.assertEquals(9, rad.getMaxRadioStation());
        Assertions.assertEquals(0, rad.getCurrentRadioStation());


    }

    @Test
    public void shouldNotSetRadioStationLowMin() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(6);

        rad.prevRadioStation();

        int expected = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationIf0() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(0);

        rad.prevRadioStation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationIf9() {
        Radio rad = new Radio(0, 9);
        rad.setCurrentRadioStation(9);

        rad.prevRadioStation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio vol = new Radio(0, 9);
        vol.setCurrentVolume(150);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLowMin() {
        Radio vol = new Radio(0, 9);
        vol.setCurrentVolume(-10);

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio vol = new Radio(0, 9);
        vol.setCurrentVolume(50);

        vol.increaseVolume();

        int expected = 51;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIf100() {
        Radio vol = new Radio(0, 9);
        vol.setCurrentVolume(100);

        vol.increaseVolume();

        int expected = 100;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolume() {
        Radio vol = new Radio(0, 9);
        vol.setCurrentVolume(51);

        vol.decreaseVolume();

        int expected = 50;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeIf0() {
        Radio vol = new Radio(0, 9);
        vol.setCurrentVolume(0);

        vol.decreaseVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

