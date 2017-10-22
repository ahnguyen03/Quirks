public class GeolocationTest {


 	 // Test set latitude (lat,lon)
  public void testSetLatitude() {
  	Geolocation geoLoc = new Geolocation(123.321,1234.4321);

  	geoLoc.setLatitude(2234.23);

  	Geolocation geoLoc1 = new Geolocation(2234.23,1234.4321);

    assertEquals(geoLoc,geoLoc1);
  }

  // Test set longitude (lat,lon)
  public void testSetLatitude() {
  	Geolocation geoLoc = new Geolocation(123.321,1234.4321);

  	geoLoc.setLongitude(2234.23);

  	Geolocation geoLoc1 = new Geolocation(123.321,2234.23);

    assertEquals(geoLoc,geoLoc1);
  }


  // Test get latitude (lat,lon)
  public void testGetLatitude() {
  	Geolocation geoLoc = new Geolocation(123.321,1234.4321);

  	double lat = geoLoc.getLatitude()

    assertEquals(lat, 123.321);
  }

  // Test get longitude (lat,lon)
  public void testGetLongitude() {
  	Geolocation geoLoc = new Geolocation(123.321,1234.4321);

  	double lat = geoLoc.getLongitude()

    assertEquals(lat, 1234.4321);
  }


}
