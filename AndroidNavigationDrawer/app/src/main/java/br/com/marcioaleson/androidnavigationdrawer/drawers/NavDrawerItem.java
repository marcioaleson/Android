package br.com.marcioaleson.androidnavigationdrawer.drawers;

public class NavDrawerItem {


    public String title;
    public int icon;

    public NavDrawerItem() {

    }

    public NavDrawerItem(int icon, String title) {

        this.icon = icon;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}