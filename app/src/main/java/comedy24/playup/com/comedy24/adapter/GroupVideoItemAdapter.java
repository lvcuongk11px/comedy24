package comedy24.playup.com.comedy24.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import comedy24.playup.com.comedy24.object.GroupVideoItem;
import comedy24.playup.com.comedy24.R;

/**
 * Created by lequanghiep on 9/13/2016.
 */
public class GroupVideoItemAdapter extends BaseAdapter {
    private Context mContext;
    private GroupVideoItem[] listVideo;
    private static LayoutInflater inflater = null;

    public GroupVideoItemAdapter(FragmentActivity groupVideo, GroupVideoItem[] listVideo) {
        this.mContext = groupVideo;
        this.listVideo = listVideo;
        inflater = (LayoutInflater) this.mContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Toast.makeText(mContext, "You Load", Toast.LENGTH_LONG).show();
    }

    @Override
    public int getCount() {
        return listVideo.length;
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
        View rowView;
        rowView = inflater.inflate(R.layout.group_video_item, null);
        TextView tv = (TextView) rowView.findViewById(R.id.name);
        ImageView img = (ImageView) rowView.findViewById(R.id.imageView);

        tv.setText(listVideo[i].getName());
        img.setImageResource(listVideo[i].getImg());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });

        return rowView;
    }
}
