package livejournal.dao.post;

import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public class LivePostFakeDAO implements LivePostDAO {

    @Override
    public long addLivePost(LivePost post) {
        System.out.println("add Live Post;");
        return 11;
    }

    @Override
    public void uppdateLivePost(LivePost post) {
        System.out.println("uppdate Live Post;");
    }

    @Override
    public void deleteLivePost(long postId) {
        System.out.println("delete Live Post: " + postId + ';');
    }

    @Override
    public LivePost getLivePost(long ig) {
        System.out.println("get Live Post;");
        return new LivePost();
    }

    @Override
    public LiveUser getLiveUser(long id) {
        System.out.println("get Live User;");
        return new LiveUser();
    }

    
}
