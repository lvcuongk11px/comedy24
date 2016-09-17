package comedy24.playup.com.comedy24.helper;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by lequanghiep on 9/15/2016.
 */
public class HttpRequestHelper extends AsyncTask<String, Void, String> {
    private String readStream(InputStream is) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int i = is.read();
            while (i != -1) {
                bo.write(i);
                i = is.read();
            }
            return bo.toString();
        } catch (IOException e) {
            return "";
        }
    }

    @Override
    protected String doInBackground(String... myUrl) {
        String json = "";
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(myUrl[0]);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            json = readStream(in);
        } catch (Exception ex) {
            return json;
        } finally {
            urlConnection.disconnect();
            return json;
        }
    }

    protected void onPostExecute(String result) {
        Log.i("avc", result);
    }
}
