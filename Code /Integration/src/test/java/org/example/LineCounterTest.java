//package org.example;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//public class LineCounterTest {
//    private File tempDirectory;
//
//    @BeforeEach
//    void setUp() throws IOException {
//        // Create a temporary directory
//        tempDirectory = new File(System.getProperty("java.io.tmpdir"), "testLineCounter");
//        if (!tempDirectory.exists()) {
//            tempDirectory.mkdir();
//        }
//
//        // Add some Java files
//        createFileWithContent(new File(tempDirectory, "File1.java"), "public class File1 {\n    public static void main(String[] args) {}\n}");
//        createFileWithContent(new File(tempDirectory, "File2.java"), "public class File2 {\n    // Comment line\n}");
//
//        // Add a non-Java file
//        createFileWithContent(new File(tempDirectory, "README.txt"), "This is a text file.");
//
//        // Create a subdirectory with more Java files
//        File subDir = new File(tempDirectory, "subDir");
//        subDir.mkdir();
//        createFileWithContent(new File(subDir, "File3.java"), "public class File3 {\n}");
//    }
//
//    @AfterEach
//    void tearDown() {
//        deleteDirectory(tempDirectory);
//    }
//
//    @Test
//    void testCountLinesInDirectory() {
//        // Call the method
//        int totalLines = LineCounter.countLinesInDirectory(tempDirectory);
//
//        // Verify the result
//        assertEquals(5, totalLines); // 3 files with 5 total lines in .java files
//    }
//
//    @Test
//    void testCountLinesInFile() throws IOException {
//        // Create a sample file
//        File file = new File(tempDirectory, "TestFile.java");
//        createFileWithContent(file, "public class TestFile {\n    // Line 2\n}");
//
//        // Call the method
//        int lines = LineCounter.countLinesInFile(file);
//
//        // Verify the result
//        assertEquals(2, lines); // 2 lines in the file
//    }
//
//    // Helper methods
//    private void createFileWithContent(File file, String content) throws IOException {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
//            writer.write(content);
//        }
//    }
//
//    private void deleteDirectory(File directory) {
//        File[] files = directory.listFiles();
//        if (files != null) {
//            for (File file : files) {
//                if (file.isDirectory()) {
//                    deleteDirectory(file);
//                } else {
//                    file.delete();
//                }
//            }
//        }
//        directory.delete();
//    }
//}
