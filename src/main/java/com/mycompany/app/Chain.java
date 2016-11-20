package com.mycompany.app;

/**
 * Created by Edmundo on 19/11/2016.
 */

public class Chain
{
    private State current_state;

    public Chain()
    {
        current_state = new Off();
    }
    public void set_state(State s)
    {
        current_state = s;
    }
    public String use()
    {
        return current_state.use(this);
    }
}