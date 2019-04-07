import java.io.File;

/**     计算以给定路径为根的文件系统部分的总磁盘使用量     */
public class diskUsage {
    private static long diskUsage(File root){
        long total = root.length();
        if (root.isDirectory()){
            for (String childname:root.list()){
                File child = new File(root,childname);
                total += diskUsage(child);
            }
        }
        System.out.println(total+"\t"+root);
        return total;
    }
}
