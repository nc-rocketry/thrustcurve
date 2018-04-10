package club.ncr.website.db.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _ClubContact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _ClubContact extends CayenneDataObject {

    public static final String ID_PROPERTY = "ID";
    public static final String CERT_ID_PROPERTY = "certId";
    public static final String FIRST_NAME_PROPERTY = "firstName";
    public static final String INITIALS_PROPERTY = "initials";
    public static final String LAST_NAME_PROPERTY = "lastName";
    public static final String MEMBER_ID_PROPERTY = "memberId";
    public static final String MIDDLE_NAME_PROPERTY = "middleName";
    public static final String NAR_MEMBER_ID_PROPERTY = "narMemberId";
    public static final String PRIMARY_ADDRESS_PROPERTY = "primaryAddress";
    public static final String PRIMARY_EMAIL_PROPERTY = "primaryEmail";
    public static final String PRIMARY_PHONE_PROPERTY = "primaryPhone";
    public static final String TRA_MEMBER_ID_PROPERTY = "traMemberId";

    public static final String ID_PK_COLUMN = "id";

    public void setID(long ID) {
        writeProperty(ID_PROPERTY, ID);
    }
    public long getID() {
        Object value = readProperty(ID_PROPERTY);
        return (value != null) ? (Long) value : 0;
    }

    public void setCertId(Integer certId) {
        writeProperty(CERT_ID_PROPERTY, certId);
    }
    public Integer getCertId() {
        return (Integer)readProperty(CERT_ID_PROPERTY);
    }

    public void setFirstName(String firstName) {
        writeProperty(FIRST_NAME_PROPERTY, firstName);
    }
    public String getFirstName() {
        return (String)readProperty(FIRST_NAME_PROPERTY);
    }

    public void setInitials(String initials) {
        writeProperty(INITIALS_PROPERTY, initials);
    }
    public String getInitials() {
        return (String)readProperty(INITIALS_PROPERTY);
    }

    public void setLastName(String lastName) {
        writeProperty(LAST_NAME_PROPERTY, lastName);
    }
    public String getLastName() {
        return (String)readProperty(LAST_NAME_PROPERTY);
    }

    public void setMemberId(Long memberId) {
        writeProperty(MEMBER_ID_PROPERTY, memberId);
    }
    public Long getMemberId() {
        return (Long)readProperty(MEMBER_ID_PROPERTY);
    }

    public void setMiddleName(String middleName) {
        writeProperty(MIDDLE_NAME_PROPERTY, middleName);
    }
    public String getMiddleName() {
        return (String)readProperty(MIDDLE_NAME_PROPERTY);
    }

    public void setNarMemberId(Long narMemberId) {
        writeProperty(NAR_MEMBER_ID_PROPERTY, narMemberId);
    }
    public Long getNarMemberId() {
        return (Long)readProperty(NAR_MEMBER_ID_PROPERTY);
    }

    public void setPrimaryAddress(Long primaryAddress) {
        writeProperty(PRIMARY_ADDRESS_PROPERTY, primaryAddress);
    }
    public Long getPrimaryAddress() {
        return (Long)readProperty(PRIMARY_ADDRESS_PROPERTY);
    }

    public void setPrimaryEmail(Long primaryEmail) {
        writeProperty(PRIMARY_EMAIL_PROPERTY, primaryEmail);
    }
    public Long getPrimaryEmail() {
        return (Long)readProperty(PRIMARY_EMAIL_PROPERTY);
    }

    public void setPrimaryPhone(Long primaryPhone) {
        writeProperty(PRIMARY_PHONE_PROPERTY, primaryPhone);
    }
    public Long getPrimaryPhone() {
        return (Long)readProperty(PRIMARY_PHONE_PROPERTY);
    }

    public void setTraMemberId(Long traMemberId) {
        writeProperty(TRA_MEMBER_ID_PROPERTY, traMemberId);
    }
    public Long getTraMemberId() {
        return (Long)readProperty(TRA_MEMBER_ID_PROPERTY);
    }

}
