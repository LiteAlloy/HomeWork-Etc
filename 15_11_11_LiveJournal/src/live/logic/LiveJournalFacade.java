
package live.logic;

import java.util.List;
import livejournal.entity.LiveComment;
import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public class LiveJournalFacade {
    
    private final LiveUserManager userManager;
    private final LivePostManager postManager;
    private final LiveCommentManager commentManager;
    
    public LiveJournalFacade(){
        userManager = new LiveUserManager();
        postManager = new LivePostManager();
        commentManager = new LiveCommentManager();
    }
    //пользователь
    public long addLiveUser(LiveUser user){
        return userManager.addLiveUser(user);
    }
    
    public void uppdateLiveUser(LiveUser user){
        userManager.uppdateLiveUser(user);
    }
    
    public void deleteLiveUser(long userId){
        userManager.deleteLiveUser(userId);
    }
    
    public LiveUser getLiveUser(long userId) {
        return userManager.getLiveUser(userId);
    }
    
    public List<LiveUser> findLiveUsers(){
        return userManager.findLiveUsers();
    }
    //пост
    public long addLivePost(LivePost post){
        return postManager.addLivePost(post);
    }
    
    public void uppdateLivePost(LivePost post){
        postManager.uppdateLivePost(post);
    }
    
    public void deleteLivePost(long postId){
        postManager.deleteLivePost(postId);
    }
    
    public LivePost getLivePost(long postId){
        return postManager.getLivePost(postId);
    }
    
    public LiveUser getLiveUserOfPost(long postId) {
        return postManager.getLiveUserOfPost(postId);
    }
    //комментарий
    
      
    public long addLiveComment(LiveComment comment){
        return commentManager.addLiveComment(comment);
    }
    
    public void uppdateLiveCommen(long commentId){
        commentManager.uppdateLiveCommen(commentId);
    }
    
    public void deleteLiveComment(long commentId){
        commentManager.deleteLiveComment(commentId);
    }
    
    public LiveComment getLiveComment(long commentId) {
        return commentManager.getLiveComment(commentId);
    }
    
    public LivePost getLivePostOfComment (long commentId){
        return commentManager.getLivePost(commentId);
    }
    
    public LiveUser getLiveUserOfComment(long commentId) {
        return commentManager.getLiveUser(commentId);
    }
    
}
