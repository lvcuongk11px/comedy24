package comedy24.playup.com.comedy24.adapter;

import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import comedy24.playup.com.comedy24.object.ListViewVideoItem;
import comedy24.playup.com.comedy24.R;

/**
 * Created by lequanghiep on 9/15/2016.
 */
public class ListVideoItemAdapter extends BaseAdapter {

    private final Activity context;
    private final ListViewVideoItem[] listViewVideoItems;

    public ListVideoItemAdapter(Activity context, ListViewVideoItem[] listViewVideoItems) {
        this.context = context;
        this.listViewVideoItems = listViewVideoItems;
    }

    @Override
    public int getCount() {
        return listViewVideoItems.length;
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
        TextView textView = (TextView) view.findViewById(R.id.video_info);
        textView.setText(Html.fromHtml("<b>View:</b> " + listViewVideoItems[i].getView() + "</br>" +
                "<b>Time:</b> " + listViewVideoItems[i].getTime()));
        return view;
    }
}
