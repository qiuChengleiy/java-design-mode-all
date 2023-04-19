package com.java.design.command.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:38 AM 4/19/2023
 */
public interface OrderCommand {
    void execute();
    void undo();
}
