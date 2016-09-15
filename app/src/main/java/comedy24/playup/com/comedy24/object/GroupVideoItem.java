package comedy24.playup.com.comedy24.object;

/**
 * Created by lequanghiep on 9/13/2016.
 */
public class GroupVideoItem {
    private String name;
    private int img;

    public GroupVideoItem(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
