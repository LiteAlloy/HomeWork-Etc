package livejournal.dao.comment;

import livejournal.entity.LiveComment;
import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public interface LiveCommentDAO {
    
    public long addLiveComment(LiveComment comment);
    public void uppdateLiveCommen(long commentId);
    public void deleteLiveComment(long commentId);
    public LiveComment getLiveComment(long commentId);
    public LivePost getLivePost(long commentId);
    public LiveUser getLiveUser(long commentId);
    
}
