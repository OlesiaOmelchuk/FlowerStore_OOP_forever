package ua.edu.ucu.apps.demo.flowerstore.users;

import lombok.Getter;
import lombok.Setter;

public class Receiver extends AppUser {
    @Getter
    @Setter
    private Status status;

    public Receiver(String email, String dob) {
        super(email, dob);
        this.status = Status.UNPROCESSED;
    }

    @Override
    public void update(Status status) {
        setStatus(status);
    }
}
