package com.im.maker.generator.main;

/**
 * 生成代码生成器压缩包
 */
public class ZipGenerator extends GenerateTemplate {

    @Override
    protected String buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
        return super.buildZip(super.buildDist(outputPath, sourceCopyDestPath, jarPath, shellOutputFilePath));
    }
}
