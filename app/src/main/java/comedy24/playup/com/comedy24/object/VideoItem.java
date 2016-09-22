package comedy24.playup.com.comedy24.object;

/**
 * Created by lequanghiep on 9/15/2016.
 */
public class VideoItem {
    private int id;
    private String content_id;
    private String title;
    private String thumb;
    private String duration;
    private int views;
    private String publish_date;

    public VideoItem(int id, String content_id, String title, String thumb, String duration
            , int views, String publish_date) {
        this.id = id;
        this.content_id = content_id;
        this.thumb = thumb;
        this.views = views;
        this.duration = duration;
        this.title = title;
        this.publish_date = publish_date;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent_id() {
        return content_id;
    }

    public void setContent_id(String content_id) {
        this.content_id = content_id;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }
}
