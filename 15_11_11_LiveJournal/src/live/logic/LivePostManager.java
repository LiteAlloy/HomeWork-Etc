package live.logic;

import livejournal.dao.post.LivePostDAO;
import livejournal.dao.post.LivePostDAOFactory;
import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public class LivePostManager {
    
    private final LivePostDAO dao = LivePostDAOFactory.getLivePostDAO();
    
    public long addLivePost(LivePost post){
        return dao.addLivePost(post);
    }
    
    public void uppdateLivePost(LivePost post){
        dao.uppdateLivePost(post);
    }
    
    public void deleteLivePost(long postId){
        dao.deleteLivePost(postId);
    }
    
    public LivePost getLivePost(long postId){
        return dao.getLivePost(postId);
    }
    
    public LiveUser getLiveUser(long postId) {
        return dao.getLiveUser(postId);
    }
    
}
