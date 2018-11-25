package club.ncr.cayenne.auto;

import org.apache.cayenne.CayenneDataObject;

import java.util.Date;

/**
 * Class _LegacyLaunchLog was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _LegacyLaunchLog extends CayenneDataObject {

    public static final String ALTITUDE_PROPERTY = "altitude";
    public static final String CONTESTS_PROPERTY = "contests";
    public static final String CREATED_DATE_PROPERTY = "createdDate";
    public static final String EVENT_ID_PROPERTY = "eventId";
    public static final String FLIGHT_TIME_PROPERTY = "flightTime";
    public static final String FLYER_PROPERTY = "flyer";
    public static final String FLYER_ID_PROPERTY = "flyerId";
    public static final String LAUNCH_NO_PROPERTY = "launchNo";
    public static final String LCO_ID_PROPERTY = "lcoId";
    public static final String LCO_INITIALS_PROPERTY = "lcoInitials";
    public static final String MOTOR_PROPERTY = "motor";
    public static final String MOTOR_GROUP_PROPERTY = "motorGroup";
    public static final String MOTOR_GROUP_ID_PROPERTY = "motorGroupId";
    public static final String MOTOR_MAN_PROPERTY = "motorMan";
    public static final String NAR_NO_PROPERTY = "narNo";
    public static final String NOTES_PROPERTY = "notes";
    public static final String PAD_NO_PROPERTY = "padNo";
    public static final String POST_FLIGHT_PROPERTY = "postFlight";
    public static final String ROCKET_PROPERTY = "rocket";
    public static final String RSO_INITIALS_PROPERTY = "rsoInitials";

    public static final String ID_PK_COLUMN = "id";

    public void setAltitude(Long altitude) {
        writeProperty(ALTITUDE_PROPERTY, altitude);
    }
    public Long getAltitude() {
        return (Long)readProperty(ALTITUDE_PROPERTY);
    }

    public void setContests(String contests) {
        writeProperty(CONTESTS_PROPERTY, contests);
    }
    public String getContests() {
        return (String)readProperty(CONTESTS_PROPERTY);
    }

    public void setCreatedDate(Date createdDate) {
        writeProperty(CREATED_DATE_PROPERTY, createdDate);
    }
    public Date getCreatedDate() {
        return (Date)readProperty(CREATED_DATE_PROPERTY);
    }

    public void setEventId(Integer eventId) {
        writeProperty(EVENT_ID_PROPERTY, eventId);
    }
    public Integer getEventId() {
        return (Integer)readProperty(EVENT_ID_PROPERTY);
    }

    public void setFlightTime(Float flightTime) {
        writeProperty(FLIGHT_TIME_PROPERTY, flightTime);
    }
    public Float getFlightTime() {
        return (Float)readProperty(FLIGHT_TIME_PROPERTY);
    }

    public void setFlyer(String flyer) {
        writeProperty(FLYER_PROPERTY, flyer);
    }
    public String getFlyer() {
        return (String)readProperty(FLYER_PROPERTY);
    }

    public void setFlyerId(Integer flyerId) {
        writeProperty(FLYER_ID_PROPERTY, flyerId);
    }
    public Integer getFlyerId() {
        return (Integer)readProperty(FLYER_ID_PROPERTY);
    }

    public void setLaunchNo(Integer launchNo) {
        writeProperty(LAUNCH_NO_PROPERTY, launchNo);
    }
    public Integer getLaunchNo() {
        return (Integer)readProperty(LAUNCH_NO_PROPERTY);
    }

    public void setLcoId(Integer lcoId) {
        writeProperty(LCO_ID_PROPERTY, lcoId);
    }
    public Integer getLcoId() {
        return (Integer)readProperty(LCO_ID_PROPERTY);
    }

    public void setLcoInitials(String lcoInitials) {
        writeProperty(LCO_INITIALS_PROPERTY, lcoInitials);
    }
    public String getLcoInitials() {
        return (String)readProperty(LCO_INITIALS_PROPERTY);
    }

    public void setMotor(String motor) {
        writeProperty(MOTOR_PROPERTY, motor);
    }
    public String getMotor() {
        return (String)readProperty(MOTOR_PROPERTY);
    }

    public void setMotorGroup(String motorGroup) {
        writeProperty(MOTOR_GROUP_PROPERTY, motorGroup);
    }
    public String getMotorGroup() {
        return (String)readProperty(MOTOR_GROUP_PROPERTY);
    }

    public void setMotorGroupId(Byte motorGroupId) {
        writeProperty(MOTOR_GROUP_ID_PROPERTY, motorGroupId);
    }
    public Byte getMotorGroupId() {
        return (Byte)readProperty(MOTOR_GROUP_ID_PROPERTY);
    }

    public void setMotorMan(String motorMan) {
        writeProperty(MOTOR_MAN_PROPERTY, motorMan);
    }
    public String getMotorMan() {
        return (String)readProperty(MOTOR_MAN_PROPERTY);
    }

    public void setNarNo(Integer narNo) {
        writeProperty(NAR_NO_PROPERTY, narNo);
    }
    public Integer getNarNo() {
        return (Integer)readProperty(NAR_NO_PROPERTY);
    }

    public void setNotes(String notes) {
        writeProperty(NOTES_PROPERTY, notes);
    }
    public String getNotes() {
        return (String)readProperty(NOTES_PROPERTY);
    }

    public void setPadNo(Integer padNo) {
        writeProperty(PAD_NO_PROPERTY, padNo);
    }
    public Integer getPadNo() {
        return (Integer)readProperty(PAD_NO_PROPERTY);
    }

    public void setPostFlight(String postFlight) {
        writeProperty(POST_FLIGHT_PROPERTY, postFlight);
    }
    public String getPostFlight() {
        return (String)readProperty(POST_FLIGHT_PROPERTY);
    }

    public void setRocket(String rocket) {
        writeProperty(ROCKET_PROPERTY, rocket);
    }
    public String getRocket() {
        return (String)readProperty(ROCKET_PROPERTY);
    }

    public void setRsoInitials(String rsoInitials) {
        writeProperty(RSO_INITIALS_PROPERTY, rsoInitials);
    }
    public String getRsoInitials() {
        return (String)readProperty(RSO_INITIALS_PROPERTY);
    }

}
