package com.mycompany.app;

/**
 * Created by Edmundo on 19/11/2016.
 */
public class On implements State{
    public String use(Chain wrapper)
    {
        wrapper.set_state(new Use());
        System.out.println("Phone Turing On");
        return "On";
    }
}
