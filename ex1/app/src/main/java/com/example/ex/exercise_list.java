package com.example.ex;

public class exercise_list {
    private String name;
    private int set;

    public exercise_list(String e_name, int setnum)
    {
        name = new String(e_name);
        set = setnum;
    }

    public String get_name()
    {
        return name;
    }

    public int get_set()
    {
        return set;
    }

    public void set_set(int num)
    {
        set = num;
    }

}
