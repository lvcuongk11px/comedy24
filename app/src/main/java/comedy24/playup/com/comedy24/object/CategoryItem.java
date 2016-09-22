package comedy24.playup.com.comedy24.object;

/**
 * Created by lequanghiep on 9/22/2016.
 */
public class CategoryItem {
    private int id;
    private String title;
    private String thumb;

    public CategoryItem(int id, String title, String thumb) {
        this.id = id;
        this.title = title;
        this.thumb = thumb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
