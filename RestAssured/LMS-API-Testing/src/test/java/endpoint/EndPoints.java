package endpoint;

public class EndPoints {
	
	public static final String LOGIN="/user/login";
	public static final String ALLINSTITUTIONS="/getAll/institution";
	public static final String ALLROLES="/roles/getAll";
	public static final String ALLCOURSES="/courses-structure/getAll";
	public static final String CREATENOTE="/create/notes";
	public static final String GETALLNOTE="/getAll/notes";
	public static final String GET_NOTE_BY_ID="/getById/notes/{id}";
	public static final String UPDATE_NOTE="/update/notes/{id}";
	public static final String TOGGLE_NOTE="/toggle-pin/notes/{id}";
	public static final String DELETE_NOTE="/delete/notes/ById/{id}";
	
}
