package seedu.addressbook.data.person;

/**
 * Parent class for Contact details (eg Address, Email, Phone)
 */
public abstract class Contact {

    protected String value; // Question: what happens if i dont make it final? i can't
    protected boolean isPrivate;

    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
}
