package com.java.design.adapter;

/**
 * @Author qcl
 * @Description 适配器模式
 * @Date 9:57 AM 4/4/2023
 */
public class AdapterTest {
    public static void main(String[] args) {
        // 创建第三方库实例
        ThirdPartyLibrary library = new ThirdPartyLibrary();

        // 创建适配器实例
        OurLibraryInterface adapter = new ThirdPartyLibraryAdapter(library);

        // 在客户端代码中使用适配器
        adapter.doSomething(42);
    }
}
