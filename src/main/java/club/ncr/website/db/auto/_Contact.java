package club.ncr.website.db.auto;

import club.ncr.website.db.ContactAddress;
import club.ncr.website.db.ContactEmail;
import club.ncr.website.db.ContactPhone;
import club.ncr.website.db.NcrMember;
import org.apache.cayenne.CayenneDataObject;

import java.util.List;

/**
 * Class _Contact was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Contact extends CayenneDataObject {

    public static final String EXTERNAL_USER_ID_PROPERTY = "externalUserId";
    public static final String FIRST_NAME_PROPERTY = "firstName";
    public static final String ID_PROPERTY = "id";
    public static final String LAST_NAME_PROPERTY = "lastName";
    public static final String MIDDLE_NAME_PROPERTY = "middleName";
    public static final String EMAIL_ADDRESSES_PROPERTY = "emailAddresses";
    public static final String MAILING_ADDRESSES_PROPERTY = "mailingAddresses";
    public static final String MEMBER_PROPERTY = "member";
    public static final String PHONE_NUMBERS_PROPERTY = "phoneNumbers";

    public static final String ID_PK_COLUMN = "id";

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

    public void setId(Integer id) {
        writeProperty(ID_PROPERTY, id);
    }
    public Integer getId() {
        return (Integer)readProperty(ID_PROPERTY);
    }

    public void setLastName(String lastName) {
        writeProperty(LAST_NAME_PROPERTY, lastName);
    }
    public String getLastName() {
        return (String)readProperty(LAST_NAME_PROPERTY);
    }

    public void setMiddleName(String middleName) {
        writeProperty(MIDDLE_NAME_PROPERTY, middleName);
    }
    public String getMiddleName() {
        return (String)readProperty(MIDDLE_NAME_PROPERTY);
    }

    public void addToEmailAddresses(ContactEmail obj) {
        addToManyTarget(EMAIL_ADDRESSES_PROPERTY, obj, true);
    }
    public void removeFromEmailAddresses(ContactEmail obj) {
        removeToManyTarget(EMAIL_ADDRESSES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ContactEmail> getEmailAddresses() {
        return (List<ContactEmail>)readProperty(EMAIL_ADDRESSES_PROPERTY);
    }


    public void addToMailingAddresses(ContactAddress obj) {
        addToManyTarget(MAILING_ADDRESSES_PROPERTY, obj, true);
    }
    public void removeFromMailingAddresses(ContactAddress obj) {
        removeToManyTarget(MAILING_ADDRESSES_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ContactAddress> getMailingAddresses() {
        return (List<ContactAddress>)readProperty(MAILING_ADDRESSES_PROPERTY);
    }


    public void setMember(NcrMember member) {
        setToOneTarget(MEMBER_PROPERTY, member, true);
    }

    public NcrMember getMember() {
        return (NcrMember)readProperty(MEMBER_PROPERTY);
    }


    public void addToPhoneNumbers(ContactPhone obj) {
        addToManyTarget(PHONE_NUMBERS_PROPERTY, obj, true);
    }
    public void removeFromPhoneNumbers(ContactPhone obj) {
        removeToManyTarget(PHONE_NUMBERS_PROPERTY, obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<ContactPhone> getPhoneNumbers() {
        return (List<ContactPhone>)readProperty(PHONE_NUMBERS_PROPERTY);
    }


}
