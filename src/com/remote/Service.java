package com.remote;

import javax.swing.*;
import java.io.Serializable;

/**
 * Created by user on 10.02.2016.
 */
public interface Service extends Serializable
{
    public JPanel getGuiPanel();
}
