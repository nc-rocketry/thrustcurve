package club.ncr.cayenne.auto;

import club.ncr.cayenne.Motor;
import org.apache.cayenne.CayenneDataObject;

import java.util.List;

/**
 * Class _MotorMfg was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MotorMfg extends CayenneDataObject {

    public static final String ABBREVIATION_PROPERTY = "abbreviation";
    public static final String NAME_PROPERTY = "name";
    public static final String MOTORS_PROPERTY = "motors";

    public static final String ID_PK_COLUMN = "ID";

    public void setAbbreviation(String abbreviation) {
        writeProperty(ABBREVIATION_PROPERTY, abbreviation);
    }
    public String getAbbreviation() {
        return (String)readProperty(ABBREVIATION_PROPERTY);
    }

    public void setName(String name) {
        writeProperty(NAME_PROPERTY, name);
    }
    public String getName() {
        return (String)readProperty(NAME_PROPERTY);
    }

    public void addToMotors(Motor obj) {
        addToManyTarget(MOTORS_PROPERTY, obj, true);
    }
    public void removeFromMotors(Motor obj) {
        removeToManyTarget(MOTORS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Motor> getMotors() {
        return (List<Motor>)readProperty(MOTORS_PROPERTY);
    }


}