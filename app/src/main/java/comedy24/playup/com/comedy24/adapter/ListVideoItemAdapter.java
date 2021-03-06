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

import comedy24.playup.com.comedy24.R;
import comedy24.playup.com.comedy24.object.ListViewVideoItem;

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
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.video_item);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                relativeLayout.setBackground(context.getDrawable(R.drawable.girl));
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.video_info);
        textView.setText(Html.fromHtml("<b>View:</b> " + listViewVideoItems[i].getView() + "<br>" +
                "<b>Time:</b> " + listViewVideoItems[i].getTime()));
        return view;
    }
}
