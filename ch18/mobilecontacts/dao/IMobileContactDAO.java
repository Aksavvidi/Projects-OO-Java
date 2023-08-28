package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {

    /**
     *  Inserts a new {@link MobileContact} instance in the Datasource.
     *
     * @param mobileContact
     *         the model object that contains the mobile contact data.
     * @return the resulting {@link MobileContact}
     */
    MobileContact insert(MobileContact mobileContact);
    /**
     *  Updates a {@link MobileContact} from the Datasource.
     *
     * @param mobileContact
     *         the model object that contains the mobile contact data.
     * @return the resulting {@link MobileContact}
     */
    MobileContact update(MobileContact mobileContact);

    /**
     *  Removes a {@link MobileContact} from the Datasource.
     *
     * @param phoneNumber
     *         the phone-number of the {@link MobileContact} needed to
     *         be removed.
     */
    void delete(String phoneNumber);

    /**
     * Removes a {@link MobileContact} from the Datasource by id
     * @param id
     *      the id  {@link MobileContact} needed to be removed.
     */
    void delete(Long id);

    /**
     * Returns a {@link MobileContact} based on the input id.
     *
     * @param id
     *      the {@link MobileContact#id} to be returned.
     * @return
     *      the resulting {@link MobileContact}
     */
    MobileContact get(Long id);

    /**
     * Returns a {@link MobileContact} instance from the datasource
     * based on the input phone number.
     *
     * @param phoneNumber
     *      the {@link MobileContact#phoneNumber} to be returned.
     * @return
     *      the resulting {@link MobileContact}
     */
    MobileContact get(String phoneNumber);

    /**
     * Returns all the {@link MobileContact} instances from the datasource.
     * @return
     *      the resulting {@link MobileContact}
     *
     */
    List<MobileContact> getAll();   //SELECT * FROM <MobileContacts>

    /**
     * Checks if a phone number already exists in the
     * datasource as part of a {@link MobileContact}.
     *
     * @param phoneNumber
     *      the <code>phone number</code> to be searched.
     * @return
     *      true if the <code>phone number</code> exists in a
     *      {@link MobileContact} in datasource.
     */
    boolean phoneNumberExists(String phoneNumber);

    /**
     * Checks if an <code>id</code> already exists in the
     *      * datasource as part of a {@link MobileContact}.
     * @param id
     *      the <code>id</code> to be searched.
     * @return
     *      true if the <code>id</code> exists as part of a
     *      *      {@link MobileContact} in datasource.
     */
    boolean userIdExists(Long id);
}
