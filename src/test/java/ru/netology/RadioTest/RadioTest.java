package ru.netology.RadioTest;

import org.junit.jupiter.api.Test;
import ru.netilogy.Radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void validateChangeFields() {
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(4);
        assertEquals(4, radio.getCurrentRadioStation());
    }
    @Test
    public void afterInitialRadioStation() {
        assertEquals(9,radio.getMaxRadioStation());
        radio.setMaxRadioStation(6);
        assertEquals(5, radio.getMaxRadioStation());
    }

    @Test
    public void shouldTurnOffRadio() {
        radio.setOn(false);
        assertEquals(false, radio.isOn());

    }

    @Test
    public void changeOverLastRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void changeUnderInitialRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressNextStation();
        assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(6);
        radio.pressPrevStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void OverInitialRadioStation() {
        radio.setCurrentRadioStation(11);
        radio.getMaxRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void UnderInitialRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.getMinRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(-11);
        radio.getMinVolume();
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(4);
        radio.pressPlusVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(4);
        radio.pressMinusVolume();
        assertEquals(3, radio.getCurrentVolume());
    }
}


  

