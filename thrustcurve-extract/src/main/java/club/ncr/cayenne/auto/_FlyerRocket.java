package club.ncr.cayenne.auto;

import club.ncr.cayenne.FlightLog;
import org.apache.cayenne.CayenneDataObject;

import java.util.Date;
import java.util.List;

/**
 * Class _FlyerRocket was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlyerRocket extends CayenneDataObject {

    public static final String FLYER_USER_ID_PROPERTY = "flyerUserId";
    public static final String MAIDEN_FLIGHT_DATE_PROPERTY = "maidenFlightDate";
    public static final String ROCKET_NAME_PROPERTY = "rocketName";
    public static final String ROCKET_WEIGHT_PROPERTY = "rocketWeight";
    public static final String USER_NOTES_PROPERTY = "userNotes";
    public static final String WEIGHT_UNITS_PROPERTY = "weightUnits";
    public static final String FLIGHT_LOGS_PROPERTY = "flightLogs";

    public static final String ID_PK_COLUMN = "id";

    public void setFlyerUserId(Integer flyerUserId) {
        writeProperty(FLYER_USER_ID_PROPERTY, flyerUserId);
    }
    public Integer getFlyerUserId() {
        return (Integer)readProperty(FLYER_USER_ID_PROPERTY);
    }

    public void setMaidenFlightDate(Date maidenFlightDate) {
        writeProperty(MAIDEN_FLIGHT_DATE_PROPERTY, maidenFlightDate);
    }
    public Date getMaidenFlightDate() {
        return (Date)readProperty(MAIDEN_FLIGHT_DATE_PROPERTY);
    }

    public void setRocketName(String rocketName) {
        writeProperty(ROCKET_NAME_PROPERTY, rocketName);
    }
    public String getRocketName() {
        return (String)readProperty(ROCKET_NAME_PROPERTY);
    }

    public void setRocketWeight(Float rocketWeight) {
        writeProperty(ROCKET_WEIGHT_PROPERTY, rocketWeight);
    }
    public Float getRocketWeight() {
        return (Float)readProperty(ROCKET_WEIGHT_PROPERTY);
    }

    public void setUserNotes(String userNotes) {
        writeProperty(USER_NOTES_PROPERTY, userNotes);
    }
    public String getUserNotes() {
        return (String)readProperty(USER_NOTES_PROPERTY);
    }

    public void setWeightUnits(String weightUnits) {
        writeProperty(WEIGHT_UNITS_PROPERTY, weightUnits);
    }
    public String getWeightUnits() {
        return (String)readProperty(WEIGHT_UNITS_PROPERTY);
    }

    public void addToFlightLogs(FlightLog obj) {
        addToManyTarget(FLIGHT_LOGS_PROPERTY, obj, true);
    }
    public void removeFromFlightLogs(FlightLog obj) {
        removeToManyTarget(FLIGHT_LOGS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FlightLog> getFlightLogs() {
        return (List<FlightLog>)readProperty(FLIGHT_LOGS_PROPERTY);
    }


}
