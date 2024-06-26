package org.guanzon.cas.validators.client.individual;

import org.guanzon.cas.validators.client.*;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.Model_Client_Mail;
import org.guanzon.cas.model.clients.Model_Client_Master;
import org.guanzon.cas.model.clients.Model_Client_Mobile;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Client_Mail implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Mail poEntity;
    
    public Validator_Client_Mail(Object foValue){
        poEntity = (Model_Client_Mail) foValue;
    }
    
    @Override
    public void setGRider(GRider foValue) {
//        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {

        
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getEmailID().isEmpty()){
            psMessage = "Email ID is not set.";
            return false;
        }
        if (poEntity.getEmail().isEmpty()){
            psMessage = "Email is not set.";
            return false;
        }
        
        return true;
    }

    @Override
    public String getMessage() {
        return psMessage;
    }
}
