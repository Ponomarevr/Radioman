import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.Radio;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldIncreaseWave.csv")

    public void shouldIncreaseWave(int expected, int current) {

        Radio wave = new Radio(100);

        wave.setCurrentWave(current);
        wave.next();
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldIncreaseWaveIfDefault.csv")
    public void shouldIncreaseWaveIfDefault(int expected, int current) {

        Radio wave = new Radio();

        wave.setCurrentWave(current);
        wave.next();
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldDecreaseWave.csv")

    public void shouldDecreaseWave(int expected, int current) {

        Radio wave = new Radio(50);

        wave.setCurrentWave(current);
        wave.prev();
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldDecreaseWaveIfDefault.csv")

    public void shouldDecreaseWaveIfDefault(int expected, int current) {

        Radio wave = new Radio();

        wave.setCurrentWave(current);
        wave.prev();
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldSetCurrentWave.csv")

    public void shouldSetCurrentWave(int expected, int current) {

        Radio wave = new Radio(100);

        wave.setCurrentWave(current);
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldSetCurrentWaveIfDefault.csv")

    public void shouldSetCurrentWaveIfDefault(int expected, int current) {

        Radio wave = new Radio();

        wave.setCurrentWave(current);
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldIncreaseVolume.csv")

    public void shouldIncreaseVolume(int expected, int current) {

        Radio volume = new Radio();

        volume.setCurrentVolume(current);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldDecreaseVolume.csv")

    public void shouldDecreaseVolume(int expected, int current) {

        Radio volume = new Radio();

        volume.setCurrentVolume(current);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}
