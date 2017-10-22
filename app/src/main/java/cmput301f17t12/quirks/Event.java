package cmput301f17t12.quirks;

import android.net.Uri;

import java.util.Date;

/**
 * Created by thomas on 2017-10-21.
 */

public class Event implements Mappable{

    private Quirk quirk;
    private String comment;
    private Uri photoUri;
    private Date date;
    private Geolocation geolocation;


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

    public Geolocation getLocation(){
        return geolocation;
    }

    public void setLocation(Geolocation location){
        this.geolocation = location;
    }
}
