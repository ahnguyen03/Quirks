package cmput301f17t12.quirks;

import android.net.Uri;

import java.util.Date;
import java.util.jar.Pack200;

/**
 * Created by thomas on 2017-10-21.
 */

public class Event implements Mappable{

    private Quirk quirk;
    private String comment;
    private Uri photoUri;
    private Date date;
    private Geolocation geolocation;

    public Event(Quirk quirk, String comment, Uri photoUri, Date date, Geolocation geolocation){
        this.quirk = quirk;
        this.comment = comment;
        this.photoUri = photoUri;
        this.date = date;
        this.geolocation = geolocation;
    }

    public Quirk getQuirk(){
        return quirk;
    }

    public void setQuirk(Quirk quirk){
        this.quirk = quirk;
    }

    public String getComment(){
        return comment;
    }

    public void setComment(String comment){
        this.comment = comment;
    }

    public Uri getPhotoUri(){
        return photoUri;
    }

    public void setPhotoUri(Uri photoUri){
        this.photoUri = photoUri;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Geolocation getGeolocation(){
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation){
        this.geolocation = geolocation;
    }

    public void deleteGeolocation(){
        geolocation = null;
    }

    public boolean isEquals(Event event){
        if (this.quirk==event.quirk && this.comment==event.comment && this.photoUri==event.photoUri
                && this.date==event.date && this.geolocation==event.geolocation) {
            return true;
        }
        return false;
    }

}
