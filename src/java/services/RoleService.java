package services;

import dataaccess.RoleDB;
import java.util.ArrayList;
import java.util.List;
import models.Role;

public class RoleService {
    public List<Role> getAll() throws Exception {
        List<Role> roles = new ArrayList<>();
        RoleDB roleDB = new RoleDB();
        roles = roleDB.getAll();
        return roles;
    }
}