package study.learn.bookmarks.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import study.learn.bookmarks.Bookmark;

@Path("/bookmarks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookmarksResource {

    @GET
    public Bookmark hello() {
        Bookmark bookmark = new Bookmark();
        bookmark.setTitle("hello, world");
        return bookmark;
    }

    @POST
    public void add(Bookmark newBookmark) {
    }
}