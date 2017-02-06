package seedu.addressbook.data.person;
/**
 * Represents an Address' street number.
 * 
 */
public class Street {
  
    private String value_;
    
    public Street(String value){
        value_ = value;
    }
    
    public void setValue(String value){
        value_ = value;
    }
    
    public String getValue(){
        return value_;
    }
}
