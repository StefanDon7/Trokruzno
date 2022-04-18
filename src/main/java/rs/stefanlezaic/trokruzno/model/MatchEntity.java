package rs.stefanlezaic.trokruzno.model;

public class MatchEntity {
    private long id;
    private String uuid;
    private ParticipantEntity participantHost;
    private ParticipantEntity participantGuest;
    private int hostGoals;
    private int guestGoals;
    private int hostShot;
    private int guestShot;

    public MatchEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public ParticipantEntity getParticipantHost() {
        return participantHost;
    }

    public void setParticipantHost(ParticipantEntity participantHost) {
        this.participantHost = participantHost;
    }

    public ParticipantEntity getParticipantGuest() {
        return participantGuest;
    }

    public void setParticipantGuest(ParticipantEntity participantGuest) {
        this.participantGuest = participantGuest;
    }

    public int getHostGoals() {
        return hostGoals;
    }

    public void setHostGoals(int hostGoals) {
        this.hostGoals = hostGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(int guestGoals) {
        this.guestGoals = guestGoals;
    }

    public int getHostShot() {
        return hostShot;
    }

    public void setHostShot(int hostShot) {
        this.hostShot = hostShot;
    }

    public int getGuestShot() {
        return guestShot;
    }

    public void setGuestShot(int guestShot) {
        this.guestShot = guestShot;
    }
}
