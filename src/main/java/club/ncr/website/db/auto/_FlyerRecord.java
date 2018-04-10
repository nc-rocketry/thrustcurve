package club.ncr.website.db.auto;

import club.ncr.website.db.FlightLog;
import org.apache.cayenne.CayenneDataObject;

import java.util.Date;

/**
 * Class _FlyerRecord was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _FlyerRecord extends CayenneDataObject {

    public static final String ADDRESS1_PROPERTY = "address1";
    public static final String ADDRESS2_PROPERTY = "address2";
    public static final String ADDRESS_CITY_PROPERTY = "addressCity";
    public static final String ADDRESS_STATE_PROPERTY = "addressState";
    public static final String ADDRESS_ZIP_PROPERTY = "addressZip";
    public static final String AFFILIATION_PROPERTY = "affiliation";
    public static final String AGE_PROPERTY = "age";
    public static final String CERT_LEVEL_PROPERTY = "certLevel";
    public static final String CONTACT_ID_PROPERTY = "contactId";
    public static final String CREATED_DATE_PROPERTY = "createdDate";
    public static final String DUES_PAID_PROPERTY = "duesPaid";
    public static final String DUES_PAID_DATE_PROPERTY = "duesPaidDate";
    public static final String EMAIL_ADDRESS_PROPERTY = "emailAddress";
    public static final String EXTERNAL_USER_ID_PROPERTY = "externalUserId";
    public static final String FIRST_NAME_PROPERTY = "firstName";
    public static final String HOME_PHONE_PROPERTY = "homePhone";
    public static final String ID_PROPERTY = "id";
    public static final String LAST_NAME_PROPERTY = "lastName";
    public static final String LCO_INITIALS_PROPERTY = "lcoInitials";
    public static final String MEMBER_TYPE_PROPERTY = "memberType";
    public static final String MIDDLE_INITIAL_PROPERTY = "middleInitial";
    public static final String MIGRATION_ID_PROPERTY = "migrationId";
    public static final String MOBILE_PHONE_PROPERTY = "mobilePhone";
    public static final String NAR_NUMBER_PROPERTY = "narNumber";
    public static final String NOTES_PROPERTY = "notes";
    public static final String PAID_THRU_PROPERTY = "paidThru";
    public static final String PAID_THRU_DATE_PROPERTY = "paidThruDate";
    public static final String POST_EMAIL_PROPERTY = "postEmail";
    public static final String TRIPOLI_NUMBER_PROPERTY = "tripoliNumber";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String USERNAME_PROPERTY = "username";
    public static final String WORK_PHONE_PROPERTY = "workPhone";
    public static final String FLIGHTS_PROPERTY = "flights";

    public static final String ID_PK_COLUMN = "id";

    public void setAddress1(String address1) {
        writeProperty(ADDRESS1_PROPERTY, address1);
    }
    public String getAddress1() {
        return (String)readProperty(ADDRESS1_PROPERTY);
    }

    public void setAddress2(String address2) {
        writeProperty(ADDRESS2_PROPERTY, address2);
    }
    public String getAddress2() {
        return (String)readProperty(ADDRESS2_PROPERTY);
    }

    public void setAddressCity(String addressCity) {
        writeProperty(ADDRESS_CITY_PROPERTY, addressCity);
    }
    public String getAddressCity() {
        return (String)readProperty(ADDRESS_CITY_PROPERTY);
    }

    public void setAddressState(String addressState) {
        writeProperty(ADDRESS_STATE_PROPERTY, addressState);
    }
    public String getAddressState() {
        return (String)readProperty(ADDRESS_STATE_PROPERTY);
    }

    public void setAddressZip(String addressZip) {
        writeProperty(ADDRESS_ZIP_PROPERTY, addressZip);
    }
    public String getAddressZip() {
        return (String)readProperty(ADDRESS_ZIP_PROPERTY);
    }

    public void setAffiliation(String affiliation) {
        writeProperty(AFFILIATION_PROPERTY, affiliation);
    }
    public String getAffiliation() {
        return (String)readProperty(AFFILIATION_PROPERTY);
    }

    public void setAge(Short age) {
        writeProperty(AGE_PROPERTY, age);
    }
    public Short getAge() {
        return (Short)readProperty(AGE_PROPERTY);
    }

    public void setCertLevel(Short certLevel) {
        writeProperty(CERT_LEVEL_PROPERTY, certLevel);
    }
    public Short getCertLevel() {
        return (Short)readProperty(CERT_LEVEL_PROPERTY);
    }

    public void setContactId(Integer contactId) {
        writeProperty(CONTACT_ID_PROPERTY, contactId);
    }
    public Integer getContactId() {
        return (Integer)readProperty(CONTACT_ID_PROPERTY);
    }

    public void setCreatedDate(Date createdDate) {
        writeProperty(CREATED_DATE_PROPERTY, createdDate);
    }
    public Date getCreatedDate() {
        return (Date)readProperty(CREATED_DATE_PROPERTY);
    }

    public void setDuesPaid(String duesPaid) {
        writeProperty(DUES_PAID_PROPERTY, duesPaid);
    }
    public String getDuesPaid() {
        return (String)readProperty(DUES_PAID_PROPERTY);
    }

    public void setDuesPaidDate(Date duesPaidDate) {
        writeProperty(DUES_PAID_DATE_PROPERTY, duesPaidDate);
    }
    public Date getDuesPaidDate() {
        return (Date)readProperty(DUES_PAID_DATE_PROPERTY);
    }

    public void setEmailAddress(String emailAddress) {
        writeProperty(EMAIL_ADDRESS_PROPERTY, emailAddress);
    }
    public String getEmailAddress() {
        return (String)readProperty(EMAIL_ADDRESS_PROPERTY);
    }

    public void setExternalUserId(Integer externalUserId) {
        writeProperty(EXTERNAL_USER_ID_PROPERTY, externalUserId);
    }
    public Integer getExternalUserId() {
        return (Integer)readProperty(EXTERNAL_USER_ID_PROPERTY);
    }

    public void setFirstName(String firstName) {
        writeProperty(FIRST_NAME_PROPERTY, firstName);
    }
    public String getFirstName() {
        return (String)readProperty(FIRST_NAME_PROPERTY);
    }

    public void setHomePhone(String homePhone) {
        writeProperty(HOME_PHONE_PROPERTY, homePhone);
    }
    public String getHomePhone() {
        return (String)readProperty(HOME_PHONE_PROPERTY);
    }

    public void setId(Long id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Long getId() {
        return (Long)readProperty(ID_PROPERTY);
    }

    public void setLastName(String lastName) {
        writeProperty(LAST_NAME_PROPERTY, lastName);
    }
    public String getLastName() {
        return (String)readProperty(LAST_NAME_PROPERTY);
    }

    public void setLcoInitials(String lcoInitials) {
        writeProperty(LCO_INITIALS_PROPERTY, lcoInitials);
    }
    public String getLcoInitials() {
        return (String)readProperty(LCO_INITIALS_PROPERTY);
    }

    public void setMemberType(Short memberType) {
        writeProperty(MEMBER_TYPE_PROPERTY, memberType);
    }
    public Short getMemberType() {
        return (Short)readProperty(MEMBER_TYPE_PROPERTY);
    }

    public void setMiddleInitial(String middleInitial) {
        writeProperty(MIDDLE_INITIAL_PROPERTY, middleInitial);
    }
    public String getMiddleInitial() {
        return (String)readProperty(MIDDLE_INITIAL_PROPERTY);
    }

    public void setMigrationId(Integer migrationId) {
        writeProperty(MIGRATION_ID_PROPERTY, migrationId);
    }
    public Integer getMigrationId() {
        return (Integer)readProperty(MIGRATION_ID_PROPERTY);
    }

    public void setMobilePhone(String mobilePhone) {
        writeProperty(MOBILE_PHONE_PROPERTY, mobilePhone);
    }
    public String getMobilePhone() {
        return (String)readProperty(MOBILE_PHONE_PROPERTY);
    }

    public void setNarNumber(String narNumber) {
        writeProperty(NAR_NUMBER_PROPERTY, narNumber);
    }
    public String getNarNumber() {
        return (String)readProperty(NAR_NUMBER_PROPERTY);
    }

    public void setNotes(String notes) {
        writeProperty(NOTES_PROPERTY, notes);
    }
    public String getNotes() {
        return (String)readProperty(NOTES_PROPERTY);
    }

    public void setPaidThru(String paidThru) {
        writeProperty(PAID_THRU_PROPERTY, paidThru);
    }
    public String getPaidThru() {
        return (String)readProperty(PAID_THRU_PROPERTY);
    }

    public void setPaidThruDate(Date paidThruDate) {
        writeProperty(PAID_THRU_DATE_PROPERTY, paidThruDate);
    }
    public Date getPaidThruDate() {
        return (Date)readProperty(PAID_THRU_DATE_PROPERTY);
    }

    public void setPostEmail(String postEmail) {
        writeProperty(POST_EMAIL_PROPERTY, postEmail);
    }
    public String getPostEmail() {
        return (String)readProperty(POST_EMAIL_PROPERTY);
    }

    public void setTripoliNumber(String tripoliNumber) {
        writeProperty(TRIPOLI_NUMBER_PROPERTY, tripoliNumber);
    }
    public String getTripoliNumber() {
        return (String)readProperty(TRIPOLI_NUMBER_PROPERTY);
    }

    public void setUserId(Integer userId) {
        writeProperty(USER_ID_PROPERTY, userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty(USER_ID_PROPERTY);
    }

    public void setUsername(String username) {
        writeProperty(USERNAME_PROPERTY, username);
    }
    public String getUsername() {
        return (String)readProperty(USERNAME_PROPERTY);
    }

    public void setWorkPhone(String workPhone) {
        writeProperty(WORK_PHONE_PROPERTY, workPhone);
    }
    public String getWorkPhone() {
        return (String)readProperty(WORK_PHONE_PROPERTY);
    }

    public void setFlights(FlightLog flights) {
        setToOneTarget(FLIGHTS_PROPERTY, flights, true);
    }

    public FlightLog getFlights() {
        return (FlightLog)readProperty(FLIGHTS_PROPERTY);
    }


}
