package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final String ADDRESS_DELIMITER = ", ";
    public static final int ADDRESS_PART_INDEX_BLOCK = 0;
    public static final int ADDRESS_PART_INDEX_STREET = 1;
    public static final int ADDRESS_PART_INDEX_UNIT = 2;
    public static final int ADDRESS_PART_INDEX_POSTAL = 3;
   
    private boolean isPrivate;
    
    private Block block;
    private Street street;
    private Unit unit;
    private Postal postal;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressParts = trimmedAddress.split(ADDRESS_DELIMITER);
        block = new Block(addressParts[ADDRESS_PART_INDEX_BLOCK]);
        street = new Street(addressParts[ADDRESS_PART_INDEX_STREET]);
        unit = new Unit(addressParts[ADDRESS_PART_INDEX_UNIT]);
        postal = new Postal(addressParts[ADDRESS_PART_INDEX_POSTAL]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return block.getValue() + ADDRESS_DELIMITER +
                street.getValue() + ADDRESS_DELIMITER +
                unit.getValue() + ADDRESS_DELIMITER +
                postal.getValue() + ADDRESS_DELIMITER;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
