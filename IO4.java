import java.io.*;

public class ImageCopier {
    public static void main(String[] args) throws IOException {
        // Change file paths as needed
        String source = "source.jpg";
        String destWithoutBuffer = "copy_without_buffer.jpg";
        String destWithBuffer = "copy_with_buffer.jpg";

        // Copy without buffer
        long start1 = System.currentTimeMillis();
        copyWithoutBuffer(source, destWithoutBuffer);
        long end1 = System.currentTimeMillis();
        System.out.println("Time without buffering: " + (end1 - start1) + " ms");

        // Copy with buffer
        long start2 = System.currentTimeMillis();
        copyWithBuffer(source, destWithBuffer);
        long end2 = System.currentTimeMillis();
        System.out.println("Time with buffering   : " + (end2 - start2) + " ms");
    }

    // Method 1: Without buffer
    public static void copyWithoutBuffer(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        int byteData;
        while ((byteData = fis.read()) != -1) {
            fos.write(byteData);
        }

        fis.close();
        fos.close();
    }

    // Method 2: With buffer
    public static void copyWithBuffer(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        int byteData;
        while ((byteData = bis.read()) != -1) {
            bos.write(byteData);
        }

        bis.close();
        bos.close();
    }
}
