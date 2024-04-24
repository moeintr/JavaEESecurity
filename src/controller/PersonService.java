package controller;

import javax.annotation.security.RolesAllowed;

public class PersonService {
    @RolesAllowed({"admin"})
    public void save()
    {

    }
}
