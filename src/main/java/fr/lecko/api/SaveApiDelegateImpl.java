package fr.lecko.api;

import fr.lecko.actor.MailActor;
import fr.lecko.contract.save_microsoft_graph.api.SaveApiDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class SaveApiDelegateImpl implements SaveApiDelegate {

    @Autowired
    MailActor mailActor;

    @Override
    public ResponseEntity<Void> save(String userMail) {
        mailActor.save(userMail);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
