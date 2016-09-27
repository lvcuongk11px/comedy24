package comedy24.playup.com.comedy24.helper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import comedy24.playup.com.comedy24.object.CategoryItem;
import comedy24.playup.com.comedy24.object.VideoItem;

/**
 * Created by lequanghiep on 9/22/2016.
 */
public class ParseJsonHelper {
    public List<VideoItem> partJsonToListVideo(String json) throws JSONException {
        List<VideoItem> videoItems = new ArrayList<VideoItem>();
        if (json != "") {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray listVideo = jsonObject.getJSONObject("data").getJSONArray("videos");
            for (int i = 0; i < listVideo.length(); i++) {
                JSONObject item = listVideo.getJSONObject(i);
                videoItems.add(new VideoItem(
                        Integer.parseInt(item.optString("id").toString()),
                        item.optString("content_id"),
                        item.optString("title"),
                        item.optString("thumb"),
                        item.optString("duration"),
                        Integer.parseInt(item.optString("views").toString()),
                        item.optString("date")
                ));
            }
        }
        return videoItems;
    }

    public List<CategoryItem> partJsonToListCategory(String json) throws JSONException {
        List<CategoryItem> categoryItems = new ArrayList<CategoryItem>();
        if (json != "") {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray listCategory = jsonObject.getJSONObject("data").getJSONArray("categories");
            for (int i = 0; i < listCategory.length(); i++) {
                JSONObject item = listCategory.getJSONObject(i);
                categoryItems.add(new CategoryItem(
                        Integer.parseInt(item.optString("id").toString()),
                        item.optString("title"),
                        item.optString("thumb")
                ));
            }
        }
        return categoryItems;
    }
}
