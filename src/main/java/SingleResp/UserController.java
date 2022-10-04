package SingleResp;

import java.io.IOException;

public class UserController {
    private Store store = new Store() ;
    // Create a new user
    public String createUser (String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue ( userJson , User.class ) ;
    }
   if ( ! isValidUser ( user ) ) {
        return " ERROR " ;
    }
    store.store ( user ) ;
    return " SUCCESS " ;
    // Validates the user object
    private boolean isValidUser ( User user ) {
        if ( ! isPresent ( user.getName ( ) ) ) {
            return false ;
        }
        user.setName ( user.getName ( ) . trim ( ) ) ;
        if ( ! isValidAlphaNumeric ( user.getName ( ) ) ) {
}
