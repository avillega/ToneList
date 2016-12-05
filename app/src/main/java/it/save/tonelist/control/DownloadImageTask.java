package it.save.tonelist.control;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;

/**
 * Created by Andres Villegas on 2016-11-23.
 */

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    TrackSimple ts;

    public DownloadImageTask(TrackSimple ts) {
        this.ts = ts;
    }

    @Override
    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mIcon11;
    }

    protected void onPostExecute(Bitmap result) {
        ts.image = result;
    }
}
