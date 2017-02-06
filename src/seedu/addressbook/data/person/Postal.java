package seedu.addressbook.data.person;
/**
 * Represents an Address' postal number.
 * 
 */
public class Postal {
    private String value_;
    
    public Postal(String value){
        value_ = value;
    }
    
    public void setValue(String value){
        value_ = value;
    }
    
    public String getValue(){
        return value_;
    }
}
