package cn.gym.mgt.leecodeAssessment;

import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class MovingFiles {
    public static final String DUPLICATE = "Duplicate";
    static int count = 0;
    static int duplicatedFileCount = 0;

    static String DESTINATIONDIR = "D:\\Program Files\\1npm_cache\\1921jk\\玩具";
    static String PATHNAME = "D:\\Program Files\\1npm_cache\\1921jk\\";

    public static void main(String[] args) {
        if (args.length != 0) {

        } else {
            try {
                MovingFiles.traverseFileFolders(PATHNAME, false);
            } catch (IOException e) {
                System.out.println("Failed");
                e.printStackTrace();
            }
            System.out.println("Total files: " + count);
            System.out.println("Total file name contains duplicate: " + duplicatedFileCount);
        }

    }


    public static void traverseFileFolders(String path, boolean movingDir) throws IOException {
        path = StrUtil.trim(path);

        if (path == null) return;

        File file = new File(path);

        if (!file.exists()) return;

        if (file.isFile()) {
            if (movingDir) {
                Path sourcePath = Paths.get(file.getAbsolutePath());
                Path targetPath = Paths.get(DESTINATIONDIR + "\\" + file.getName());
                try {
                    Files.move(sourcePath, targetPath);
                } catch (FileAlreadyExistsException e) {
                    fileAlreadyExist(file, movingDir);
                }
                System.out.print("Moving : " + file.getName() + " FROM ");
                System.out.println(file.getAbsolutePath());
            } else if (file.getName().contains(DUPLICATE)) {
                renameDuplicateFileName(file);
            }
            count++;

            return;
        }
        File[] files = file.listFiles();

        for (File each : files) {
            String eachPath = each.getAbsolutePath();
            traverseFileFolders(eachPath, movingDir);
        }

    }

    private static void renameDuplicateFileName(File file) {

        String fileAbsolutePath = file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf("\\") + 1);
        String fileName = file.getName();
        String newFileName = fileName;
        if (fileName.contains(DUPLICATE)) {
            duplicatedFileCount++;

            while (newFileName.contains(DUPLICATE)) {
                Random random = new Random();
                String i = Integer.toString(random.nextInt(10) + 1);
                newFileName = newFileName.replaceFirst(DUPLICATE, i);
            }

            if (!newFileName.equals(fileName)) {

                System.out.println("Renaming file from " + fileName + " To" + fileAbsolutePath + newFileName);
                System.out.println("-----------------------------------------------------");

                file.renameTo(new File(fileAbsolutePath + newFileName));
            }
        }
    }

    private static void fileAlreadyExist(File file, boolean movingDir) throws IOException {
        Path sourcePath;
        Path targetPath;
        String extensionFileName = file.getName().substring(file.getName().lastIndexOf(".") + 1);
        String newPathName = file.getName().substring(0, file.getName().lastIndexOf("."));
        String absSourcePathFile = newPathName + DUPLICATE + "." + extensionFileName;
        File destRenamedFile = new File(absSourcePathFile);
        file.renameTo(destRenamedFile);

        sourcePath = Paths.get(absSourcePathFile);
        targetPath = Paths.get(DESTINATIONDIR + "\\" + destRenamedFile.getName());
        try {
            Files.move(sourcePath, targetPath);
        } catch (FileAlreadyExistsException e) {
            traverseFileFolders(destRenamedFile.getAbsolutePath(), movingDir);
        }
        System.out.println(file.getName() + " Duplicated." + extensionFileName);
    }
}