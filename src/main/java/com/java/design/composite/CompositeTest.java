package com.java.design.composite;

/**
 * @Author qcl
 * @Description 组合模式
 * @Date 10:07 AM 4/7/2023
 */
public class CompositeTest {
    public static void main(String[] args) throws Exception {
        // 构建组织机构的层级结构
        Composite root = new Composite("公司");
        Composite department1 = new Composite("部门1");
        Composite department2 = new Composite("部门2");
        Composite subDepartment1 = new Composite("子部门1");
        Leaf employee1 = new Leaf("员工1");
        Leaf employee2 = new Leaf("员工2");
        Leaf employee3 = new Leaf("员工3");

        root.add(department1);
        root.add(department2);
        department1.add(subDepartment1);
        subDepartment1.add(employee1);
        subDepartment1.add(employee2);
        department2.add(employee3);

        // 展示组织机构的层级结构
        root.show();
    }
}
