package seedu.addressbook.data.person;

/**
 * Represents an Address' unit number.
 * 
 */
public class Unit {
    
    private String value_;
    
    public Unit(String value){
        value_ = value;
    }
    
    public void setValue(String value){
        value_ = value;
    }
    
    public String getValue(){
        return value_;
    }
}
