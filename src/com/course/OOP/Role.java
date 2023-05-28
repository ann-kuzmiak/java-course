package com.course.OOP;

import com.course.OOP.exceptions.InvalidRoleException;

public class Role {
    RoleType roleType;
    private boolean viewAll;
    private boolean editAll;
    private boolean addAll;
    private boolean deleteAll;

    public Role(String role) throws InvalidRoleException {
        roleType = switch (role) {
            case "Admin" -> RoleType.ADMIN;
            case "Main Customer" -> RoleType.MAINCUSTOMER;
            case "Customer" -> RoleType.CUSTOMER;
            case "Viewer" -> RoleType.VIEWER;
            default -> throw new InvalidRoleException();
        };
        roleType.assignPermissions();
        viewAll = roleType.isViewAll();
        editAll = roleType.isEditAll();
        addAll = roleType.isAddAll();
        deleteAll = roleType.isDeleteAll();
    }
    public String getRole() {
        return roleType.getRoleName();
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + getRole() + '\'' +
                ", viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}
