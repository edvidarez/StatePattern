package com.mycompany.app;

/**
 * Created by Edmundo on 19/11/2016.
 */
class Use implements State
{
    public String use(Chain wrapper)
    {
        wrapper.set_state(new Discharge());
        System.out.println("Phone Using");
        return "Using";
    }
}

