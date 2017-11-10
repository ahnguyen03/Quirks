package cmput301f17t12.quirks.Models;

import android.net.Uri;
import android.text.format.DateUtils;

import java.util.Date;

import cmput301f17t12.quirks.Interfaces.Mappable;
import cmput301f17t12.quirks.Interfaces.Newsable;

/**
 * Created by thomas on 2017-10-21.
 */

public class Event implements Mappable, Newsable {

    private Quirk quirk;
    private String comment;
    private Uri photoUri;
    private Date date;
    private Geolocation geolocation;

    // Event without URI and geolocation
    public Event(Quirk quirk, String comment, Date date){
        this.quirk = quirk;
        this.comment = comment;
        this.date = date;
    }

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

    // TODO: implement functions below
    @Override
    public String buildNewsHeader() {
        return "Hello World!";

    }

    @Override
    public String buildDate() {
        Date testDate = new Date(System.currentTimeMillis() - (4 * 60 * 60 * 1000));
        CharSequence relativeTimeSpan = DateUtils.getRelativeTimeSpanString(
                testDate.getTime(),
                System.currentTimeMillis(),
                DateUtils.SECOND_IN_MILLIS,
                DateUtils.FORMAT_ABBREV_RELATIVE);
        return relativeTimeSpan.toString();
    }

    @Override
    public String buildNewsDescription() {
        return "This news description is a test";
    }
}
