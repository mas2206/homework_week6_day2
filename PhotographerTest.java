import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer("Michael");
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  @Test
  public void collectionStartsEmpty() {
    assertEquals( 0, photographer.collectionSize() );
  }

  @Test
  public void canAddDigitalCamera() {
    photographer.addCamera(digitalCamera);
    assertEquals( 1, photographer.collectionSize() );
  }

  @Test
  public void canAddAnalogCamera() {
    photographer.addCamera(analogCamera);
    assertEquals( 1, photographer.collectionSize() );
  }

}