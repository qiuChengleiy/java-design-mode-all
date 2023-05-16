package com.java.design.dependency;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author qcl
 * @Description
 * @Date 11:12 AM 5/16/2023
 */
public class Container {
    private Map<String, Object> beans = new HashMap<>();
    public void register(String beanName, Object bean) {
        beans.put(beanName, bean);
    }
    public Object getBean(String beanName) {
        Object object = beans.get(beanName);
        // 获取对象的所有属性
        Field[] fields = object.getClass().getDeclaredFields();
        // 遍历属性，注入依赖的对象
        for (Field field : fields) {
            if (field.isAnnotationPresent(Autowired.class)) {
                String fieldName = field.getName();
                Object dependency = getBean(fieldName);
                if (dependency != null) {
                    try {
                        field.setAccessible(true);
                        field.set(object, dependency);
                    } catch (IllegalAccessException e) {
                        // handle exception
                    }
                }
            }
        }
        return object;
    }
}
