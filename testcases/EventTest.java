public class EventTest {

  // Test comment
  public void testGetComment() {
    Event event = new Event("ate lettuce");
    assertEquals(event.getComment(), "ate lettuce");
  }

  public void testSetComment() {
    Event event = new Event("ate lettuce");
    event.setComment("Some new comment");
    assertEquals(event.getComment(), "Some new comment");
  }

  // Test geolocation
  public void testGetGeolocation() {
    Geolocation geolocation = new Geolocation(53.544389, -113.490927);
    Event event = new Event("ate lettuce", geolocation);
    Geolocation returnedGeolocation = event.getGeolocation();
    assertEquals(geolocation, returnedGeolocation);
  }

  public void testSetGeolocation() {
    Event event = new Event("ate lettuce");

    Geolocation geolocation1 = new Geolocation(53.544389, -113.490927);
    event.setGeolocation(geolocation1);
    Geolocation returnedGeolocation = event.getGeolocation();
    assertEquals(geolocation1, returnedGeolocation);

    Geolocation geolocation2 = new Geolocation(23.544389, 109.490927);
    event.setGeolocation(geolocation2);
    returnedGeolocation = event.getGeolocation();
    assertEquals(geolocation2, returnedGeolocation);

    Geolocation geolocation3 = new Geolocation(-44.544389, 109.490927);
    event.setGeolocation(geolocation3);
    returnedGeolocation = event.getGeolocation();
    assertEquals(geolocation3, returnedGeolocation);

    Geolocation geolocation3 = new Geolocation(-23.544389, -109.490927);
    event.setGeolocation(geolocation3);
    returnedGeolocation = event.getGeolocation();
    assertEquals(geolocation3, returnedGeolocation);
  }

  public void testDeleteGeolocation() {
    Event event = new Event("ate lettuce");

    Geolocation geolocation1 = new Geolocation(53.544389, -113.490927);
    event.setGeolocation(geolocation1);
    event.deleteGeolocation();
    Geolocation returnedGeolocation = event.getGeolocation();
    assertEquals(null, returnedGeolocation);
  }

  // Some tests for removing and adding photos?
  // Not really sure how we should do this yet.
}
