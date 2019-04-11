package method;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/***
 *遍历目录是操作文件时的一个常见需求。比如写一个程序，需要找到并处理指定目录下的所有JS文件时，就需要遍历整个目录。
 * 该项目教会你如何使用流式编程和lambda表达式，帮助你进一步熟悉java8特性，并且通过它实现目录遍历。
 */

public class WalkFile {
    public static void main(String[] args) throws IOException{
        Path start = FileSystems.getDefault().getPath("E:\\2ccef887ff7564a62fd290a2e8");
        Files.walk(start)
                .filter(path -> path.toFile().isFile())
                .filter(path -> path.toString().endsWith(".bmp"))
                .forEach(System.out::println);
    }
}
