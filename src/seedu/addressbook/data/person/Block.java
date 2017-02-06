package seedu.addressbook.data.person;
/**
 * Represents an Address' block number.
 * 
 */
public class Block {

    private String value_;
    
    public Block(String value){
        value_ = value;
    }
    
    public void setValue(String value){
        value_ = value;
    }
    
    public String getValue(){
        return value_;
    }
    
}
