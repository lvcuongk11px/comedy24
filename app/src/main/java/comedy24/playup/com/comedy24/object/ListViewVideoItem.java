package comedy24.playup.com.comedy24.object;

/**
 * Created by lequanghiep on 9/15/2016.
 */
public class ListViewVideoItem {
    private int view;
    private String time;
    private String name;

    public ListViewVideoItem(int view, String time, String name) {
        this.view = view;
        this.time = time;
        this.name = name;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
