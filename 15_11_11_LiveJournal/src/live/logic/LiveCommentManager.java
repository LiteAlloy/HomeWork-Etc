package live.logic;

import livejournal.dao.comment.LiveCommentDAO;
import livejournal.dao.comment.LiveCommentDAOFactory;
import livejournal.entity.LiveComment;
import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public class LiveCommentManager {
    
    private final LiveCommentDAO dao = LiveCommentDAOFactory.getLiveCommentDAO();
    
    public long addLiveComment(LiveComment comment){
        return dao.addLiveComment(comment);
    }
    
    public void uppdateLiveCommen(long commentId){
        dao.uppdateLiveCommen(commentId);
    }
    
    public void deleteLiveComment(long commentId){
        dao.deleteLiveComment(commentId);
    }
    
    public LiveComment getLiveComment(long commentId) {
        return dao.getLiveComment(commentId);
    }
    
    public LivePost getLivePost (long commentId){
        return dao.getLivePost(commentId);
    }
    
    public LiveUser getLiveUser(long commentId) {
        return dao.getLiveUser(commentId);
    }
    
}
