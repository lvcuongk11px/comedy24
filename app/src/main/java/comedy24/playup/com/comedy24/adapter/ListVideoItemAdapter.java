package comedy24.playup.com.comedy24.adapter;

import android.app.Activity;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import comedy24.playup.com.comedy24.R;
import comedy24.playup.com.comedy24.helper.DownloadImageTask;
import comedy24.playup.com.comedy24.object.VideoItem;

/**
 * Created by lequanghiep on 9/15/2016.
 */
public class ListVideoItemAdapter extends BaseAdapter {

    private final Activity context;
    private final List<VideoItem> videoItems;

    public ListVideoItemAdapter(Activity context, List<VideoItem> videoItems) {
        this.context = context;
        this.videoItems = videoItems;
    }

    @Override
    public int getCount() {
        return videoItems.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = context.getLayoutInflater();
        view = inflater.inflate(R.layout.list_video_item, null);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.video_item);
        new DownloadImageTask(view.getResources(), relativeLayout).execute(videoItems.get(i).getThumb());

        TextView videoInfo = (TextView) view.findViewById(R.id.video_info);
        TextView videoTitle = (TextView) view.findViewById(R.id.video_title);

        videoInfo.setText(Html.fromHtml("<b>View:</b> " + videoItems.get(i).getViews() + "<br>" +
                "<b>Time:</b> " + videoItems.get(i).getDuration() + "<br>" +
                "<b>Date:</b> " + videoItems.get(i).getPublish_date()));
        videoTitle.setText(videoItems.get(i).getTitle());

        return view;
    }
}
