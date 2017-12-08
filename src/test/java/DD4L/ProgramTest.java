/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DD4L;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;


public class ProgramTest {
  Sensors sensors;
  Parking parking;
  Map<String,Boolean> hash = new HashMap<String, Boolean>();

  @Test
  public void test1(){
	  sensors=new Sensors(0);
	  sensors.addName("Place 21");
	  assertEquals(sensors.getState("Place 21"), false);
	  sensors=null;
  }
  @Test
  public void test2() {
	  sensors = new Sensors(1);
	  hash = new HashMap<String, Boolean>();
	  hash.put("Place 1", false);
	  assertEquals(sensors.getChange(), hash);
	  sensors=null;
  }
  @Test
  public void test3() {
	  sensors = new Sensors(1);
	  hash = new HashMap<String, Boolean>();
	  hash.put("Place 1", true);
	  sensors.changeState("Place 1", true);
	  assertEquals(sensors.getChange(), hash);
	  sensors=null;
	  hash=null;
  }
  @Test
  public void test4() {
	  sensors = new Sensors(4);
	  hash = new HashMap<String, Boolean>();
	  hash.put("Place 1", false);
	  hash.put("Place 2", false);
	  hash.put("Place 3", false);
	  hash.put("Place 4", false);
	  assertEquals(sensors.getChange(), hash);
	  sensors=null;
	  hash=null;
  }
  @Test
  public void test5(){
	sensors = new Sensors(6);
	parking=new Parking();
	parking.update(sensors.getChange());
	assertEquals(parking.numberFreeSpaces(), 6);
	sensors=null;
	parking=null;
  }
  @Test
  public void test6(){
	parking=new Parking();
	parking.setCode("test");
	assertEquals(parking.checkCode(), true);
	parking=null;
  }
}
