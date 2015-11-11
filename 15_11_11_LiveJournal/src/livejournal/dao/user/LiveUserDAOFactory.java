package livejournal.dao.user;

public class LiveUserDAOFactory {
    public static LiveUserDAO getLiveUserDAO(){
        return new LiveUserFakeDAO();
    }
}
