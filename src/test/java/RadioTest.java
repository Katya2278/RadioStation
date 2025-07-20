import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

public class RadioTest {


    @Test
    public void AcceptableStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void LessThanTheAllowedStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void MoreThenAcceptableStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(16);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void BoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void BoundaryZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void BoundaryVaueIsPositive() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        Assertions.assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    public void MaximumLimitValue() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());


    }

    @Test
    public void MaximumLimitValuePositive() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentStation());


    }
    @Test
    public void MarginalAverage() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        Assertions.assertEquals(expected, radio.getCurrentStation());


    }
    @Test
    public void SwitchingStationMore(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
        int expected =7;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }
    @Test
    public void SwitchfromMinimum(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected =1;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }
    @Test
    public void Switchingstation(){
    Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.next();
    int expected =7;
        Assertions.assertEquals(expected,radio.getCurrentStation());
}


    @Test
    public void SwitchfromMinimumLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected =1;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }
    @Test
    public void SwitchingStationMinimal() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void SwitchStationfromMaximumLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected =9;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }
    @Test
    public void SwitchfromMaximumLimit(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected =0;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }
    @Test
    public void StationBoundaryVaue(){
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.next();
        int expected =8;
        Assertions.assertEquals(expected,radio.getCurrentStation());
    }
}