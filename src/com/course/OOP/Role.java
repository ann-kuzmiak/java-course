package com.course.OOP;

import com.course.OOP.exceptions.InvalidRoleException;

public class Role {
    private String role;
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public Role(String role) throws InvalidRoleException {
        switch (role) {
            case "Admin":
                this.role = role;
                viewAll = true;
                addAll = true;
                editAll = true;
                deleteAll = true;
                break;
            case "Main Customer":
                this.role = role;
                viewAll = true;
                addAll = true;
                editAll = true;
                break;
            case "Customer":
                this.role = role;
                viewAll = true;
                addAll = true;
                break;
            case "Viewer":
                this.role = role;
                viewAll = true;
                break;
            default:
                throw new InvalidRoleException();
        }
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                ", viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}
