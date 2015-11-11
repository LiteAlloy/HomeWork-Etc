package livejournal.dao.post;

public class LivePostDAOFactory {
    public static LivePostDAO getLivePostDAO(){
        return new LivePostFakeDAO();
    }
}
