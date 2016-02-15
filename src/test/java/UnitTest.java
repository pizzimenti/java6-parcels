import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

@Test
public void getVolume_333_27() {
  Parcel myParcel = new Parcel(3,3,3,1);
  assertEquals(27, myParcel.getVolume());
}

/*
@Test
public void giveChange_25cents_1quarter() {
  App testApp = new App();
  assertEquals("{Nickels=0, Dimes=0, Quarters=1, Pennies=0}", testApp.giveChange(25).toString());
}
*/

}
