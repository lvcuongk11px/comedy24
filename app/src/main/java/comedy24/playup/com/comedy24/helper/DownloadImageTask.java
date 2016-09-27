package comedy24.playup.com.comedy24.helper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.InputStream;

/**
 * Created by lequanghiep on 9/27/2016.
 */
public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    RelativeLayout relativeLayout;
    Resources resources;

    public DownloadImageTask(Resources resources, RelativeLayout relativeLayout) {
        this.relativeLayout = relativeLayout;
        this.resources = resources;
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return mIcon11;
    }

    protected void onPostExecute(Bitmap result) {
        Drawable ob = new BitmapDrawable(resources, result);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            relativeLayout.setBackground(ob);
        }
    }
}