package com.im.maker.generator.file;

/**
 * 核心生成器
 */
public class FileGenerator  {
//    /**
//     * 生成
//     *
//     * @param model 数据模型
//     * @throws TemplateException
//     * @throws IOException
//     */
//    public static void doGenerate(Object model) throws TemplateException, IOException {
//        String inputRootPath = "D:\\c\\project\\Project\\Code-Generator\\demo-projects\\acm-template-pro";
//        String outputRootPath = "D:\\c\\project\\Project\\Code-Generator\\im-generator-maker\\.temp";
//
//        String inputPath;
//        String outputPath;
//
//        inputPath = new File(inputRootPath, "src/com/im/acm/test.java.ftl").getAbsolutePath();
//        outputPath = new File(outputRootPath, "src/com/im/acm/MainTemplate.java").getAbsolutePath();
//
//        File outputFile = new File(outputPath).getParentFile();
//        if (!outputFile.exists()) {
//            outputFile.mkdirs();
//        }
//
//        DynamicGenerator.doGenerate(inputPath, outputPath, model);
//
//        inputPath = new File(inputRootPath, ".gitignore").getAbsolutePath();
//        outputPath = new File(outputRootPath, ".gitignore").getAbsolutePath();
//        StaticGenerator.copyFilesByHutool(inputPath, outputPath);
//
//        inputPath = new File(inputRootPath, "README.md").getAbsolutePath();
//        outputPath = new File(outputRootPath, "README.md").getAbsolutePath();
//        StaticGenerator.copyFilesByHutool(inputPath, outputPath);
//    }

//    public static void main(String[] args) throws TemplateException, IOException {
//        MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
//        mainTemplateConfig.setAuthor("hahaha");
//        mainTemplateConfig.setLoop(false);
//        mainTemplateConfig.setOutputText("这是输出：");
//
//        doGenerate(mainTemplateConfig);
//    }
}
