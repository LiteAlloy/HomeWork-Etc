package livejournal.entity;

public class LiveComment {
    
    private long commentId;
    private LiveUser liveUser;
    private LivePost livePost;
    private LiveComment parentComment;
    private String comment;

    public LiveUser getLiveUser() {
        return liveUser;
    }

    public void setLiveUser(LiveUser liveUser) {
        this.liveUser = liveUser;
    }
    

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public LivePost getLivePost() {
        return livePost;
    }

    public void setLivePost(LivePost livePost) {
        this.livePost = livePost;
    }

    public LiveComment getParentComment() {
        return parentComment;
    }

    public void setParentComment(LiveComment parentComment) {
        this.parentComment = parentComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
}
