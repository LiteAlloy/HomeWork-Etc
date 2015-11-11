package livejournal;

import live.logic.LiveJournalFacade;
import livejournal.entity.LiveComment;
import livejournal.entity.LivePost;
import livejournal.entity.LiveUser;

public class LiveJournal {

    public static void main(String[] args) {
        LiveJournalFacade facade = new LiveJournalFacade();

        System.out.println("*******user*******");
        LiveUser user = new LiveUser();
        user.setAlias("alias");
        user.setPassword("password");
        user.setEmail("123@mail.tu");

        long userId = facade.addLiveUser(user);
        user.setUserId(userId);
        facade.uppdateLiveUser(user);
        LiveUser userTmp = facade.getLiveUser(userId);
/*        if (userTmp.getUserId() != user.getUserId()) {
 *            System.out.println("error");
 *        }
 */        
        facade.findLiveUsers();
        facade.deleteLiveUser(userId);
        
        System.out.println("********post*******");

        LivePost post = new LivePost();

        long postId = facade.addLivePost(post);
        post.setPostId(postId);
        facade.uppdateLivePost(post);
        facade.deleteLivePost(postId);
        facade.getLivePostOfComment(postId);
        facade.getLiveUserOfPost(postId);
        
        System.out.println("*******comment*******");
        
        LiveComment comment = new  LiveComment();
        
        long commentId = facade.addLiveComment(comment);
        facade.uppdateLiveCommen(commentId);
        facade.deleteLiveComment(commentId);
        facade.getLiveComment(commentId);
        facade.getLivePostOfComment(commentId);
        facade.getLiveUserOfComment(commentId);

    }

}
