import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void showCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showCurrentStationQuantity() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 15;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showOwerMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showLessMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.setCurrentStation(-3);
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showMiddleStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);

    }


    @Test
    public void nextZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void nextZeroStationQuantity() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void prewStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prew();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void prewStationQuantity() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.prew();
        int actual = radio.getCurrentStation();
        int expected = 19;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void prewZeroStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prew();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showMinCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showOwerMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolume(120);
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showLessMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-3);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void showIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showAnderIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showLessIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showDescreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 19;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showMaxDescreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void showMinDescreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
