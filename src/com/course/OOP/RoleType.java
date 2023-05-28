package com.course.OOP;

public enum RoleType {
    ADMIN("Admin"), MAINCUSTOMER("Main Customer"), CUSTOMER("Customer"), VIEWER("Viewer");
    String roleName;

    public boolean isViewAll() {
        return viewAll;
    }

    public boolean isEditAll() {
        return editAll;
    }

    public boolean isAddAll() {
        return addAll;
    }

    public boolean isDeleteAll() {
        return deleteAll;
    }

    private boolean viewAll = false;
    private boolean editAll = false;
    private boolean addAll = false;
    private boolean deleteAll = false;

    RoleType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void assignPermissions() {
        switch (this) {
            case ADMIN -> {
                viewAll = true;
                editAll = true;
                addAll = true;
                deleteAll = true;
            }
            case MAINCUSTOMER -> {
                viewAll = true;
                addAll = true;
                editAll = true;
            }
            case CUSTOMER -> {
                viewAll = true;
                addAll = true;
            }
            case VIEWER -> viewAll = true;
        }
    }
}
