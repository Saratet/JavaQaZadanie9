package ru.netology.smartHouse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Тестирование громкости радио

    @Test
    public void shouldSetVolumeWithinRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(27);
        int expected = 27;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(108);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeInRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(32);
        radio.increaseVolume();
        int expected = 33;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeInRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);
        radio.decreaseVolume();
        int expected = 44;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeOutOfRange() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //Тестирование радио с введенным количеством станций

    @Test
    public void shouldSetRadioStationWithinRangeWithPresetNumber() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(14);
        int expected = 14;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowRangeWithPresetNumber() {
        Radio radio = new Radio(12);

        radio.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveRangeWithPresetNumber() {
        Radio radio = new Radio(7);

        radio.setCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationWithPresetNumber() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationFromLastWithPresetNumber() {
        Radio radio = new Radio(12);

        int lastRadioStation = radio.getNumberOfRadioStations() - 1;
        radio.setCurrentRadioStation(lastRadioStation);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStationWithPresetNumber() {
        Radio radio = new Radio(28);

        radio.setCurrentRadioStation(25);
        radio.prev();
        int expected = 24;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStationFromFirstWithPresetNumber() {
        Radio radio = new Radio(21);

        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 20;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStationFromLastWithPresetNumber() {
        Radio radio = new Radio(17);

        int lastRadioStation = radio.getNumberOfRadioStations() - 1;
        radio.setCurrentRadioStation(lastRadioStation);
        radio.prev();
        int expected = 15;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //Тестирование радио с предустановленным количеством станций(10)

    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStationWithinRange() {

        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowRange() {

        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveRange() {

        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {

        radio.setCurrentRadioStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationFromLast() {

        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStation() {

        radio.setCurrentRadioStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStationFromFirst() {

        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPreviousRadioStationFromLast() {

        radio.setCurrentRadioStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}