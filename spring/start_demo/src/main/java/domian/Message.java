package domian;

/**
 * Created by Administrator on 2015/4/30.
 */
public class Message {
    private Integer id;
    private String address_url;
    private String title;
    private String img_url;
    private String pub_time;
    private String brief;
    private String comes_from;
    private String comes_url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress_url() {
        return address_url;
    }

    public void setAddress_url(String address_url) {
        this.address_url = address_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getPub_time() {
        return pub_time;
    }

    public void setPub_time(String pub_time) {
        this.pub_time = pub_time;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getComes_from() {
        return comes_from;
    }

    public void setComes_from(String comes_from) {
        this.comes_from = comes_from;
    }

    public String getComes_url() {
        return comes_url;
    }

    public void setComes_url(String comes_url) {
        this.comes_url = comes_url;
    }
}
