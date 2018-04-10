package club.ncr.website.db.auto;

import club.ncr.website.db.Motor;
import org.apache.cayenne.CayenneDataObject;

import java.util.List;

/**
 * Class _MotorCertOrg was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MotorCertOrg extends CayenneDataObject {

    public static final String NAME_PROPERTY = "name";
    public static final String MOTORS_PROPERTY = "motors";

    public static final String ID_PK_COLUMN = "ID";

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
