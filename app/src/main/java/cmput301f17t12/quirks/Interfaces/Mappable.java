package cmput301f17t12.quirks.Interfaces;

import cmput301f17t12.quirks.Models.Geolocation;

/**
 * Created by thomas on 2017-10-21.
 */

public interface Mappable {
//    public Geolocation geolocation;

    public Geolocation getGeolocation();
    public void setGeolocation(Geolocation location);

}
