package com.im.maker.generator;

import java.io.*;

public class JarGenerator {

    public static void doGenerate(String projectPath) throws IOException, InterruptedException {
        // 不同操作系统的打包命令
        String winMavenCommand = "mvn.cmd clean package -DskipTests=true";
        String otherMavenCommand = "mvn clean package -DskipTests=true";
        String mavenCommand = System.getProperty("os.name").toLowerCase().contains("win")
                ? winMavenCommand
                : otherMavenCommand;

        // 拆分
        ProcessBuilder pb = new ProcessBuilder(mavenCommand.split(" "));
        pb.directory(new File(projectPath));

        Process process = pb.start();

        // 读取命令的输出
        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        // 等待命令执行完成
        int exitCode = process.waitFor();
        System.out.println("Exit code: " + exitCode);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        doGenerate("D:\\Desktop\\本学期记录\\Project\\Project-Code-Generator\\im-generator-maker\\generated\\acm-template-pro-generator");
    }
}
