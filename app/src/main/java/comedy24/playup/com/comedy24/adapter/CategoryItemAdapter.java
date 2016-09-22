package comedy24.playup.com.comedy24.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import comedy24.playup.com.comedy24.object.CategoryItem;
import comedy24.playup.com.comedy24.R;

/**
 * Created by lequanghiep on 9/13/2016.
 */
public class CategoryItemAdapter extends BaseAdapter {
    private Context mContext;
    private List<CategoryItem> listCategory;
    private static LayoutInflater inflater = null;

    public CategoryItemAdapter(FragmentActivity groupVideo, List<CategoryItem> listCategory) {
        this.mContext = groupVideo;
        this.listCategory = listCategory;
        inflater = (LayoutInflater) this.mContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listCategory.size();
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

        tv.setText(listCategory.get(i).getTitle());
        img.setImageResource(R.mipmap.video_icon);

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
            }
        });

        return rowView;
    }
}
