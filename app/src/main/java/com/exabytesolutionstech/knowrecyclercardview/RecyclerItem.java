package com.exabytesolutionstech.knowrecyclercardview;


public class RecyclerItem {
    private String fullname;
    private String lastname;

    public RecyclerItem(String fullname, String lastname) {
        this.fullname = fullname;
        this.lastname = lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
