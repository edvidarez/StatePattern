package com.mycompany.app;

/**
 * Created by Edmundo on 17/11/2016.
 */
class Off implements State

{
    String current_state = "";
    public String use(Chain wrapper)
    {
        wrapper.set_state(new Charge());
        System.out.println("Phone off");
        return "Off";
    }
}