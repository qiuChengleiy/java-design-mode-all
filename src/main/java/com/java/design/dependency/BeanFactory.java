package com.java.design.dependency;

/**
 * @Author qcl
 * @Description
 * @Date 11:12 AM 5/16/2023
 */
public class BeanFactory {
    public static Object getBean(String className) {
        Object object = null;
        try {
            Class clazz = Class.forName(className);
            object = clazz.newInstance();
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
        return object;
    }
}
