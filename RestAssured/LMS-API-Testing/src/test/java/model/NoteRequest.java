package model;

import java.util.Date;

public class NoteRequest {
	
	String title;
	String content;
	String[] tags;
	boolean isPinned;
	String color;
	String _id;
	Date lastEdited;
	
	public NoteRequest(String title, String content, String[] tags, boolean isPinned, String color, String _id,
			Date lastEdited) {
		this.title=title;
		this.content=content;
		this.tags=tags;
		this.isPinned=isPinned;
		this.color=color;
		this._id=_id;
		this.lastEdited=lastEdited;
	}
	
	
}
