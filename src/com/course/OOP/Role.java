package com.course.OOP;

public class Role {
    RoleType roleType;
    private String role;
    private boolean viewAll = roleType.isViewAll();
    private boolean editAll = roleType.isEditAll();
    private boolean addAll = roleType.isAddAll();
    private boolean deleteAll = roleType.isDeleteAll();

    public Role(String role) {
        roleType = switch (role) {
            case "Admin" -> RoleType.ADMIN;
            case "Main Customer" -> RoleType.MAINCUSTOMER;
            case "Customer" -> RoleType.CUSTOMER;
            case "Viewer" -> RoleType.VIEWER;
        };
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
