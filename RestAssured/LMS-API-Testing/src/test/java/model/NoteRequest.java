package model;

import java.util.Date;

public class NoteRequest {

    private String title;
    private String content;
    private String[] tags;
    private boolean isPinned;
    private String color;
    private String _id;
    private Date lastEdited;

    public NoteRequest(String title, String content, String[] tags,
                       boolean isPinned, String color,
                       String _id, Date lastEdited) {
        this.title = title;
        this.content = content;
        this.tags = tags;
        this.isPinned = isPinned;
        this.color = color;
        this._id = _id;
        this.lastEdited = lastEdited;
    }

    public String getTitle() {
    	return title;
    }
    public String getContent() {
    	return content; 
    }
    public String[] getTags() {
    	return tags;
    }
    public boolean isPinned() {
    	return isPinned;
    }
    public String getColor() {
    	return color;
    }
}