package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

/**
 * Represent storage for address book data
 */
public interface Storage {

    /**
     * Saves all data to this storage.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data.
     */
    void save(AddressBook addressBook) throws StorageOperationException;

    /**
     * Loads data from this storage.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data.
     */
    AddressBook load() throws StorageOperationException;

    String getPath();

}