package com.course.OOP;

public enum RoleType {
    ADMIN("Admin", true, true, true, true),
    MAINCUSTOMER("Main Customer", true, true, true, false),
    CUSTOMER("Customer", true, false, true, false),
    VIEWER("Viewer", true, false, false, false);
    String roleName;
    private boolean viewAll = false;
    private boolean editAll = false;
    private boolean addAll = false;
    private boolean deleteAll = false;

    RoleType(String roleName, boolean viewAll, boolean editAll, boolean addAll, boolean deleteAll) {
        this.roleName = roleName;
        this.viewAll = viewAll;
        this.editAll = editAll;
        this.addAll = addAll;
        this.deleteAll = deleteAll;
    }

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

    public String getRoleName() {
        return this.roleName;
    }

}
