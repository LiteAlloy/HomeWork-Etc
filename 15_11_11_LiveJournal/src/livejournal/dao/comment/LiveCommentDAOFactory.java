package livejournal.dao.comment;

public class LiveCommentDAOFactory {
    
    public static LiveCommentDAO getLiveCommentDAO(){
        return new LiveCommentFakeDAO();
    } 
    
}
