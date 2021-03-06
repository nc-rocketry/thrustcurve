package club.ncr.cayenne.auto;

import club.ncr.cayenne.FlightEvent;
import club.ncr.cayenne.FlyerRocket;
import club.ncr.cayenne.FlyerRecord;
import club.ncr.cayenne.Motor;
import club.ncr.cayenne.MotorMfg;
import org.apache.cayenne.CayenneDataObject;

import java.util.Date;
import java.util.List;

/**
 * Class _FlightLog was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlightLog extends CayenneDataObject {

    public static final String ALTITUDE_PROPERTY = "altitude";
    public static final String FLIGHT_DATE_PROPERTY = "flightDate";
    public static final String FLIGHT_NOTES_PROPERTY = "flightNotes";
    public static final String FLYER_ID_PROPERTY = "flyerId";
    public static final String FLYER_ROCKET_ID_PROPERTY = "flyerRocketId";
    public static final String LAUNCH_CONTROL_OFFICER_ID_PROPERTY = "launchControlOfficerId";
    public static final String LAUNCH_EVENT_ID_PROPERTY = "launchEventId";
    public static final String MOTOR_ID_PROPERTY = "motorId";
    public static final String MOTOR_MFG_ID_PROPERTY = "motorMfgId";
    public static final String MOTOR_NAME_ID_PROPERTY = "motorNameId";
    public static final String MOTOR_WEIGHT_PROPERTY = "motorWeight";
    public static final String FLYER_PROPERTY = "flyer";
    public static final String LAUNCH_EVENT_PROPERTY = "launchEvent";
    public static final String MOTOR_PROPERTY = "motor";
    public static final String MOTOR_MFG_PROPERTY = "motorMfg";
    public static final String ROCKET_PROPERTY = "rocket";

    public static final String ID_PK_COLUMN = "id";

    public void setAltitude(Integer altitude) {
        writeProperty(ALTITUDE_PROPERTY, altitude);
    }
    public Integer getAltitude() {
        return (Integer)readProperty(ALTITUDE_PROPERTY);
    }

    public void setFlightDate(Date flightDate) {
        writeProperty(FLIGHT_DATE_PROPERTY, flightDate);
    }
    public Date getFlightDate() {
        return (Date)readProperty(FLIGHT_DATE_PROPERTY);
    }

    public void setFlightNotes(String flightNotes) {
        writeProperty(FLIGHT_NOTES_PROPERTY, flightNotes);
    }
    public String getFlightNotes() {
        return (String)readProperty(FLIGHT_NOTES_PROPERTY);
    }

    public void setFlyerId(Integer flyerId) {
        writeProperty(FLYER_ID_PROPERTY, flyerId);
    }
    public Integer getFlyerId() {
        return (Integer)readProperty(FLYER_ID_PROPERTY);
    }

    public void setFlyerRocketId(Integer flyerRocketId) {
        writeProperty(FLYER_ROCKET_ID_PROPERTY, flyerRocketId);
    }
    public Integer getFlyerRocketId() {
        return (Integer)readProperty(FLYER_ROCKET_ID_PROPERTY);
    }

    public void setLaunchControlOfficerId(Integer launchControlOfficerId) {
        writeProperty(LAUNCH_CONTROL_OFFICER_ID_PROPERTY, launchControlOfficerId);
    }
    public Integer getLaunchControlOfficerId() {
        return (Integer)readProperty(LAUNCH_CONTROL_OFFICER_ID_PROPERTY);
    }

    public void setLaunchEventId(Integer launchEventId) {
        writeProperty(LAUNCH_EVENT_ID_PROPERTY, launchEventId);
    }
    public Integer getLaunchEventId() {
        return (Integer)readProperty(LAUNCH_EVENT_ID_PROPERTY);
    }

    public void setMotorId(Integer motorId) {
        writeProperty(MOTOR_ID_PROPERTY, motorId);
    }
    public Integer getMotorId() {
        return (Integer)readProperty(MOTOR_ID_PROPERTY);
    }

    public void setMotorMfgId(Integer motorMfgId) {
        writeProperty(MOTOR_MFG_ID_PROPERTY, motorMfgId);
    }
    public Integer getMotorMfgId() {
        return (Integer)readProperty(MOTOR_MFG_ID_PROPERTY);
    }

    public void setMotorNameId(Integer motorNameId) {
        writeProperty(MOTOR_NAME_ID_PROPERTY, motorNameId);
    }
    public Integer getMotorNameId() {
        return (Integer)readProperty(MOTOR_NAME_ID_PROPERTY);
    }

    public void setMotorWeight(Double motorWeight) {
        writeProperty(MOTOR_WEIGHT_PROPERTY, motorWeight);
    }
    public Double getMotorWeight() {
        return (Double)readProperty(MOTOR_WEIGHT_PROPERTY);
    }

    public void addToFlyer(FlyerRecord obj) {
        addToManyTarget(FLYER_PROPERTY, obj, true);
    }
    public void removeFromFlyer(FlyerRecord obj) {
        removeToManyTarget(FLYER_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<FlyerRecord> getFlyer() {
        return (List<FlyerRecord>)readProperty(FLYER_PROPERTY);
    }


    public void setLaunchEvent(FlightEvent launchEvent) {
        setToOneTarget(LAUNCH_EVENT_PROPERTY, launchEvent, true);
    }

    public FlightEvent getLaunchEvent() {
        return (FlightEvent)readProperty(LAUNCH_EVENT_PROPERTY);
    }


    public void setMotor(Motor motor) {
        setToOneTarget(MOTOR_PROPERTY, motor, true);
    }

    public Motor getMotor() {
        return (Motor)readProperty(MOTOR_PROPERTY);
    }


    public void setMotorMfg(MotorMfg motorMfg) {
        setToOneTarget(MOTOR_MFG_PROPERTY, motorMfg, true);
    }

    public MotorMfg getMotorMfg() {
        return (MotorMfg)readProperty(MOTOR_MFG_PROPERTY);
    }


    public void setRocket(FlyerRocket rocket) {
        setToOneTarget(ROCKET_PROPERTY, rocket, true);
    }

    public FlyerRocket getRocket() {
        return (FlyerRocket)readProperty(ROCKET_PROPERTY);
    }


}
