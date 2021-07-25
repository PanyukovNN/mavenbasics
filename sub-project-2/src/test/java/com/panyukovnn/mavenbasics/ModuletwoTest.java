package com.panyukovnn.mavenbasics;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ModuletwoTest {

    @Test
    public void testCommonsLang() {
        assertTrue(StringUtils.isNotEmpty("test string"));
    }

//    @Test
//    public void testModuleoneImport() {
//        ModuleoneEntity moduleoneEntity = new ModuleoneEntity();
//        moduleoneEntity.setId(1L);
//        moduleoneEntity.setDescription("From module one");
//
//        System.out.println(moduleoneEntity);
//    }
}
