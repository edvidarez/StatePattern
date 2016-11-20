package com.mycompany.app;

/**
 * Created by Edmundo on 19/11/2016.
 */
class Discharge implements State
{
    public String use(Chain wrapper)
    {
        wrapper.set_state(new Off());
        System.out.println("Phone Discharging");
        return "Discharging";
    }
}
