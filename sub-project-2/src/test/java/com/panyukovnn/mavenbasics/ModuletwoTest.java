package com.panyukovnn.mavenbasics;

import com.panyukovnn.mavenbasics.model.ModuleoneEntity;
import org.junit.Test;

public class ModuletwoTest {

    @Test
    public void test() {
        ModuleoneEntity moduleoneEntity = new ModuleoneEntity();
        moduleoneEntity.setId(1L);
        moduleoneEntity.setDescription("From module one");

        System.out.println(moduleoneEntity);
    }
}
