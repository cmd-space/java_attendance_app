package com.example.skarshon.attendanceapp.models;

/**
 * Created by skarshon on 7/22/15.
 */
public class DrawerItem {
    private String ItemName;
    private int ImgResId;

    public DrawerItem(String name, int icon) {
        this.ItemName = name;
        this.ImgResId = icon;
    }

    public int getImgResId() {
        return ImgResId;
    }

    public void setImgResId(int imgResId) {
        ImgResId = imgResId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }
}
