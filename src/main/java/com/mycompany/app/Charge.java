package com.mycompany.app;

/**
 * Created by Edmundo on 19/11/2016.
 */
class Charge implements State
{
    public String use(Chain wrapper)
    {
        wrapper.set_state(new On());
        System.out.println("Phone Charging");
        return "Charging";
    }
}
