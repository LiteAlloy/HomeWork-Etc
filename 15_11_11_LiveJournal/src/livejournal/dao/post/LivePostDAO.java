
package livejournal.dao.post;

import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public interface LivePostDAO {
    
    public long addLivePost(LivePost post);
    public void uppdateLivePost(LivePost post);
    public void deleteLivePost(long postId);
    public LivePost getLivePost(long postId);
    public LiveUser getLiveUser(long postId);
}
