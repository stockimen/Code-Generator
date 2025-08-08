package com.im.generator;

import cn.hutool.core.io.FileUtil;

import java.io.File;

public class StaticGenerator {

    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     *
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

    public static void main(String[] args) {
        // 获得项目路径
        String projectDir = System.getProperty("user.dir");
        File parentFile = new File(projectDir).getParentFile();

        //输入路径
        String inputPath = new File(parentFile, "demo-projects/acm-template").getAbsolutePath();

        // 输出路径
        String outputPath = projectDir + "/.temp";
        copyFilesByHutool(inputPath, outputPath);

    }
}
