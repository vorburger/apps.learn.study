package study.learn.bookmarks;

import java.util.List;
import java.net.URI;

public class Bookmark {

    // TODO does it also work with public fields and without getter & setter?

    public URI url;
    private String title;
    public List<String> tags;

    // TODO favicon image
    // TODO page preview image

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}