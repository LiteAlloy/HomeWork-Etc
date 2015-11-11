package livejournal.dao.comment;

import livejournal.entity.LiveComment;
import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public class LiveCommentFakeDAO implements LiveCommentDAO{

    @Override
    public long addLiveComment(LiveComment comment) {
        System.out.println("add Live Comment;");
        return 43;
    }

    @Override
    public void uppdateLiveCommen(long commentId) {
        System.out.println("uppdate Live Comment;");
    }

    @Override
    public void deleteLiveComment(long commentId) {
        System.out.println("delete Live Comment: " + commentId + ';');
    }

    @Override
    public LiveComment getLiveComment(long commentId) {
        System.out.println("get Live Comment;");
        return new LiveComment();
    }

    @Override
    public LivePost getLivePost(long commentId) {
        System.out.println("get Live Post Of Comment;");
        return new LivePost();
    }

    @Override
    public LiveUser getLiveUser(long commentId) {
        System.out.println("get Live User Of Comment;");
        return new LiveUser();
    }
    
}
