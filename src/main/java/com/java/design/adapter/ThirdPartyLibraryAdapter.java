package com.java.design.adapter;

/**
 * @Author qcl
 * @Description
 * @Date 9:59 AM 4/4/2023
 */
public class ThirdPartyLibraryAdapter implements OurLibraryInterface {
    private ThirdPartyLibrary library;

    public ThirdPartyLibraryAdapter(ThirdPartyLibrary library) {
        this.library = library;
    }

    @Override
    public void doSomething(int value) {
        library.doSomethingElse(value);
    }
}

